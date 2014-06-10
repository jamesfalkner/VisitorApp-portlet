package com.visitorapp.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.visitorapp.service.http.StoreLocationServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.visitorapp.service.http.StoreLocationServiceSoap
 * @generated
 */
public class StoreLocationSoap implements Serializable {
    private long _storelocationId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _address;

    public StoreLocationSoap() {
    }

    public static StoreLocationSoap toSoapModel(StoreLocation model) {
        StoreLocationSoap soapModel = new StoreLocationSoap();

        soapModel.setStorelocationId(model.getStorelocationId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setAddress(model.getAddress());

        return soapModel;
    }

    public static StoreLocationSoap[] toSoapModels(StoreLocation[] models) {
        StoreLocationSoap[] soapModels = new StoreLocationSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static StoreLocationSoap[][] toSoapModels(StoreLocation[][] models) {
        StoreLocationSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new StoreLocationSoap[models.length][models[0].length];
        } else {
            soapModels = new StoreLocationSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static StoreLocationSoap[] toSoapModels(List<StoreLocation> models) {
        List<StoreLocationSoap> soapModels = new ArrayList<StoreLocationSoap>(models.size());

        for (StoreLocation model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new StoreLocationSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _storelocationId;
    }

    public void setPrimaryKey(long pk) {
        setStorelocationId(pk);
    }

    public long getStorelocationId() {
        return _storelocationId;
    }

    public void setStorelocationId(long storelocationId) {
        _storelocationId = storelocationId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getAddress() {
        return _address;
    }

    public void setAddress(String address) {
        _address = address;
    }
}
