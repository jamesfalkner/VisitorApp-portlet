package com.visitorapp.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.visitorapp.service.ClpSerializer;
import com.visitorapp.service.CustomerStoreVisitLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class CustomerStoreVisitClp extends BaseModelImpl<CustomerStoreVisit>
    implements CustomerStoreVisit {
    private long _customerstorevisitId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _customerId;
    private long _storelocationId;
    private BaseModel<?> _customerStoreVisitRemoteModel;

    public CustomerStoreVisitClp() {
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
    public long getPrimaryKey() {
        return _customerstorevisitId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setCustomerstorevisitId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _customerstorevisitId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getCustomerstorevisitId() {
        return _customerstorevisitId;
    }

    @Override
    public void setCustomerstorevisitId(long customerstorevisitId) {
        _customerstorevisitId = customerstorevisitId;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerstorevisitId",
                        long.class);

                method.invoke(_customerStoreVisitRemoteModel,
                    customerstorevisitId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_customerStoreVisitRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_customerStoreVisitRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_customerStoreVisitRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_customerStoreVisitRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_customerStoreVisitRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_customerStoreVisitRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCustomerId() {
        return _customerId;
    }

    @Override
    public void setCustomerId(long customerId) {
        _customerId = customerId;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setCustomerId", long.class);

                method.invoke(_customerStoreVisitRemoteModel, customerId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getStorelocationId() {
        return _storelocationId;
    }

    @Override
    public void setStorelocationId(long storelocationId) {
        _storelocationId = storelocationId;

        if (_customerStoreVisitRemoteModel != null) {
            try {
                Class<?> clazz = _customerStoreVisitRemoteModel.getClass();

                Method method = clazz.getMethod("setStorelocationId", long.class);

                method.invoke(_customerStoreVisitRemoteModel, storelocationId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public com.visitorapp.model.StoreLocation getStoreLocation() {
        try {
            String methodName = "getStoreLocation";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            com.visitorapp.model.StoreLocation returnObj = (com.visitorapp.model.StoreLocation) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    @Override
    public com.visitorapp.model.Customer getCustomer() {
        try {
            String methodName = "getCustomer";

            Class<?>[] parameterTypes = new Class<?>[] {  };

            Object[] parameterValues = new Object[] {  };

            com.visitorapp.model.Customer returnObj = (com.visitorapp.model.Customer) invokeOnRemoteModel(methodName,
                    parameterTypes, parameterValues);

            return returnObj;
        } catch (Exception e) {
            throw new UnsupportedOperationException(e);
        }
    }

    public BaseModel<?> getCustomerStoreVisitRemoteModel() {
        return _customerStoreVisitRemoteModel;
    }

    public void setCustomerStoreVisitRemoteModel(
        BaseModel<?> customerStoreVisitRemoteModel) {
        _customerStoreVisitRemoteModel = customerStoreVisitRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _customerStoreVisitRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_customerStoreVisitRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            CustomerStoreVisitLocalServiceUtil.addCustomerStoreVisit(this);
        } else {
            CustomerStoreVisitLocalServiceUtil.updateCustomerStoreVisit(this);
        }
    }

    @Override
    public CustomerStoreVisit toEscapedModel() {
        return (CustomerStoreVisit) ProxyUtil.newProxyInstance(CustomerStoreVisit.class.getClassLoader(),
            new Class[] { CustomerStoreVisit.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        CustomerStoreVisitClp clone = new CustomerStoreVisitClp();

        clone.setCustomerstorevisitId(getCustomerstorevisitId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setCustomerId(getCustomerId());
        clone.setStorelocationId(getStorelocationId());

        return clone;
    }

    @Override
    public int compareTo(CustomerStoreVisit customerStoreVisit) {
        long primaryKey = customerStoreVisit.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof CustomerStoreVisitClp)) {
            return false;
        }

        CustomerStoreVisitClp customerStoreVisit = (CustomerStoreVisitClp) obj;

        long primaryKey = customerStoreVisit.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{customerstorevisitId=");
        sb.append(getCustomerstorevisitId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", customerId=");
        sb.append(getCustomerId());
        sb.append(", storelocationId=");
        sb.append(getStorelocationId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.visitorapp.model.CustomerStoreVisit");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>customerstorevisitId</column-name><column-value><![CDATA[");
        sb.append(getCustomerstorevisitId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>customerId</column-name><column-value><![CDATA[");
        sb.append(getCustomerId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>storelocationId</column-name><column-value><![CDATA[");
        sb.append(getStorelocationId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
