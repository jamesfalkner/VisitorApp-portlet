
package com.visitorapp.portlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.visitorapp.model.Customer;
import com.visitorapp.model.CustomerStoreVisit;
import com.visitorapp.model.StoreLocation;
import com.visitorapp.service.CustomerLocalServiceUtil;
import com.visitorapp.service.CustomerStoreVisitLocalServiceUtil;
import com.visitorapp.service.StoreLocationLocalServiceUtil;

public class VisitorPortlet extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest req, ResourceResponse resp)
		throws IOException, PortletException {

		JSONArray result = JSONFactoryUtil.createJSONArray();
		// [ {name: "name", address: "address", visits: [ {customerName:"name",
		// customerEmail: "email", customerPic: "url", visitCount:234,
		// lastVisitDate: "date"}, ... ]}, ... ]

		try {

			List<StoreLocation> allStores =
				StoreLocationLocalServiceUtil.getStoreLocations(
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			List<Customer> allCustomers =
				CustomerLocalServiceUtil.getCustomers(
					QueryUtil.ALL_POS, QueryUtil.ALL_POS);
			
			for (StoreLocation store : allStores) {
				JSONObject storeVisitRecord = JSONFactoryUtil.createJSONObject();
				System.out.println("processing store: " + store.getName());
				
				List<Long> allCids = new ArrayList<Long>(allCustomers.size());
				for (Customer c : allCustomers) {
					allCids.add(c.getCustomerId());
				}
				
				Map<Customer, Integer> customerVisits =
					_getCustomerVisits(store, allCids);
				JSONArray visits = JSONFactoryUtil.createJSONArray();
				for (Entry<Customer, Integer> visit : customerVisits.entrySet()) {
					JSONObject visitObj = JSONFactoryUtil.createJSONObject();
					visitObj.put("customerName", visit.getKey().getName());
					visitObj.put("customerEmail", visit.getKey().getEmail());
					visitObj.put("customerPic", visit.getKey().getPicture());
					visitObj.put("visitCount", visit.getValue());
					visitObj.put("lastVisitDate", new Date().getTime() -
						(Math.random() * 1000000));
					visits.put(visitObj);
				}
				storeVisitRecord.put("name", store.getName());
				storeVisitRecord.put("address", store.getAddress());
				storeVisitRecord.put("visits", visits);
				result.put(storeVisitRecord);
			}
			resp.setCharacterEncoding("UTF-8");

			resp.getWriter().write(result.toString());
		}
		catch (Exception ex) {
			throw new PortletException(ex);
		}
	}

	private Map<Customer, Integer> _getCustomerVisits(
		StoreLocation store, List<Long> allCids)
		throws SystemException, PortalException {

		Map<Customer, Integer> result = new HashMap<Customer, Integer>();
		
		DynamicQuery q = DynamicQueryFactoryUtil.forClass(CustomerStoreVisit.class);

		q.add(RestrictionsFactoryUtil.in("customerId", allCids));
		q.add(RestrictionsFactoryUtil.eq("storelocationId", store.getStorelocationId()));
		q.setProjection(ProjectionFactoryUtil.projectionList().add(
			ProjectionFactoryUtil.groupProperty("customerId")).add(
				ProjectionFactoryUtil.alias(ProjectionFactoryUtil.rowCount(), "visitCount")));
		
		@SuppressWarnings("unchecked")
		List<Object[]> results = (List<Object[]>) CustomerStoreVisitLocalServiceUtil.dynamicQuery(q);
		for (Object[] resObj : results) {
			long customerId = (Long)resObj[0];
			long visitCount = (Long)resObj[1];
			result.put(CustomerLocalServiceUtil.getCustomer(customerId), (int)visitCount);
		}
		return result;
	}

}
