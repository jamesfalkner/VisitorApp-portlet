package com.visitorapp.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.visitorapp.model.Customer;
import com.visitorapp.model.CustomerStoreVisit;
import com.visitorapp.model.StoreLocation;
import com.visitorapp.service.base.CustomerStoreVisitLocalServiceBaseImpl;

/**
 * The implementation of the customer store visit local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.visitorapp.service.CustomerStoreVisitLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.visitorapp.service.base.CustomerStoreVisitLocalServiceBaseImpl
 * @see com.visitorapp.service.CustomerStoreVisitLocalServiceUtil
 */
public class CustomerStoreVisitLocalServiceImpl
    extends CustomerStoreVisitLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.visitorapp.service.CustomerStoreVisitLocalServiceUtil} to access the customer store visit local service.
     */
	public CustomerStoreVisit addCustomerStoreVisit(
		long userId, long groupId, long customerId, long storelocationId,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		long customerstorevisitId = counterLocalService.increment(CustomerStoreVisit.class.getName());

		CustomerStoreVisit visit = customerStoreVisitPersistence.create(customerstorevisitId);

		visit.setCustomerId(customerId);
		visit.setStorelocationId(storelocationId);
		

		visit.setGroupId(groupId);
		visit.setCompanyId(user.getCompanyId());
		visit.setUserId(user.getUserId());
		visit.setCreateDate(serviceContext.getCreateDate(now));
		visit.setModifiedDate(serviceContext.getModifiedDate(now));

		super.addCustomerStoreVisit(visit);

		return visit;
	}

	public CustomerStoreVisit deleteCustomerStoreVisit(CustomerStoreVisit visit)
		throws SystemException {

		return customerStoreVisitPersistence.remove(visit);
	}

	public CustomerStoreVisit deleteCustomerStoreVisit(long customerstorevisitId)
		throws PortalException, SystemException {

		CustomerStoreVisit visit = customerStoreVisitPersistence.fetchByPrimaryKey(customerstorevisitId);

		return deleteCustomerStoreVisit(visit);
	}

	public CustomerStoreVisit updateCustomerStoreVisit(
		long userId, long customerstorevisitId, long customerId, long storelocationId,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		Date now = new Date();

		CustomerStoreVisit visit = customerStoreVisitPersistence.findByPrimaryKey(customerstorevisitId);

		visit.setCustomerId(customerId);
		visit.setStorelocationId(storelocationId);
		visit.setModifiedDate(serviceContext.getModifiedDate(now));

		super.updateCustomerStoreVisit(visit);
		return visit;
	}

	 public List<CustomerStoreVisit> getCustomerStoreVisitByStoreAndCustomer(StoreLocation storeLocation, Customer customer) throws SystemException {  
		 return customerStoreVisitPersistence.findByStoreAndCustomer(storeLocation.getStorelocationId(), customer.getCustomerId());
		 }  
	 public void removeAllCustomerStoreVisits() throws SystemException {  
		   customerStoreVisitPersistence.removeAll();
		 }  

}
