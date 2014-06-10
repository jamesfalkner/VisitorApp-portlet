package com.visitorapp.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.visitorapp.model.Customer;
import com.visitorapp.model.StoreLocation;
import com.visitorapp.service.CustomerLocalServiceUtil;
import com.visitorapp.service.StoreLocationLocalServiceUtil;

/**
 * The extended model implementation for the CustomerStoreVisit service. Represents a row in the &quot;VisitorApp_CustomerStoreVisit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.visitorapp.model.CustomerStoreVisit} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class CustomerStoreVisitImpl extends CustomerStoreVisitBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a customer store visit model instance should use the {@link com.visitorapp.model.CustomerStoreVisit} interface instead.
     */
    public CustomerStoreVisitImpl() {
    }
    
    public Customer getCustomer() throws PortalException, SystemException {
    	return CustomerLocalServiceUtil.getCustomer(getCustomerId());
    }
    public StoreLocation getStoreLocation() throws PortalException, SystemException {
    	return StoreLocationLocalServiceUtil.getStoreLocation(getStorelocationId());
    }

}
