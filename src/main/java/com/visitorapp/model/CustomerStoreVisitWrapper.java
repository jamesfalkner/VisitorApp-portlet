package com.visitorapp.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CustomerStoreVisit}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisit
 * @generated
 */
public class CustomerStoreVisitWrapper implements CustomerStoreVisit,
    ModelWrapper<CustomerStoreVisit> {
    private CustomerStoreVisit _customerStoreVisit;

    public CustomerStoreVisitWrapper(CustomerStoreVisit customerStoreVisit) {
        _customerStoreVisit = customerStoreVisit;
    }

    @Override
    public Class<?> getModelClass() {
        return CustomerStoreVisit.class;
    }

    @Override
    public String getModelClassName() {
        return CustomerStoreVisit.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("customerstorevisitId", getCustomerstorevisitId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("customerId", getCustomerId());
        attributes.put("storelocationId", getStorelocationId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long customerstorevisitId = (Long) attributes.get(
                "customerstorevisitId");

        if (customerstorevisitId != null) {
            setCustomerstorevisitId(customerstorevisitId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long customerId = (Long) attributes.get("customerId");

        if (customerId != null) {
            setCustomerId(customerId);
        }

        Long storelocationId = (Long) attributes.get("storelocationId");

        if (storelocationId != null) {
            setStorelocationId(storelocationId);
        }
    }

    /**
    * Returns the primary key of this customer store visit.
    *
    * @return the primary key of this customer store visit
    */
    @Override
    public long getPrimaryKey() {
        return _customerStoreVisit.getPrimaryKey();
    }

    /**
    * Sets the primary key of this customer store visit.
    *
    * @param primaryKey the primary key of this customer store visit
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _customerStoreVisit.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the customerstorevisit ID of this customer store visit.
    *
    * @return the customerstorevisit ID of this customer store visit
    */
    @Override
    public long getCustomerstorevisitId() {
        return _customerStoreVisit.getCustomerstorevisitId();
    }

    /**
    * Sets the customerstorevisit ID of this customer store visit.
    *
    * @param customerstorevisitId the customerstorevisit ID of this customer store visit
    */
    @Override
    public void setCustomerstorevisitId(long customerstorevisitId) {
        _customerStoreVisit.setCustomerstorevisitId(customerstorevisitId);
    }

    /**
    * Returns the group ID of this customer store visit.
    *
    * @return the group ID of this customer store visit
    */
    @Override
    public long getGroupId() {
        return _customerStoreVisit.getGroupId();
    }

    /**
    * Sets the group ID of this customer store visit.
    *
    * @param groupId the group ID of this customer store visit
    */
    @Override
    public void setGroupId(long groupId) {
        _customerStoreVisit.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this customer store visit.
    *
    * @return the company ID of this customer store visit
    */
    @Override
    public long getCompanyId() {
        return _customerStoreVisit.getCompanyId();
    }

    /**
    * Sets the company ID of this customer store visit.
    *
    * @param companyId the company ID of this customer store visit
    */
    @Override
    public void setCompanyId(long companyId) {
        _customerStoreVisit.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this customer store visit.
    *
    * @return the user ID of this customer store visit
    */
    @Override
    public long getUserId() {
        return _customerStoreVisit.getUserId();
    }

    /**
    * Sets the user ID of this customer store visit.
    *
    * @param userId the user ID of this customer store visit
    */
    @Override
    public void setUserId(long userId) {
        _customerStoreVisit.setUserId(userId);
    }

    /**
    * Returns the user uuid of this customer store visit.
    *
    * @return the user uuid of this customer store visit
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisit.getUserUuid();
    }

    /**
    * Sets the user uuid of this customer store visit.
    *
    * @param userUuid the user uuid of this customer store visit
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _customerStoreVisit.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this customer store visit.
    *
    * @return the user name of this customer store visit
    */
    @Override
    public java.lang.String getUserName() {
        return _customerStoreVisit.getUserName();
    }

    /**
    * Sets the user name of this customer store visit.
    *
    * @param userName the user name of this customer store visit
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _customerStoreVisit.setUserName(userName);
    }

    /**
    * Returns the create date of this customer store visit.
    *
    * @return the create date of this customer store visit
    */
    @Override
    public java.util.Date getCreateDate() {
        return _customerStoreVisit.getCreateDate();
    }

    /**
    * Sets the create date of this customer store visit.
    *
    * @param createDate the create date of this customer store visit
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _customerStoreVisit.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this customer store visit.
    *
    * @return the modified date of this customer store visit
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _customerStoreVisit.getModifiedDate();
    }

    /**
    * Sets the modified date of this customer store visit.
    *
    * @param modifiedDate the modified date of this customer store visit
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _customerStoreVisit.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the customer ID of this customer store visit.
    *
    * @return the customer ID of this customer store visit
    */
    @Override
    public long getCustomerId() {
        return _customerStoreVisit.getCustomerId();
    }

    /**
    * Sets the customer ID of this customer store visit.
    *
    * @param customerId the customer ID of this customer store visit
    */
    @Override
    public void setCustomerId(long customerId) {
        _customerStoreVisit.setCustomerId(customerId);
    }

    /**
    * Returns the storelocation ID of this customer store visit.
    *
    * @return the storelocation ID of this customer store visit
    */
    @Override
    public long getStorelocationId() {
        return _customerStoreVisit.getStorelocationId();
    }

    /**
    * Sets the storelocation ID of this customer store visit.
    *
    * @param storelocationId the storelocation ID of this customer store visit
    */
    @Override
    public void setStorelocationId(long storelocationId) {
        _customerStoreVisit.setStorelocationId(storelocationId);
    }

    @Override
    public boolean isNew() {
        return _customerStoreVisit.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _customerStoreVisit.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _customerStoreVisit.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _customerStoreVisit.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _customerStoreVisit.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _customerStoreVisit.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _customerStoreVisit.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _customerStoreVisit.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _customerStoreVisit.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _customerStoreVisit.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _customerStoreVisit.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new CustomerStoreVisitWrapper((CustomerStoreVisit) _customerStoreVisit.clone());
    }

    @Override
    public int compareTo(
        com.visitorapp.model.CustomerStoreVisit customerStoreVisit) {
        return _customerStoreVisit.compareTo(customerStoreVisit);
    }

    @Override
    public int hashCode() {
        return _customerStoreVisit.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.visitorapp.model.CustomerStoreVisit> toCacheModel() {
        return _customerStoreVisit.toCacheModel();
    }

    @Override
    public com.visitorapp.model.CustomerStoreVisit toEscapedModel() {
        return new CustomerStoreVisitWrapper(_customerStoreVisit.toEscapedModel());
    }

    @Override
    public com.visitorapp.model.CustomerStoreVisit toUnescapedModel() {
        return new CustomerStoreVisitWrapper(_customerStoreVisit.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _customerStoreVisit.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _customerStoreVisit.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _customerStoreVisit.persist();
    }

    @Override
    public com.visitorapp.model.Customer getCustomer()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisit.getCustomer();
    }

    @Override
    public com.visitorapp.model.StoreLocation getStoreLocation()
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _customerStoreVisit.getStoreLocation();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CustomerStoreVisitWrapper)) {
            return false;
        }

        CustomerStoreVisitWrapper customerStoreVisitWrapper = (CustomerStoreVisitWrapper) obj;

        if (Validator.equals(_customerStoreVisit,
                    customerStoreVisitWrapper._customerStoreVisit)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public CustomerStoreVisit getWrappedCustomerStoreVisit() {
        return _customerStoreVisit;
    }

    @Override
    public CustomerStoreVisit getWrappedModel() {
        return _customerStoreVisit;
    }

    @Override
    public void resetOriginalValues() {
        _customerStoreVisit.resetOriginalValues();
    }
}
