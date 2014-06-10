package com.visitorapp.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for StoreLocation. This utility wraps
 * {@link com.visitorapp.service.impl.StoreLocationLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocationLocalService
 * @see com.visitorapp.service.base.StoreLocationLocalServiceBaseImpl
 * @see com.visitorapp.service.impl.StoreLocationLocalServiceImpl
 * @generated
 */
public class StoreLocationLocalServiceUtil {
    private static StoreLocationLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.visitorapp.service.impl.StoreLocationLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the store location to the database. Also notifies the appropriate model listeners.
    *
    * @param storeLocation the store location
    * @return the store location that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation addStoreLocation(
        com.visitorapp.model.StoreLocation storeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addStoreLocation(storeLocation);
    }

    /**
    * Creates a new store location with the primary key. Does not add the store location to the database.
    *
    * @param storelocationId the primary key for the new store location
    * @return the new store location
    */
    public static com.visitorapp.model.StoreLocation createStoreLocation(
        long storelocationId) {
        return getService().createStoreLocation(storelocationId);
    }

    /**
    * Deletes the store location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location that was removed
    * @throws PortalException if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation deleteStoreLocation(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteStoreLocation(storelocationId);
    }

    /**
    * Deletes the store location from the database. Also notifies the appropriate model listeners.
    *
    * @param storeLocation the store location
    * @return the store location that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation deleteStoreLocation(
        com.visitorapp.model.StoreLocation storeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteStoreLocation(storeLocation);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.StoreLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.StoreLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.visitorapp.model.StoreLocation fetchStoreLocation(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchStoreLocation(storelocationId);
    }

    /**
    * Returns the store location with the primary key.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location
    * @throws PortalException if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation getStoreLocation(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getStoreLocation(storelocationId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the store locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.StoreLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of store locations
    * @param end the upper bound of the range of store locations (not inclusive)
    * @return the range of store locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.visitorapp.model.StoreLocation> getStoreLocations(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getStoreLocations(start, end);
    }

    /**
    * Returns the number of store locations.
    *
    * @return the number of store locations
    * @throws SystemException if a system exception occurred
    */
    public static int getStoreLocationsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getStoreLocationsCount();
    }

    /**
    * Updates the store location in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param storeLocation the store location
    * @return the store location that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation updateStoreLocation(
        com.visitorapp.model.StoreLocation storeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateStoreLocation(storeLocation);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.visitorapp.model.StoreLocation addStoreLocation(
        long userId, long groupId, java.lang.String name,
        java.lang.String address,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .addStoreLocation(userId, groupId, name, address,
            serviceContext);
    }

    public static com.visitorapp.model.StoreLocation updateStoreLocation(
        long userId, long locationId, java.lang.String name,
        java.lang.String address,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .updateStoreLocation(userId, locationId, name, address,
            serviceContext);
    }

    public static void removeAllStoreLocations()
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().removeAllStoreLocations();
    }

    public static void clearService() {
        _service = null;
    }

    public static StoreLocationLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    StoreLocationLocalService.class.getName());

            if (invokableLocalService instanceof StoreLocationLocalService) {
                _service = (StoreLocationLocalService) invokableLocalService;
            } else {
                _service = new StoreLocationLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(StoreLocationLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(StoreLocationLocalService service) {
    }
}
