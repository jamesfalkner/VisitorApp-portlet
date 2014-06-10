package com.visitorapp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CustomerStoreVisitLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitLocalService
 * @generated
 */
public class CustomerStoreVisitLocalServiceWrapper
    implements CustomerStoreVisitLocalService,
        ServiceWrapper<CustomerStoreVisitLocalService> {
    private CustomerStoreVisitLocalService _customerStoreVisitLocalService;

    public CustomerStoreVisitLocalServiceWrapper(
        CustomerStoreVisitLocalService customerStoreVisitLocalService) {
        _customerStoreVisitLocalService = customerStoreVisitLocalService;
    }

    /**
    * Adds the customer store visit to the database. Also notifies the appropriate model listeners.
    *
    * @param customerStoreVisit the customer store visit
    * @return the customer store visit that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.visitorapp.model.CustomerStoreVisit addCustomerStoreVisit(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.addCustomerStoreVisit(customerStoreVisit);
    }

    /**
    * Creates a new customer store visit with the primary key. Does not add the customer store visit to the database.
    *
    * @param customerstorevisitId the primary key for the new customer store visit
    * @return the new customer store visit
    */
    @Override
    public com.visitorapp.model.CustomerStoreVisit createCustomerStoreVisit(
        long customerstorevisitId) {
        return _customerStoreVisitLocalService.createCustomerStoreVisit(customerstorevisitId);
    }

    /**
    * Deletes the customer store visit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit that was removed
    * @throws PortalException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.visitorapp.model.CustomerStoreVisit deleteCustomerStoreVisit(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.deleteCustomerStoreVisit(customerstorevisitId);
    }

    /**
    * Deletes the customer store visit from the database. Also notifies the appropriate model listeners.
    *
    * @param customerStoreVisit the customer store visit
    * @return the customer store visit that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.visitorapp.model.CustomerStoreVisit deleteCustomerStoreVisit(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.deleteCustomerStoreVisit(customerStoreVisit);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _customerStoreVisitLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.dynamicQuery(dynamicQuery);
    }

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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.visitorapp.model.CustomerStoreVisit fetchCustomerStoreVisit(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.fetchCustomerStoreVisit(customerstorevisitId);
    }

    /**
    * Returns the customer store visit with the primary key.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit
    * @throws PortalException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.visitorapp.model.CustomerStoreVisit getCustomerStoreVisit(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.getCustomerStoreVisit(customerstorevisitId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.getPersistedModel(primaryKeyObj);
    }

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
    @Override
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> getCustomerStoreVisits(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.getCustomerStoreVisits(start, end);
    }

    /**
    * Returns the number of customer store visits.
    *
    * @return the number of customer store visits
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getCustomerStoreVisitsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.getCustomerStoreVisitsCount();
    }

    /**
    * Updates the customer store visit in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param customerStoreVisit the customer store visit
    * @return the customer store visit that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.visitorapp.model.CustomerStoreVisit updateCustomerStoreVisit(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.updateCustomerStoreVisit(customerStoreVisit);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _customerStoreVisitLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _customerStoreVisitLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _customerStoreVisitLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public com.visitorapp.model.CustomerStoreVisit addCustomerStoreVisit(
        long userId, long groupId, long customerId, long storelocationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.addCustomerStoreVisit(userId,
            groupId, customerId, storelocationId, serviceContext);
    }

    @Override
    public com.visitorapp.model.CustomerStoreVisit updateCustomerStoreVisit(
        long userId, long customerstorevisitId, long customerId,
        long storelocationId,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.updateCustomerStoreVisit(userId,
            customerstorevisitId, customerId, storelocationId, serviceContext);
    }

    @Override
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> getCustomerStoreVisitByStoreAndCustomer(
        com.visitorapp.model.StoreLocation storeLocation,
        com.visitorapp.model.Customer customer)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisitLocalService.getCustomerStoreVisitByStoreAndCustomer(storeLocation,
            customer);
    }

    @Override
    public void removeAllCustomerStoreVisits()
        throws com.liferay.portal.kernel.exception.SystemException {
        _customerStoreVisitLocalService.removeAllCustomerStoreVisits();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CustomerStoreVisitLocalService getWrappedCustomerStoreVisitLocalService() {
        return _customerStoreVisitLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCustomerStoreVisitLocalService(
        CustomerStoreVisitLocalService customerStoreVisitLocalService) {
        _customerStoreVisitLocalService = customerStoreVisitLocalService;
    }

    @Override
    public CustomerStoreVisitLocalService getWrappedService() {
        return _customerStoreVisitLocalService;
    }

    @Override
    public void setWrappedService(
        CustomerStoreVisitLocalService customerStoreVisitLocalService) {
        _customerStoreVisitLocalService = customerStoreVisitLocalService;
    }
}
