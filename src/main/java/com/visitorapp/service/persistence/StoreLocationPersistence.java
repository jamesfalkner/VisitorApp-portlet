package com.visitorapp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.visitorapp.model.StoreLocation;

/**
 * The persistence interface for the store location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocationPersistenceImpl
 * @see StoreLocationUtil
 * @generated
 */
public interface StoreLocationPersistence extends BasePersistence<StoreLocation> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link StoreLocationUtil} to access the store location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the store location in the entity cache if it is enabled.
    *
    * @param storeLocation the store location
    */
    public void cacheResult(com.visitorapp.model.StoreLocation storeLocation);

    /**
    * Caches the store locations in the entity cache if it is enabled.
    *
    * @param storeLocations the store locations
    */
    public void cacheResult(
        java.util.List<com.visitorapp.model.StoreLocation> storeLocations);

    /**
    * Creates a new store location with the primary key. Does not add the store location to the database.
    *
    * @param storelocationId the primary key for the new store location
    * @return the new store location
    */
    public com.visitorapp.model.StoreLocation create(long storelocationId);

    /**
    * Removes the store location with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location that was removed
    * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.StoreLocation remove(long storelocationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchStoreLocationException;

    public com.visitorapp.model.StoreLocation updateImpl(
        com.visitorapp.model.StoreLocation storeLocation)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the store location with the primary key or throws a {@link com.visitorapp.NoSuchStoreLocationException} if it could not be found.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location
    * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.StoreLocation findByPrimaryKey(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchStoreLocationException;

    /**
    * Returns the store location with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param storelocationId the primary key of the store location
    * @return the store location, or <code>null</code> if a store location with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.StoreLocation fetchByPrimaryKey(
        long storelocationId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the store locations.
    *
    * @return the store locations
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.visitorapp.model.StoreLocation> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.visitorapp.model.StoreLocation> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.visitorapp.model.StoreLocation> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the store locations from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of store locations.
    *
    * @return the number of store locations
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
