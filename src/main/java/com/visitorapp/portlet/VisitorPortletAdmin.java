
package com.visitorapp.portlet;

import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.visitorapp.model.Customer;
import com.visitorapp.model.CustomerStoreVisit;
import com.visitorapp.model.StoreLocation;
import com.visitorapp.service.CustomerLocalServiceUtil;
import com.visitorapp.service.CustomerStoreVisitLocalServiceUtil;
import com.visitorapp.service.StoreLocationLocalServiceUtil;
import com.visitorapp.util.RandomData;

public class VisitorPortletAdmin extends MVCPortlet {
	public void fillRandomData(ActionRequest request, ActionResponse response)
					throws Exception {

					_createRandomStoreVisits(request);

					sendRedirect(request, response);
	}
	
	public void addLocation(ActionRequest request, ActionResponse response)
					throws Exception {

					_updateLocation(request);

					sendRedirect(request, response);
				}

	public void deleteLocation(ActionRequest request, ActionResponse response)
		throws Exception {

		long locationId = ParamUtil.getLong(request, "locationId");

		StoreLocationLocalServiceUtil.deleteStoreLocation(locationId);

		sendRedirect(request, response);
	}

	public void updateLocation(ActionRequest request, ActionResponse response)
		throws Exception {

		_updateLocation(request);

		sendRedirect(request, response);
	}

	public void addCustomer(ActionRequest request, ActionResponse response)
		throws Exception {

		_updateCustomer(request);

		sendRedirect(request, response);
	}

	public void deleteCustomer(ActionRequest request, ActionResponse response)
		throws Exception {

		long customerId = ParamUtil.getLong(request, "customerId");

		CustomerLocalServiceUtil.deleteCustomer(customerId);

		sendRedirect(request, response);
	}

	public void updateCustomer(ActionRequest request, ActionResponse response)
		throws Exception {

		_updateCustomer(request);

		sendRedirect(request, response);
	}

	private StoreLocation _updateLocation(ActionRequest request)
		throws PortalException, SystemException {

		long locationId = (ParamUtil.getLong(request, "storelocationId"));
		String name = (ParamUtil.getString(request, "name"));
		String address = (ParamUtil.getString(request, "address"));

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(StoreLocation.class.getName(), request);

		if (locationId <= 0) {

			return StoreLocationLocalServiceUtil.addStoreLocation(
				serviceContext.getUserId(), serviceContext.getScopeGroupId(), name,
				address, serviceContext);
		}
		else {

			return StoreLocationLocalServiceUtil.updateStoreLocation(
				serviceContext.getUserId(), locationId, name, address, serviceContext);
		}
	}

	private Customer _updateCustomer(ActionRequest request)
		throws PortalException, SystemException {

		long customerId = (ParamUtil.getLong(request, "customerId"));
		String name = (ParamUtil.getString(request, "name"));

		ServiceContext serviceContext =
			ServiceContextFactory.getInstance(Customer.class.getName(), request);

		if (customerId <= 0) {

			return CustomerLocalServiceUtil.addCustomer(
				serviceContext.getUserId(), serviceContext.getScopeGroupId(), name,
				serviceContext);
		}
		else {

			return CustomerLocalServiceUtil.updateCustomer(
				serviceContext.getUserId(), customerId, name, serviceContext);
		}
	}

	private void _createRandomStoreVisits(ActionRequest request)
		throws PortalException, SystemException {

		int count = (ParamUtil.getInteger(request, "count"));
		User u = PortalUtil.getUser(request);
		long groupId = PortalUtil.getScopeGroupId(request);
		
		ServiceContext serviceContext =
						ServiceContextFactory.getInstance(CustomerStoreVisit.class.getName(), request);

		CustomerLocalServiceUtil.removeAllCustomers();
		StoreLocationLocalServiceUtil.removeAllStoreLocations();
		CustomerStoreVisitLocalServiceUtil.removeAllCustomerStoreVisits();

		_addCustomersAndStores(u.getUserId(), groupId, serviceContext);
		List<Customer> allCustomers = CustomerLocalServiceUtil.getCustomers(QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
		List<StoreLocation> allStoreLocations = StoreLocationLocalServiceUtil.getStoreLocations(QueryUtil.ALL_POS,  QueryUtil.ALL_POS);
		
		for (int i = 0 ; i < count ; i ++) {
			Customer customer = allCustomers.get((int) (allCustomers.size() * Math.random()));
			StoreLocation location = allStoreLocations.get((int) (allStoreLocations.size() * Math.random()));

			CustomerStoreVisitLocalServiceUtil.addCustomerStoreVisit(u.getUserId(),
				groupId, customer.getCustomerId(), location.getStorelocationId(), serviceContext);
		}

	}
	
	private void _addCustomersAndStores(long userId, long groupId, ServiceContext serviceContext) throws PortalException, SystemException {
		for (int i = 0 ; i < RandomData.NAMES.length; i++) {
			String email = RandomData.NAMES[i].replaceAll("\\s+", ".") + "@random.com";
			Customer c = CustomerLocalServiceUtil.addCustomer(userId, groupId, RandomData.NAMES[i], serviceContext);
			c.setEmail(email);
			CustomerLocalServiceUtil.updateCustomer(c);
		}
		for (int i = 0; i < RandomData.LOC_NAMES.length; i++) {
			String name = RandomData.LOC_NAMES[i];
			String addr = RandomData.ADDRS[(int) (Math.random() * RandomData.ADDRS.length)];
			StoreLocationLocalServiceUtil.addStoreLocation(userId, groupId, name, addr, serviceContext);
			
		}
	}

}
