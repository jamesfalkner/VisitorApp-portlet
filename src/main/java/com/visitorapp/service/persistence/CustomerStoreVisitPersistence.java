package com.visitorapp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.visitorapp.model.CustomerStoreVisit;

/**
 * The persistence interface for the customer store visit service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitPersistenceImpl
 * @see CustomerStoreVisitUtil
 * @generated
 */
public interface CustomerStoreVisitPersistence extends BasePersistence<CustomerStoreVisit> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CustomerStoreVisitUtil} to access the customer store visit persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the customer store visits where storelocationId = &#63; and customerId = &#63;.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @return the matching customer store visits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> findByStoreAndCustomer(
        long storelocationId, long customerId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.visitorapp.model.CustomerStoreVisit findByStoreAndCustomer_First(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException;

    /**
    * Returns the first customer store visit in the ordered set where storelocationId = &#63; and customerId = &#63;.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching customer store visit, or <code>null</code> if a matching customer store visit could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit fetchByStoreAndCustomer_First(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.visitorapp.model.CustomerStoreVisit findByStoreAndCustomer_Last(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException;

    /**
    * Returns the last customer store visit in the ordered set where storelocationId = &#63; and customerId = &#63;.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching customer store visit, or <code>null</code> if a matching customer store visit could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit fetchByStoreAndCustomer_Last(
        long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.visitorapp.model.CustomerStoreVisit[] findByStoreAndCustomer_PrevAndNext(
        long customerstorevisitId, long storelocationId, long customerId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException;

    /**
    * Removes all the customer store visits where storelocationId = &#63; and customerId = &#63; from the database.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByStoreAndCustomer(long storelocationId, long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of customer store visits where storelocationId = &#63; and customerId = &#63;.
    *
    * @param storelocationId the storelocation ID
    * @param customerId the customer ID
    * @return the number of matching customer store visits
    * @throws SystemException if a system exception occurred
    */
    public int countByStoreAndCustomer(long storelocationId, long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the customer store visit in the entity cache if it is enabled.
    *
    * @param customerStoreVisit the customer store visit
    */
    public void cacheResult(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit);

    /**
    * Caches the customer store visits in the entity cache if it is enabled.
    *
    * @param customerStoreVisits the customer store visits
    */
    public void cacheResult(
        java.util.List<com.visitorapp.model.CustomerStoreVisit> customerStoreVisits);

    /**
    * Creates a new customer store visit with the primary key. Does not add the customer store visit to the database.
    *
    * @param customerstorevisitId the primary key for the new customer store visit
    * @return the new customer store visit
    */
    public com.visitorapp.model.CustomerStoreVisit create(
        long customerstorevisitId);

    /**
    * Removes the customer store visit with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit that was removed
    * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit remove(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException;

    public com.visitorapp.model.CustomerStoreVisit updateImpl(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the customer store visit with the primary key or throws a {@link com.visitorapp.NoSuchCustomerStoreVisitException} if it could not be found.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit
    * @throws com.visitorapp.NoSuchCustomerStoreVisitException if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit findByPrimaryKey(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerStoreVisitException;

    /**
    * Returns the customer store visit with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param customerstorevisitId the primary key of the customer store visit
    * @return the customer store visit, or <code>null</code> if a customer store visit with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.CustomerStoreVisit fetchByPrimaryKey(
        long customerstorevisitId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the customer store visits.
    *
    * @return the customer store visits
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.visitorapp.model.CustomerStoreVisit> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the customer store visits from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of customer store visits.
    *
    * @return the number of customer store visits
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
