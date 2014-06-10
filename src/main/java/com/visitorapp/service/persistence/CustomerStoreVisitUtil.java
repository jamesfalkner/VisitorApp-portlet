package com.visitorapp.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.visitorapp.model.CustomerStoreVisit;

import java.util.List;

/**
 * The persistence utility for the customer store visit service. This utility wraps {@link CustomerStoreVisitPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitPersistence
 * @see CustomerStoreVisitPersistenceImpl
 * @generated
 */
public class CustomerStoreVisitUtil {
    private static CustomerStoreVisitPersistence _persistence;

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
    public static void clearCache(CustomerStoreVisit customerStoreVisit) {
        getPersistence().clearCache(customerStoreVisit);
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
    public static List<CustomerStoreVisit> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<CustomerStoreVisit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<CustomerStoreVisit> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static CustomerStoreVisit update(
        CustomerStoreVisit customerStoreVisit) throws SystemException {
        return getPersistence().update(customerStoreVisit);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static CustomerStoreVisit update(
        CustomerStoreVisit customerStoreVisit, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(customerStoreVisit, serviceContext);
    }

    /**
    * Returns all the customer store visits where storelocationId = &#63; and customerId = &#63;.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @return the matching customer store visits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.visitorapp.model.CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStoreAndCustomer(storelocationId, customerId);
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
    public static java.util.List<com.visitorapp.model.CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStoreAndCustomer(storelocationId, customerId, start,
            end);
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
    public static java.util.List<com.visitorapp.model.CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByStoreAndCustomer(storelocationId, customerId, start,
            end, orderByComparator);
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
    public static com.visitorapp.model.CustomerStoreVisit findByStoreAndCustomer_First(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException {
        return getPersistence()
                   .findByStoreAndCustomer_First(storelocationId, customerId,
            orderByComparator);
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
    public static com.visitorapp.model.CustomerStoreVisit fetchByStoreAndCustomer_First(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStoreAndCustomer_First(storelocationId, customerId,
            orderByComparator);
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
    public static com.visitorapp.model.CustomerStoreVisit findByStoreAndCustomer_Last(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException {
        return getPersistence()
                   .findByStoreAndCustomer_Last(storelocationId, customerId,
            orderByComparator);
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
    public static com.visitorapp.model.CustomerStoreVisit fetchByStoreAndCustomer_Last(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByStoreAndCustomer_Last(storelocationId, customerId,
            orderByComparator);
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
    public static com.visitorapp.model.CustomerStoreVisit[] findByStoreAndCustomer_PrevAndNext(
        long customerstorevisitId, long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException {
        return getPersistence()
                   .findByStoreAndCustomer_PrevAndNext(customerstorevisitId,
            storelocationId, customerId, orderByComparator);
    }

    /**
    * Removes all the customer store visits where storelocationId = &#63; and customerId = &#63; from the database.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByStoreAndCustomer(long storelocationId,
        long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByStoreAndCustomer(storelocationId, customerId);
    }

    /**
    * Returns the number of customer store visits where storelocationId = &#63; and customerId = &#63;.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @return the number of matching customer store visits
    * @throws SystemException if a system exception occurred
    */
    public static int countByStoreAndCustomer(long storelocationId,
        long customerId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByStoreAndCustomer(storelocationId, customerId);
    }

    /**
    * Caches the customer store visit in the entity cache if it is enabled.
    *
    * @param customerStoreVisit the customer store visit
    */
    public static void cacheResult(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit) {
        getPersistence().cacheResult(customerStoreVisit);
    }

    /**
    * Caches the customer store visits in the entity cache if it is enabled.
    *
    * @param customerStoreVisits the customer store visits
    */
    public static void cacheResult(
        java.util.List<com.visitorapp.model.CustomerStoreVisit> customerStoreVisits) {
        getPersistence().cacheResult(customerStoreVisits);
    }

    /**
    * Creates a new customer store visit with the primary key. Does not add the customer store visit to the database.
    *
    * @param customerstorevisitId the primary key for the new customer store visit
    * @return the new customer store visit
    */
    public static com.visitorapp.model.CustomerStoreVisit create(
        long customerstorevisitId) {
        return getPersistence().create(customerstorevisitId);
    }

    /**
    * Removes the customer store visit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit that was removed
    * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.CustomerStoreVisit remove(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException {
        return getPersistence().remove(customerstorevisitId);
    }

    public static com.visitorapp.model.CustomerStoreVisit updateImpl(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(customerStoreVisit);
    }

    /**
    * Returns the customer store visit with the primary key or throws a {@link com.visitorapp.NoSuchCustomerStoreVisitException} if it could not be found.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit
    * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.CustomerStoreVisit findByPrimaryKey(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException {
        return getPersistence().findByPrimaryKey(customerstorevisitId);
    }

    /**
    * Returns the customer store visit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit, or <code>null</code> if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.visitorapp.model.CustomerStoreVisit fetchByPrimaryKey(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(customerstorevisitId);
    }

    /**
    * Returns all the customer store visits.
    *
    * @return the customer store visits
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.visitorapp.model.CustomerStoreVisit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.visitorapp.model.CustomerStoreVisit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
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
    public static java.util.List<com.visitorapp.model.CustomerStoreVisit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the customer store visits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of customer store visits.
    *
    * @return the number of customer store visits
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static CustomerStoreVisitPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (CustomerStoreVisitPersistence) PortletBeanLocatorUtil.locate(com.visitorapp.service.ClpSerializer.getServletContextName(),
                    CustomerStoreVisitPersistence.class.getName());

            ReferenceRegistry.registerReference(CustomerStoreVisitUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(CustomerStoreVisitPersistence persistence) {
    }
}
