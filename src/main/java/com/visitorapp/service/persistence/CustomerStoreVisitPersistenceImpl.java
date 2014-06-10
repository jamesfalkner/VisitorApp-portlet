package com.visitorapp.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.visitorapp.NoSuchCustomerStoreVisitException;

import com.visitorapp.model.CustomerStoreVisit;
import com.visitorapp.model.impl.CustomerStoreVisitImpl;
import com.visitorapp.model.impl.CustomerStoreVisitModelImpl;

import com.visitorapp.service.persistence.CustomerStoreVisitPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the customer store visit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitPersistence
 * @see CustomerStoreVisitUtil
 * @generated
 */
public class CustomerStoreVisitPersistenceImpl extends BasePersistenceImpl<CustomerStoreVisit>
    implements CustomerStoreVisitPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link CustomerStoreVisitUtil} to access the customer store visit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = CustomerStoreVisitImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitModelImpl.FINDER_CACHE_ENABLED,
            CustomerStoreVisitImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitModelImpl.FINDER_CACHE_ENABLED,
            CustomerStoreVisitImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_STOREANDCUSTOMER =
        new FinderPath(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitModelImpl.FINDER_CACHE_ENABLED,
            CustomerStoreVisitImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByStoreAndCustomer",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STOREANDCUSTOMER =
        new FinderPath(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitModelImpl.FINDER_CACHE_ENABLED,
            CustomerStoreVisitImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByStoreAndCustomer",
            new String[] { Long.class.getName(), Long.class.getName() },
            CustomerStoreVisitModelImpl.STORELOCATIONID_COLUMN_BITMASK |
            CustomerStoreVisitModelImpl.CUSTOMERID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_STOREANDCUSTOMER = new FinderPath(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByStoreAndCustomer",
            new String[] { Long.class.getName(), Long.class.getName() });
    private static final String _FINDER_COLUMN_STOREANDCUSTOMER_STORELOCATIONID_2 =
        "customerStoreVisit.storelocationId = ? AND ";
    private static final String _FINDER_COLUMN_STOREANDCUSTOMER_CUSTOMERID_2 = "customerStoreVisit.customerId = ?";
    private static final String _SQL_SELECT_CUSTOMERSTOREVISIT = "SELECT customerStoreVisit FROM CustomerStoreVisit customerStoreVisit";
    private static final String _SQL_SELECT_CUSTOMERSTOREVISIT_WHERE = "SELECT customerStoreVisit FROM CustomerStoreVisit customerStoreVisit WHERE ";
    private static final String _SQL_COUNT_CUSTOMERSTOREVISIT = "SELECT COUNT(customerStoreVisit) FROM CustomerStoreVisit customerStoreVisit";
    private static final String _SQL_COUNT_CUSTOMERSTOREVISIT_WHERE = "SELECT COUNT(customerStoreVisit) FROM CustomerStoreVisit customerStoreVisit WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "customerStoreVisit.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No CustomerStoreVisit exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No CustomerStoreVisit exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(CustomerStoreVisitPersistenceImpl.class);
    private static CustomerStoreVisit _nullCustomerStoreVisit = new CustomerStoreVisitImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<CustomerStoreVisit> toCacheModel() {
                return _nullCustomerStoreVisitCacheModel;
            }
        };

    private static CacheModel<CustomerStoreVisit> _nullCustomerStoreVisitCacheModel =
        new CacheModel<CustomerStoreVisit>() {
            @Override
            public CustomerStoreVisit toEntityModel() {
                return _nullCustomerStoreVisit;
            }
        };

    public CustomerStoreVisitPersistenceImpl() {
        setModelClass(CustomerStoreVisit.class);
    }

    /**
     * Returns all the customer store visits where storelocationId = &#63; and customerId = &#63;.
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @return the matching customer store visits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId) throws SystemException {
        return findByStoreAndCustomer(storelocationId, customerId,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the customer store visits where storelocationId = &#63; and customerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerStoreVisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @param start the lower bound of the range of customer store visits
     * @param end the upper bound of the range of customer store visits (not inclusive)
     * @return the range of matching customer store visits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId, int start, int end)
        throws SystemException {
        return findByStoreAndCustomer(storelocationId, customerId, start, end,
            null);
    }

    /**
     * Returns an ordered range of all the customer store visits where storelocationId = &#63; and customerId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerStoreVisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @param start the lower bound of the range of customer store visits
     * @param end the upper bound of the range of customer store visits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching customer store visits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STOREANDCUSTOMER;
            finderArgs = new Object[] { storelocationId, customerId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_STOREANDCUSTOMER;
            finderArgs = new Object[] {
                    storelocationId, customerId,
                    
                    start, end, orderByComparator
                };
        }

        List<CustomerStoreVisit> list = (List<CustomerStoreVisit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (CustomerStoreVisit customerStoreVisit : list) {
                if ((storelocationId != customerStoreVisit.getStorelocationId()) ||
                        (customerId != customerStoreVisit.getCustomerId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_CUSTOMERSTOREVISIT_WHERE);

            query.append(_FINDER_COLUMN_STOREANDCUSTOMER_STORELOCATIONID_2);

            query.append(_FINDER_COLUMN_STOREANDCUSTOMER_CUSTOMERID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(CustomerStoreVisitModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(storelocationId);

                qPos.add(customerId);

                if (!pagination) {
                    list = (List<CustomerStoreVisit>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CustomerStoreVisit>(list);
                } else {
                    list = (List<CustomerStoreVisit>) QueryUtil.list(q,
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
     * Returns the first customer store visit in the ordered set where storelocationId = &#63; and customerId = &#63;.
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching customer store visit
     * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a matching customer store visit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit findByStoreAndCustomer_First(
        long storelocationId, long customerId,
        OrderByComparator orderByComparator)
        throws NoSuchCustomerStoreVisitException, SystemException {
        CustomerStoreVisit customerStoreVisit = fetchByStoreAndCustomer_First(storelocationId,
                customerId, orderByComparator);

        if (customerStoreVisit != null) {
            return customerStoreVisit;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("storelocationId=");
        msg.append(storelocationId);

        msg.append(", customerId=");
        msg.append(customerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCustomerStoreVisitException(msg.toString());
    }

    /**
     * Returns the first customer store visit in the ordered set where storelocationId = &#63; and customerId = &#63;.
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching customer store visit, or <code>null</code> if a matching customer store visit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit fetchByStoreAndCustomer_First(
        long storelocationId, long customerId,
        OrderByComparator orderByComparator) throws SystemException {
        List<CustomerStoreVisit> list = findByStoreAndCustomer(storelocationId,
                customerId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the last customer store visit in the ordered set where storelocationId = &#63; and customerId = &#63;.
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching customer store visit
     * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a matching customer store visit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit findByStoreAndCustomer_Last(
        long storelocationId, long customerId,
        OrderByComparator orderByComparator)
        throws NoSuchCustomerStoreVisitException, SystemException {
        CustomerStoreVisit customerStoreVisit = fetchByStoreAndCustomer_Last(storelocationId,
                customerId, orderByComparator);

        if (customerStoreVisit != null) {
            return customerStoreVisit;
        }

        StringBundler msg = new StringBundler(6);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("storelocationId=");
        msg.append(storelocationId);

        msg.append(", customerId=");
        msg.append(customerId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchCustomerStoreVisitException(msg.toString());
    }

    /**
     * Returns the last customer store visit in the ordered set where storelocationId = &#63; and customerId = &#63;.
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching customer store visit, or <code>null</code> if a matching customer store visit could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit fetchByStoreAndCustomer_Last(
        long storelocationId, long customerId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByStoreAndCustomer(storelocationId, customerId);

        if (count == 0) {
            return null;
        }

        List<CustomerStoreVisit> list = findByStoreAndCustomer(storelocationId,
                customerId, count - 1, count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
    }

    /**
     * Returns the customer store visits before and after the current customer store visit in the ordered set where storelocationId = &#63; and customerId = &#63;.
     *
     * @param customerstorevisitId the primary key of the current customer store visit
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next customer store visit
     * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit[] findByStoreAndCustomer_PrevAndNext(
        long customerstorevisitId, long storelocationId, long customerId,
        OrderByComparator orderByComparator)
        throws NoSuchCustomerStoreVisitException, SystemException {
        CustomerStoreVisit customerStoreVisit = findByPrimaryKey(customerstorevisitId);

        Session session = null;

        try {
            session = openSession();

            CustomerStoreVisit[] array = new CustomerStoreVisitImpl[3];

            array[0] = getByStoreAndCustomer_PrevAndNext(session,
                    customerStoreVisit, storelocationId, customerId,
                    orderByComparator, true);

            array[1] = customerStoreVisit;

            array[2] = getByStoreAndCustomer_PrevAndNext(session,
                    customerStoreVisit, storelocationId, customerId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected CustomerStoreVisit getByStoreAndCustomer_PrevAndNext(
        Session session, CustomerStoreVisit customerStoreVisit,
        long storelocationId, long customerId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CUSTOMERSTOREVISIT_WHERE);

        query.append(_FINDER_COLUMN_STOREANDCUSTOMER_STORELOCATIONID_2);

        query.append(_FINDER_COLUMN_STOREANDCUSTOMER_CUSTOMERID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(CustomerStoreVisitModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(storelocationId);

        qPos.add(customerId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(customerStoreVisit);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<CustomerStoreVisit> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the customer store visits where storelocationId = &#63; and customerId = &#63; from the database.
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByStoreAndCustomer(long storelocationId, long customerId)
        throws SystemException {
        for (CustomerStoreVisit customerStoreVisit : findByStoreAndCustomer(
                storelocationId, customerId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(customerStoreVisit);
        }
    }

    /**
     * Returns the number of customer store visits where storelocationId = &#63; and customerId = &#63;.
     *
     * @param storelocationId the storelocation ID
     * @param customerId the customer ID
     * @return the number of matching customer store visits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByStoreAndCustomer(long storelocationId, long customerId)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_STOREANDCUSTOMER;

        Object[] finderArgs = new Object[] { storelocationId, customerId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_CUSTOMERSTOREVISIT_WHERE);

            query.append(_FINDER_COLUMN_STOREANDCUSTOMER_STORELOCATIONID_2);

            query.append(_FINDER_COLUMN_STOREANDCUSTOMER_CUSTOMERID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(storelocationId);

                qPos.add(customerId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the customer store visit in the entity cache if it is enabled.
     *
     * @param customerStoreVisit the customer store visit
     */
    @Override
    public void cacheResult(CustomerStoreVisit customerStoreVisit) {
        EntityCacheUtil.putResult(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitImpl.class, customerStoreVisit.getPrimaryKey(),
            customerStoreVisit);

        customerStoreVisit.resetOriginalValues();
    }

    /**
     * Caches the customer store visits in the entity cache if it is enabled.
     *
     * @param customerStoreVisits the customer store visits
     */
    @Override
    public void cacheResult(List<CustomerStoreVisit> customerStoreVisits) {
        for (CustomerStoreVisit customerStoreVisit : customerStoreVisits) {
            if (EntityCacheUtil.getResult(
                        CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
                        CustomerStoreVisitImpl.class,
                        customerStoreVisit.getPrimaryKey()) == null) {
                cacheResult(customerStoreVisit);
            } else {
                customerStoreVisit.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all customer store visits.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(CustomerStoreVisitImpl.class.getName());
        }

        EntityCacheUtil.clearCache(CustomerStoreVisitImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the customer store visit.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(CustomerStoreVisit customerStoreVisit) {
        EntityCacheUtil.removeResult(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitImpl.class, customerStoreVisit.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<CustomerStoreVisit> customerStoreVisits) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (CustomerStoreVisit customerStoreVisit : customerStoreVisits) {
            EntityCacheUtil.removeResult(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
                CustomerStoreVisitImpl.class, customerStoreVisit.getPrimaryKey());
        }
    }

    /**
     * Creates a new customer store visit with the primary key. Does not add the customer store visit to the database.
     *
     * @param customerstorevisitId the primary key for the new customer store visit
     * @return the new customer store visit
     */
    @Override
    public CustomerStoreVisit create(long customerstorevisitId) {
        CustomerStoreVisit customerStoreVisit = new CustomerStoreVisitImpl();

        customerStoreVisit.setNew(true);
        customerStoreVisit.setPrimaryKey(customerstorevisitId);

        return customerStoreVisit;
    }

    /**
     * Removes the customer store visit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param customerstorevisitId the primary key of the customer store visit
     * @return the customer store visit that was removed
     * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit remove(long customerstorevisitId)
        throws NoSuchCustomerStoreVisitException, SystemException {
        return remove((Serializable) customerstorevisitId);
    }

    /**
     * Removes the customer store visit with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the customer store visit
     * @return the customer store visit that was removed
     * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit remove(Serializable primaryKey)
        throws NoSuchCustomerStoreVisitException, SystemException {
        Session session = null;

        try {
            session = openSession();

            CustomerStoreVisit customerStoreVisit = (CustomerStoreVisit) session.get(CustomerStoreVisitImpl.class,
                    primaryKey);

            if (customerStoreVisit == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchCustomerStoreVisitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(customerStoreVisit);
        } catch (NoSuchCustomerStoreVisitException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected CustomerStoreVisit removeImpl(
        CustomerStoreVisit customerStoreVisit) throws SystemException {
        customerStoreVisit = toUnwrappedModel(customerStoreVisit);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(customerStoreVisit)) {
                customerStoreVisit = (CustomerStoreVisit) session.get(CustomerStoreVisitImpl.class,
                        customerStoreVisit.getPrimaryKeyObj());
            }

            if (customerStoreVisit != null) {
                session.delete(customerStoreVisit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (customerStoreVisit != null) {
            clearCache(customerStoreVisit);
        }

        return customerStoreVisit;
    }

    @Override
    public CustomerStoreVisit updateImpl(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws SystemException {
        customerStoreVisit = toUnwrappedModel(customerStoreVisit);

        boolean isNew = customerStoreVisit.isNew();

        CustomerStoreVisitModelImpl customerStoreVisitModelImpl = (CustomerStoreVisitModelImpl) customerStoreVisit;

        Session session = null;

        try {
            session = openSession();

            if (customerStoreVisit.isNew()) {
                session.save(customerStoreVisit);

                customerStoreVisit.setNew(false);
            } else {
                session.merge(customerStoreVisit);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !CustomerStoreVisitModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((customerStoreVisitModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STOREANDCUSTOMER.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        customerStoreVisitModelImpl.getOriginalStorelocationId(),
                        customerStoreVisitModelImpl.getOriginalCustomerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STOREANDCUSTOMER,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STOREANDCUSTOMER,
                    args);

                args = new Object[] {
                        customerStoreVisitModelImpl.getStorelocationId(),
                        customerStoreVisitModelImpl.getCustomerId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_STOREANDCUSTOMER,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_STOREANDCUSTOMER,
                    args);
            }
        }

        EntityCacheUtil.putResult(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
            CustomerStoreVisitImpl.class, customerStoreVisit.getPrimaryKey(),
            customerStoreVisit);

        return customerStoreVisit;
    }

    protected CustomerStoreVisit toUnwrappedModel(
        CustomerStoreVisit customerStoreVisit) {
        if (customerStoreVisit instanceof CustomerStoreVisitImpl) {
            return customerStoreVisit;
        }

        CustomerStoreVisitImpl customerStoreVisitImpl = new CustomerStoreVisitImpl();

        customerStoreVisitImpl.setNew(customerStoreVisit.isNew());
        customerStoreVisitImpl.setPrimaryKey(customerStoreVisit.getPrimaryKey());

        customerStoreVisitImpl.setCustomerstorevisitId(customerStoreVisit.getCustomerstorevisitId());
        customerStoreVisitImpl.setGroupId(customerStoreVisit.getGroupId());
        customerStoreVisitImpl.setCompanyId(customerStoreVisit.getCompanyId());
        customerStoreVisitImpl.setUserId(customerStoreVisit.getUserId());
        customerStoreVisitImpl.setUserName(customerStoreVisit.getUserName());
        customerStoreVisitImpl.setCreateDate(customerStoreVisit.getCreateDate());
        customerStoreVisitImpl.setModifiedDate(customerStoreVisit.getModifiedDate());
        customerStoreVisitImpl.setCustomerId(customerStoreVisit.getCustomerId());
        customerStoreVisitImpl.setStorelocationId(customerStoreVisit.getStorelocationId());

        return customerStoreVisitImpl;
    }

    /**
     * Returns the customer store visit with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the customer store visit
     * @return the customer store visit
     * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit findByPrimaryKey(Serializable primaryKey)
        throws NoSuchCustomerStoreVisitException, SystemException {
        CustomerStoreVisit customerStoreVisit = fetchByPrimaryKey(primaryKey);

        if (customerStoreVisit == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchCustomerStoreVisitException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return customerStoreVisit;
    }

    /**
     * Returns the customer store visit with the primary key or throws a {@link com.visitorapp.NoSuchCustomerStoreVisitException} if it could not be found.
     *
     * @param customerstorevisitId the primary key of the customer store visit
     * @return the customer store visit
     * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit findByPrimaryKey(long customerstorevisitId)
        throws NoSuchCustomerStoreVisitException, SystemException {
        return findByPrimaryKey((Serializable) customerstorevisitId);
    }

    /**
     * Returns the customer store visit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the customer store visit
     * @return the customer store visit, or <code>null</code> if a customer store visit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        CustomerStoreVisit customerStoreVisit = (CustomerStoreVisit) EntityCacheUtil.getResult(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
                CustomerStoreVisitImpl.class, primaryKey);

        if (customerStoreVisit == _nullCustomerStoreVisit) {
            return null;
        }

        if (customerStoreVisit == null) {
            Session session = null;

            try {
                session = openSession();

                customerStoreVisit = (CustomerStoreVisit) session.get(CustomerStoreVisitImpl.class,
                        primaryKey);

                if (customerStoreVisit != null) {
                    cacheResult(customerStoreVisit);
                } else {
                    EntityCacheUtil.putResult(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
                        CustomerStoreVisitImpl.class, primaryKey,
                        _nullCustomerStoreVisit);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(CustomerStoreVisitModelImpl.ENTITY_CACHE_ENABLED,
                    CustomerStoreVisitImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return customerStoreVisit;
    }

    /**
     * Returns the customer store visit with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param customerstorevisitId the primary key of the customer store visit
     * @return the customer store visit, or <code>null</code> if a customer store visit with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public CustomerStoreVisit fetchByPrimaryKey(long customerstorevisitId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) customerstorevisitId);
    }

    /**
     * Returns all the customer store visits.
     *
     * @return the customer store visits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CustomerStoreVisit> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<CustomerStoreVisit> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the customer store visits.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerStoreVisitModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of customer store visits
     * @param end the upper bound of the range of customer store visits (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of customer store visits
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<CustomerStoreVisit> findAll(int start, int end,
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

        List<CustomerStoreVisit> list = (List<CustomerStoreVisit>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CUSTOMERSTOREVISIT);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CUSTOMERSTOREVISIT;

                if (pagination) {
                    sql = sql.concat(CustomerStoreVisitModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<CustomerStoreVisit>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<CustomerStoreVisit>(list);
                } else {
                    list = (List<CustomerStoreVisit>) QueryUtil.list(q,
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
     * Removes all the customer store visits from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (CustomerStoreVisit customerStoreVisit : findAll()) {
            remove(customerStoreVisit);
        }
    }

    /**
     * Returns the number of customer store visits.
     *
     * @return the number of customer store visits
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

                Query q = session.createQuery(_SQL_COUNT_CUSTOMERSTOREVISIT);

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
     * Initializes the customer store visit persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.visitorapp.model.CustomerStoreVisit")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<CustomerStoreVisit>> listenersList = new ArrayList<ModelListener<CustomerStoreVisit>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<CustomerStoreVisit>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(CustomerStoreVisitImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
