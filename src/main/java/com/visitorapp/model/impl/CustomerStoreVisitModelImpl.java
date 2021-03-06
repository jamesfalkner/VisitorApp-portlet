package com.visitorapp.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.visitorapp.model.CustomerStoreVisit;
import com.visitorapp.model.CustomerStoreVisitModel;
import com.visitorapp.model.CustomerStoreVisitSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CustomerStoreVisit service. Represents a row in the &quot;VisitorApp_CustomerStoreVisit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.visitorapp.model.CustomerStoreVisitModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CustomerStoreVisitImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitImpl
 * @see com.visitorapp.model.CustomerStoreVisit
 * @see com.visitorapp.model.CustomerStoreVisitModel
 * @generated
 */
@JSON(strict = true)
public class CustomerStoreVisitModelImpl extends BaseModelImpl<CustomerStoreVisit>
    implements CustomerStoreVisitModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a customer store visit model instance should use the {@link com.visitorapp.model.CustomerStoreVisit} interface instead.
     */
    public static final String TABLE_NAME = "VisitorApp_CustomerStoreVisit";
    public static final Object[][] TABLE_COLUMNS = {
            { "customerstorevisitId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "customerId", Types.BIGINT },
            { "storelocationId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table VisitorApp_CustomerStoreVisit (customerstorevisitId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,customerId LONG,storelocationId LONG)";
    public static final String TABLE_SQL_DROP = "drop table VisitorApp_CustomerStoreVisit";
    public static final String ORDER_BY_JPQL = " ORDER BY customerStoreVisit.customerstorevisitId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY VisitorApp_CustomerStoreVisit.customerstorevisitId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.visitorapp.model.CustomerStoreVisit"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.visitorapp.model.CustomerStoreVisit"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.visitorapp.model.CustomerStoreVisit"),
            true);
    public static long CUSTOMERID_COLUMN_BITMASK = 1L;
    public static long STORELOCATIONID_COLUMN_BITMASK = 2L;
    public static long CUSTOMERSTOREVISITID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.visitorapp.model.CustomerStoreVisit"));
    private static ClassLoader _classLoader = CustomerStoreVisit.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            CustomerStoreVisit.class
        };
    private long _customerstorevisitId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _customerId;
    private long _originalCustomerId;
    private boolean _setOriginalCustomerId;
    private long _storelocationId;
    private long _originalStorelocationId;
    private boolean _setOriginalStorelocationId;
    private long _columnBitmask;
    private CustomerStoreVisit _escapedModel;

    public CustomerStoreVisitModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static CustomerStoreVisit toModel(CustomerStoreVisitSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        CustomerStoreVisit model = new CustomerStoreVisitImpl();

        model.setCustomerstorevisitId(soapModel.getCustomerstorevisitId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setUserName(soapModel.getUserName());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setCustomerId(soapModel.getCustomerId());
        model.setStorelocationId(soapModel.getStorelocationId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<CustomerStoreVisit> toModels(
        CustomerStoreVisitSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<CustomerStoreVisit> models = new ArrayList<CustomerStoreVisit>(soapModels.length);

        for (CustomerStoreVisitSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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

    @JSON
    @Override
    public long getCustomerstorevisitId() {
        return _customerstorevisitId;
    }

    @Override
    public void setCustomerstorevisitId(long customerstorevisitId) {
        _customerstorevisitId = customerstorevisitId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public long getCustomerId() {
        return _customerId;
    }

    @Override
    public void setCustomerId(long customerId) {
        _columnBitmask |= CUSTOMERID_COLUMN_BITMASK;

        if (!_setOriginalCustomerId) {
            _setOriginalCustomerId = true;

            _originalCustomerId = _customerId;
        }

        _customerId = customerId;
    }

    public long getOriginalCustomerId() {
        return _originalCustomerId;
    }

    @JSON
    @Override
    public long getStorelocationId() {
        return _storelocationId;
    }

    @Override
    public void setStorelocationId(long storelocationId) {
        _columnBitmask |= STORELOCATIONID_COLUMN_BITMASK;

        if (!_setOriginalStorelocationId) {
            _setOriginalStorelocationId = true;

            _originalStorelocationId = _storelocationId;
        }

        _storelocationId = storelocationId;
    }

    public long getOriginalStorelocationId() {
        return _originalStorelocationId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            CustomerStoreVisit.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public CustomerStoreVisit toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (CustomerStoreVisit) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        CustomerStoreVisitImpl customerStoreVisitImpl = new CustomerStoreVisitImpl();

        customerStoreVisitImpl.setCustomerstorevisitId(getCustomerstorevisitId());
        customerStoreVisitImpl.setGroupId(getGroupId());
        customerStoreVisitImpl.setCompanyId(getCompanyId());
        customerStoreVisitImpl.setUserId(getUserId());
        customerStoreVisitImpl.setUserName(getUserName());
        customerStoreVisitImpl.setCreateDate(getCreateDate());
        customerStoreVisitImpl.setModifiedDate(getModifiedDate());
        customerStoreVisitImpl.setCustomerId(getCustomerId());
        customerStoreVisitImpl.setStorelocationId(getStorelocationId());

        customerStoreVisitImpl.resetOriginalValues();

        return customerStoreVisitImpl;
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

        if (!(obj instanceof CustomerStoreVisit)) {
            return false;
        }

        CustomerStoreVisit customerStoreVisit = (CustomerStoreVisit) obj;

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
    public void resetOriginalValues() {
        CustomerStoreVisitModelImpl customerStoreVisitModelImpl = this;

        customerStoreVisitModelImpl._originalCustomerId = customerStoreVisitModelImpl._customerId;

        customerStoreVisitModelImpl._setOriginalCustomerId = false;

        customerStoreVisitModelImpl._originalStorelocationId = customerStoreVisitModelImpl._storelocationId;

        customerStoreVisitModelImpl._setOriginalStorelocationId = false;

        customerStoreVisitModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<CustomerStoreVisit> toCacheModel() {
        CustomerStoreVisitCacheModel customerStoreVisitCacheModel = new CustomerStoreVisitCacheModel();

        customerStoreVisitCacheModel.customerstorevisitId = getCustomerstorevisitId();

        customerStoreVisitCacheModel.groupId = getGroupId();

        customerStoreVisitCacheModel.companyId = getCompanyId();

        customerStoreVisitCacheModel.userId = getUserId();

        customerStoreVisitCacheModel.userName = getUserName();

        String userName = customerStoreVisitCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            customerStoreVisitCacheModel.userName = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            customerStoreVisitCacheModel.createDate = createDate.getTime();
        } else {
            customerStoreVisitCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            customerStoreVisitCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            customerStoreVisitCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        customerStoreVisitCacheModel.customerId = getCustomerId();

        customerStoreVisitCacheModel.storelocationId = getStorelocationId();

        return customerStoreVisitCacheModel;
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
