package com.visitorapp.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StoreLocation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocation
 * @generated
 */
public class StoreLocationWrapper implements StoreLocation,
    ModelWrapper<StoreLocation> {
    private StoreLocation _storeLocation;

    public StoreLocationWrapper(StoreLocation storeLocation) {
        _storeLocation = storeLocation;
    }

    @Override
    public Class<?> getModelClass() {
        return StoreLocation.class;
    }

    @Override
    public String getModelClassName() {
        return StoreLocation.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("storelocationId", getStorelocationId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("name", getName());
        attributes.put("address", getAddress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long storelocationId = (Long) attributes.get("storelocationId");

        if (storelocationId != null) {
            setStorelocationId(storelocationId);
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

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String address = (String) attributes.get("address");

        if (address != null) {
            setAddress(address);
        }
    }

    /**
    * Returns the primary key of this store location.
    *
    * @return the primary key of this store location
    */
    @Override
    public long getPrimaryKey() {
        return _storeLocation.getPrimaryKey();
    }

    /**
    * Sets the primary key of this store location.
    *
    * @param primaryKey the primary key of this store location
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _storeLocation.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the storelocation ID of this store location.
    *
    * @return the storelocation ID of this store location
    */
    @Override
    public long getStorelocationId() {
        return _storeLocation.getStorelocationId();
    }

    /**
    * Sets the storelocation ID of this store location.
    *
    * @param storelocationId the storelocation ID of this store location
    */
    @Override
    public void setStorelocationId(long storelocationId) {
        _storeLocation.setStorelocationId(storelocationId);
    }

    /**
    * Returns the group ID of this store location.
    *
    * @return the group ID of this store location
    */
    @Override
    public long getGroupId() {
        return _storeLocation.getGroupId();
    }

    /**
    * Sets the group ID of this store location.
    *
    * @param groupId the group ID of this store location
    */
    @Override
    public void setGroupId(long groupId) {
        _storeLocation.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this store location.
    *
    * @return the company ID of this store location
    */
    @Override
    public long getCompanyId() {
        return _storeLocation.getCompanyId();
    }

    /**
    * Sets the company ID of this store location.
    *
    * @param companyId the company ID of this store location
    */
    @Override
    public void setCompanyId(long companyId) {
        _storeLocation.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this store location.
    *
    * @return the user ID of this store location
    */
    @Override
    public long getUserId() {
        return _storeLocation.getUserId();
    }

    /**
    * Sets the user ID of this store location.
    *
    * @param userId the user ID of this store location
    */
    @Override
    public void setUserId(long userId) {
        _storeLocation.setUserId(userId);
    }

    /**
    * Returns the user uuid of this store location.
    *
    * @return the user uuid of this store location
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _storeLocation.getUserUuid();
    }

    /**
    * Sets the user uuid of this store location.
    *
    * @param userUuid the user uuid of this store location
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _storeLocation.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this store location.
    *
    * @return the user name of this store location
    */
    @Override
    public java.lang.String getUserName() {
        return _storeLocation.getUserName();
    }

    /**
    * Sets the user name of this store location.
    *
    * @param userName the user name of this store location
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _storeLocation.setUserName(userName);
    }

    /**
    * Returns the create date of this store location.
    *
    * @return the create date of this store location
    */
    @Override
    public java.util.Date getCreateDate() {
        return _storeLocation.getCreateDate();
    }

    /**
    * Sets the create date of this store location.
    *
    * @param createDate the create date of this store location
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _storeLocation.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this store location.
    *
    * @return the modified date of this store location
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _storeLocation.getModifiedDate();
    }

    /**
    * Sets the modified date of this store location.
    *
    * @param modifiedDate the modified date of this store location
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _storeLocation.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the name of this store location.
    *
    * @return the name of this store location
    */
    @Override
    public java.lang.String getName() {
        return _storeLocation.getName();
    }

    /**
    * Sets the name of this store location.
    *
    * @param name the name of this store location
    */
    @Override
    public void setName(java.lang.String name) {
        _storeLocation.setName(name);
    }

    /**
    * Returns the address of this store location.
    *
    * @return the address of this store location
    */
    @Override
    public java.lang.String getAddress() {
        return _storeLocation.getAddress();
    }

    /**
    * Sets the address of this store location.
    *
    * @param address the address of this store location
    */
    @Override
    public void setAddress(java.lang.String address) {
        _storeLocation.setAddress(address);
    }

    @Override
    public boolean isNew() {
        return _storeLocation.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _storeLocation.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _storeLocation.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _storeLocation.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _storeLocation.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _storeLocation.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _storeLocation.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _storeLocation.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _storeLocation.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _storeLocation.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _storeLocation.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new StoreLocationWrapper((StoreLocation) _storeLocation.clone());
    }

    @Override
    public int compareTo(com.visitorapp.model.StoreLocation storeLocation) {
        return _storeLocation.compareTo(storeLocation);
    }

    @Override
    public int hashCode() {
        return _storeLocation.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.visitorapp.model.StoreLocation> toCacheModel() {
        return _storeLocation.toCacheModel();
    }

    @Override
    public com.visitorapp.model.StoreLocation toEscapedModel() {
        return new StoreLocationWrapper(_storeLocation.toEscapedModel());
    }

    @Override
    public com.visitorapp.model.StoreLocation toUnescapedModel() {
        return new StoreLocationWrapper(_storeLocation.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _storeLocation.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _storeLocation.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _storeLocation.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof StoreLocationWrapper)) {
            return false;
        }

        StoreLocationWrapper storeLocationWrapper = (StoreLocationWrapper) obj;

        if (Validator.equals(_storeLocation, storeLocationWrapper._storeLocation)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public StoreLocation getWrappedStoreLocation() {
        return _storeLocation;
    }

    @Override
    public StoreLocation getWrappedModel() {
        return _storeLocation;
    }

    @Override
    public void resetOriginalValues() {
        _storeLocation.resetOriginalValues();
    }
}
