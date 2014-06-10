package com.visitorapp.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for CustomerStoreVisit. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitLocalServiceUtil
 * @see com.visitorapp.service.base.CustomerStoreVisitLocalServiceBaseImpl
 * @see com.visitorapp.service.impl.CustomerStoreVisitLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface CustomerStoreVisitLocalService extends BaseLocalService,
    InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CustomerStoreVisitLocalServiceUtil} to access the customer store visit local service. Add custom service methods to {@link com.visitorapp.service.impl.CustomerStoreVisitLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the customer store visit to the database. Also notifies the appropriate model listeners.
    *
    * @param customerStoreVisit the customer store visit
    * @return the customer store visit that was added
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit addCustomerStoreVisit(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new customer store visit with the primary key. Does not add the customer store visit to the database.
    *
    * @param customerstorevisitId the primary key for the new customer store visit
    * @return the new customer store visit
    */
    public com.visitorapp.model.CustomerStoreVisit createCustomerStoreVisit(
        long customerstorevisitId);

    /**
    * Deletes the customer store visit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit that was removed
    * @throws PortalException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit deleteCustomerStoreVisit(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the customer store visit from the database. Also notifies the appropriate model listeners.
    *
    * @param customerStoreVisit the customer store visit
    * @return the customer store visit that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit deleteCustomerStoreVisit(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerStoreVisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerStoreVisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.visitorapp.model.CustomerStoreVisit fetchCustomerStoreVisit(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the customer store visit with the primary key.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit
    * @throws PortalException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.visitorapp.model.CustomerStoreVisit getCustomerStoreVisit(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the customer store visits.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerStoreVisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of customer store visits
    * @param end the upper bound of the range of customer store visits (not inclusive)
    * @return the range of customer store visits
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> getCustomerStoreVisits(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of customer store visits.
    *
    * @return the number of customer store visits
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getCustomerStoreVisitsCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the customer store visit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param customerStoreVisit the customer store visit
    * @return the customer store visit that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit updateCustomerStoreVisit(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    public com.visitorapp.model.CustomerStoreVisit addCustomerStoreVisit(
        long userId, long groupId, long customerId, long storelocationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.visitorapp.model.CustomerStoreVisit updateCustomerStoreVisit(
        long userId, long customerstorevisitId, long customerId,
        long storelocationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> getCustomerStoreVisitByStoreAndCustomer(
        com.visitorapp.model.StoreLocation storeLocation,
        com.visitorapp.model.Customer customer)
        throws com.liferay.portal.kernel.exception.SystemException;

    public void removeAllCustomerStoreVisits()
        throws com.liferay.portal.kernel.exception.SystemException;
}
