package com.visitorapp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.visitorapp.model.Customer;

/**
 * The persistence interface for the customer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerPersistenceImpl
 * @see CustomerUtil
 * @generated
 */
public interface CustomerPersistence extends BasePersistence<Customer> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link CustomerUtil} to access the customer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the customer in the entity cache if it is enabled.
    *
    * @param customer the customer
    */
    public void cacheResult(com.visitorapp.model.Customer customer);

    /**
    * Caches the customers in the entity cache if it is enabled.
    *
    * @param customers the customers
    */
    public void cacheResult(
        java.util.List<com.visitorapp.model.Customer> customers);

    /**
    * Creates a new customer with the primary key. Does not add the customer to the database.
    *
    * @param customerId the primary key for the new customer
    * @return the new customer
    */
    public com.visitorapp.model.Customer create(long customerId);

    /**
    * Removes the customer with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param customerId the primary key of the customer
    * @return the customer that was removed
    * @throws com.visitorapp.NoSuchCustomerException if a customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.Customer remove(long customerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerException;

    public com.visitorapp.model.Customer updateImpl(
        com.visitorapp.model.Customer customer)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the customer with the primary key or throws a {@link com.visitorapp.NoSuchCustomerException} if it could not be found.
    *
    * @param customerId the primary key of the customer
    * @return the customer
    * @throws com.visitorapp.NoSuchCustomerException if a customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.Customer findByPrimaryKey(long customerId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.visitorapp.NoSuchCustomerException;

    /**
    * Returns the customer with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param customerId the primary key of the customer
    * @return the customer, or <code>null</code> if a customer with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.visitorapp.model.Customer fetchByPrimaryKey(long customerId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the customers.
    *
    * @return the customers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.visitorapp.model.Customer> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the customers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of customers
    * @param end the upper bound of the range of customers (not inclusive)
    * @return the range of customers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.visitorapp.model.Customer> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the customers.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.visitorapp.model.impl.CustomerModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of customers
    * @param end the upper bound of the range of customers (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of customers
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.visitorapp.model.Customer> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the customers from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of customers.
    *
    * @return the number of customers
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
