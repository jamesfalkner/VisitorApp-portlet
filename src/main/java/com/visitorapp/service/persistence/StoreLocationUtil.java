package com.visitorapp.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.visitorapp.model.StoreLocation;

import java.util.List;

/**
 * The persistence utility for the store location service. This utility wraps {@link StoreLocationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocationPersistence
 * @see StoreLocationPersistenceImpl
 * @generated
 */
public class StoreLocationUtil {
    private static StoreLocationPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(StoreLocation storeLocation) {
        getPersistence().clearCache(storeLocation);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<StoreLocation> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<StoreLocation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<StoreLocation> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static StoreLocation update(StoreLocation storeLocation)
        throws SystemException {
        return getPersistence().update(storeLocation);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static StoreLocation update(StoreLocation storeLocation,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(storeLocation, serviceContext);
    }

    /**
    * Caches the store location in the entity cache if it is enabled.
    *
    * @param storeLocation the store location
    */
    public static void cacheResult(
        com.visitorapp.model.StoreLocation storeLocation) {
        getPersistence().cacheResult(storeLocation);
    }

    /**
    * Caches the store locations in the entity cache if it is enabled.
    *
    * @param storeLocations the store locations
    */
    public static void cacheResult(
        java.util.List<com.visitorapp.model.StoreLocation> storeLocations) {
        getPersistence().cacheResult(storeLocations);
    }

    /**
    * Creates a new store location with the primary key. Does not add the store location to the database.
    *
    * @param storelocationId the primary key for the new store location
    * @return the new store location
    */
    public static com.visitorapp.model.StoreLocation create(
        long storelocationId) {
        return getPersistence().create(storelocationId);
    }

    /**
    * Removes the store location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location that was removed
    * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation remove(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchStoreLocationException {
        return getPersistence().remove(storelocationId);
    }

    public static com.visitorapp.model.StoreLocation updateImpl(
        com.visitorapp.model.StoreLocation storeLocation)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(storeLocation);
    }

    /**
    * Returns the store location with the primary key or throws a {@link com.visitorapp.NoSuchStoreLocationException} if it could not be found.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location
    * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation findByPrimaryKey(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchStoreLocationException {
        return getPersistence().findByPrimaryKey(storelocationId);
    }

    /**
    * Returns the store location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location, or <code>null</code> if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.StoreLocation fetchByPrimaryKey(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(storelocationId);
    }

    /**
    * Returns all the store locations.
    *
    * @return the store locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.visitorapp.model.StoreLocation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.visitorapp.model.StoreLocation> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the store locations.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.StoreLocationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of store locations
    * @param end the upper bound of the range of store locations (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of store locations
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.visitorapp.model.StoreLocation> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the store locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of store locations.
    *
    * @return the number of store locations
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static StoreLocationPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (StoreLocationPersistence) PortletBeanLocatorUtil.locate(com.visitorapp.service.ClpSerializer.getServletContextName(),
                    StoreLocationPersistence.class.getName());

            ReferenceRegistry.registerReference(StoreLocationUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(StoreLocationPersistence persistence) {
    }
}
