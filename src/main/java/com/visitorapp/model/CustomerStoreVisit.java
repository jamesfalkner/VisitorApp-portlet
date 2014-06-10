package com.visitorapp.model;

import com.liferay.portal.model.PersistedModel;

/**
 * The extended model interface for the CustomerStoreVisit service. Represents a row in the &quot;VisitorApp_CustomerStoreVisit&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitModel
 * @see com.visitorapp.model.impl.CustomerStoreVisitImpl
 * @see com.visitorapp.model.impl.CustomerStoreVisitModelImpl
 * @generated
 */
public interface CustomerStoreVisit extends CustomerStoreVisitModel,
    PersistedModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this interface directly. Add methods to {@link com.visitorapp.model.impl.CustomerStoreVisitImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
    public com.visitorapp.model.Customer getCustomer()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.visitorapp.model.StoreLocation getStoreLocation()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;
}
