package com.visitorapp.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.visitorapp.model.Customer;
import com.visitorapp.service.base.CustomerLocalServiceBaseImpl;

/**
 * The implementation of the customer local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.visitorapp.service.CustomerLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.visitorapp.service.base.CustomerLocalServiceBaseImpl
 * @see com.visitorapp.service.CustomerLocalServiceUtil
 */
public class CustomerLocalServiceImpl extends CustomerLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.visitorapp.service.CustomerLocalServiceUtil} to access the customer local service.
     */
	public Customer addCustomer(
		long userId, long groupId, String name,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		long customerId = counterLocalService.increment(Customer.class.getName());

		Customer customer = customerPersistence.create(customerId);

		customer.setName(name);

		customer.setGroupId(groupId);
		customer.setCompanyId(user.getCompanyId());
		customer.setUserId(user.getUserId());
		customer.setCreateDate(serviceContext.getCreateDate(now));
		customer.setModifiedDate(serviceContext.getModifiedDate(now));

		super.addCustomer(customer);

		return customer;
	}

	public Customer deleteCustomer(Customer customer)
		throws SystemException {

		return customerPersistence.remove(customer);
	}

	public Customer deleteCustomer(long customerId)
		throws PortalException, SystemException {

		Customer customer = customerPersistence.fetchByPrimaryKey(customerId);

		return deleteCustomer(customer);
	}

	public Customer updateCustomer(
		long userId, long customerId, String name,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		Date now = new Date();

		Customer customer = customerPersistence.findByPrimaryKey(customerId);

		customer.setName(name);
		customer.setModifiedDate(serviceContext.getModifiedDate(now));

		super.updateCustomer(customer);

		return customer;
	}
	
	public void removeAllCustomers() throws SystemException {
		customerPersistence.removeAll();
	}
}
