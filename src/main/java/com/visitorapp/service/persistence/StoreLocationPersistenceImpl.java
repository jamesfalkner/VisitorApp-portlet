package com.visitorapp.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.visitorapp.NoSuchStoreLocationException;

import com.visitorapp.model.StoreLocation;
import com.visitorapp.model.impl.StoreLocationImpl;
import com.visitorapp.model.impl.StoreLocationModelImpl;

import com.visitorapp.service.persistence.StoreLocationPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the store location service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocationPersistence
 * @see StoreLocationUtil
 * @generated
 */
public class StoreLocationPersistenceImpl extends BasePersistenceImpl<StoreLocation>
    implements StoreLocationPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link StoreLocationUtil} to access the store location persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = StoreLocationImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
            StoreLocationModelImpl.FINDER_CACHE_ENABLED,
            StoreLocationImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
            StoreLocationModelImpl.FINDER_CACHE_ENABLED,
            StoreLocationImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
            StoreLocationModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_STORELOCATION = "SELECT storeLocation FROM StoreLocation storeLocation";
    private static final String _SQL_COUNT_STORELOCATION = "SELECT COUNT(storeLocation) FROM StoreLocation storeLocation";
    private static final String _ORDER_BY_ENTITY_ALIAS = "storeLocation.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No StoreLocation exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(StoreLocationPersistenceImpl.class);
    private static StoreLocation _nullStoreLocation = new StoreLocationImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<StoreLocation> toCacheModel() {
                return _nullStoreLocationCacheModel;
            }
        };

    private static CacheModel<StoreLocation> _nullStoreLocationCacheModel = new CacheModel<StoreLocation>() {
            @Override
            public StoreLocation toEntityModel() {
                return _nullStoreLocation;
            }
        };

    public StoreLocationPersistenceImpl() {
        setModelClass(StoreLocation.class);
    }

    /**
     * Caches the store location in the entity cache if it is enabled.
     *
     * @param storeLocation the store location
     */
    @Override
    public void cacheResult(StoreLocation storeLocation) {
        EntityCacheUtil.putResult(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
            StoreLocationImpl.class, storeLocation.getPrimaryKey(),
            storeLocation);

        storeLocation.resetOriginalValues();
    }

    /**
     * Caches the store locations in the entity cache if it is enabled.
     *
     * @param storeLocations the store locations
     */
    @Override
    public void cacheResult(List<StoreLocation> storeLocations) {
        for (StoreLocation storeLocation : storeLocations) {
            if (EntityCacheUtil.getResult(
                        StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
                        StoreLocationImpl.class, storeLocation.getPrimaryKey()) == null) {
                cacheResult(storeLocation);
            } else {
                storeLocation.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all store locations.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(StoreLocationImpl.class.getName());
        }

        EntityCacheUtil.clearCache(StoreLocationImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the store location.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(StoreLocation storeLocation) {
        EntityCacheUtil.removeResult(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
            StoreLocationImpl.class, storeLocation.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<StoreLocation> storeLocations) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (StoreLocation storeLocation : storeLocations) {
            EntityCacheUtil.removeResult(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
                StoreLocationImpl.class, storeLocation.getPrimaryKey());
        }
    }

    /**
     * Creates a new store location with the primary key. Does not add the store location to the database.
     *
     * @param storelocationId the primary key for the new store location
     * @return the new store location
     */
    @Override
    public StoreLocation create(long storelocationId) {
        StoreLocation storeLocation = new StoreLocationImpl();

        storeLocation.setNew(true);
        storeLocation.setPrimaryKey(storelocationId);

        return storeLocation;
    }

    /**
     * Removes the store location with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param storelocationId the primary key of the store location
     * @return the store location that was removed
     * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StoreLocation remove(long storelocationId)
        throws NoSuchStoreLocationException, SystemException {
        return remove((Serializable) storelocationId);
    }

    /**
     * Removes the store location with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the store location
     * @return the store location that was removed
     * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StoreLocation remove(Serializable primaryKey)
        throws NoSuchStoreLocationException, SystemException {
        Session session = null;

        try {
            session = openSession();

            StoreLocation storeLocation = (StoreLocation) session.get(StoreLocationImpl.class,
                    primaryKey);

            if (storeLocation == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchStoreLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(storeLocation);
        } catch (NoSuchStoreLocationException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected StoreLocation removeImpl(StoreLocation storeLocation)
        throws SystemException {
        storeLocation = toUnwrappedModel(storeLocation);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(storeLocation)) {
                storeLocation = (StoreLocation) session.get(StoreLocationImpl.class,
                        storeLocation.getPrimaryKeyObj());
            }

            if (storeLocation != null) {
                session.delete(storeLocation);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (storeLocation != null) {
            clearCache(storeLocation);
        }

        return storeLocation;
    }

    @Override
    public StoreLocation updateImpl(
        com.visitorapp.model.StoreLocation storeLocation)
        throws SystemException {
        storeLocation = toUnwrappedModel(storeLocation);

        boolean isNew = storeLocation.isNew();

        Session session = null;

        try {
            session = openSession();

            if (storeLocation.isNew()) {
                session.save(storeLocation);

                storeLocation.setNew(false);
            } else {
                session.merge(storeLocation);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
            StoreLocationImpl.class, storeLocation.getPrimaryKey(),
            storeLocation);

        return storeLocation;
    }

    protected StoreLocation toUnwrappedModel(StoreLocation storeLocation) {
        if (storeLocation instanceof StoreLocationImpl) {
            return storeLocation;
        }

        StoreLocationImpl storeLocationImpl = new StoreLocationImpl();

        storeLocationImpl.setNew(storeLocation.isNew());
        storeLocationImpl.setPrimaryKey(storeLocation.getPrimaryKey());

        storeLocationImpl.setStorelocationId(storeLocation.getStorelocationId());
        storeLocationImpl.setGroupId(storeLocation.getGroupId());
        storeLocationImpl.setCompanyId(storeLocation.getCompanyId());
        storeLocationImpl.setUserId(storeLocation.getUserId());
        storeLocationImpl.setUserName(storeLocation.getUserName());
        storeLocationImpl.setCreateDate(storeLocation.getCreateDate());
        storeLocationImpl.setModifiedDate(storeLocation.getModifiedDate());
        storeLocationImpl.setName(storeLocation.getName());
        storeLocationImpl.setAddress(storeLocation.getAddress());

        return storeLocationImpl;
    }

    /**
     * Returns the store location with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the store location
     * @return the store location
     * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StoreLocation findByPrimaryKey(Serializable primaryKey)
        throws NoSuchStoreLocationException, SystemException {
        StoreLocation storeLocation = fetchByPrimaryKey(primaryKey);

        if (storeLocation == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchStoreLocationException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return storeLocation;
    }

    /**
     * Returns the store location with the primary key or throws a {@link com.visitorapp.NoSuchStoreLocationException} if it could not be found.
     *
     * @param storelocationId the primary key of the store location
     * @return the store location
     * @throws com.visitorapp.NoSuchStoreLocationException if a store location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StoreLocation findByPrimaryKey(long storelocationId)
        throws NoSuchStoreLocationException, SystemException {
        return findByPrimaryKey((Serializable) storelocationId);
    }

    /**
     * Returns the store location with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the store location
     * @return the store location, or <code>null</code> if a store location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StoreLocation fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        StoreLocation storeLocation = (StoreLocation) EntityCacheUtil.getResult(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
                StoreLocationImpl.class, primaryKey);

        if (storeLocation == _nullStoreLocation) {
            return null;
        }

        if (storeLocation == null) {
            Session session = null;

            try {
                session = openSession();

                storeLocation = (StoreLocation) session.get(StoreLocationImpl.class,
                        primaryKey);

                if (storeLocation != null) {
                    cacheResult(storeLocation);
                } else {
                    EntityCacheUtil.putResult(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
                        StoreLocationImpl.class, primaryKey, _nullStoreLocation);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(StoreLocationModelImpl.ENTITY_CACHE_ENABLED,
                    StoreLocationImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return storeLocation;
    }

    /**
     * Returns the store location with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param storelocationId the primary key of the store location
     * @return the store location, or <code>null</code> if a store location with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public StoreLocation fetchByPrimaryKey(long storelocationId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) storelocationId);
    }

    /**
     * Returns all the store locations.
     *
     * @return the store locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<StoreLocation> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<StoreLocation> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<StoreLocation> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<StoreLocation> list = (List<StoreLocation>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_STORELOCATION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_STORELOCATION;

                if (pagination) {
                    sql = sql.concat(StoreLocationModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<StoreLocation>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<StoreLocation>(list);
                } else {
                    list = (List<StoreLocation>) QueryUtil.list(q,
                            getDialect(), start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the store locations from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (StoreLocation storeLocation : findAll()) {
            remove(storeLocation);
        }
    }

    /**
     * Returns the number of store locations.
     *
     * @return the number of store locations
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_STORELOCATION);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the store location persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.visitorapp.model.StoreLocation")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<StoreLocation>> listenersList = new ArrayList<ModelListener<StoreLocation>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<StoreLocation>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(StoreLocationImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
