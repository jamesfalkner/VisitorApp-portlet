package com.visitorapp.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.visitorapp.service.http.CustomerStoreVisitServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.visitorapp.service.http.CustomerStoreVisitServiceSoap
 * @generated
 */
public class CustomerStoreVisitSoap implements Serializable {
    private long _customerstorevisitId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _customerId;
    private long _storelocationId;

    public CustomerStoreVisitSoap() {
    }

    public static CustomerStoreVisitSoap toSoapModel(CustomerStoreVisit model) {
        CustomerStoreVisitSoap soapModel = new CustomerStoreVisitSoap();

        soapModel.setCustomerstorevisitId(model.getCustomerstorevisitId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setCustomerId(model.getCustomerId());
        soapModel.setStorelocationId(model.getStorelocationId());

        return soapModel;
    }

    public static CustomerStoreVisitSoap[] toSoapModels(
        CustomerStoreVisit[] models) {
        CustomerStoreVisitSoap[] soapModels = new CustomerStoreVisitSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CustomerStoreVisitSoap[][] toSoapModels(
        CustomerStoreVisit[][] models) {
        CustomerStoreVisitSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CustomerStoreVisitSoap[models.length][models[0].length];
        } else {
            soapModels = new CustomerStoreVisitSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CustomerStoreVisitSoap[] toSoapModels(
        List<CustomerStoreVisit> models) {
        List<CustomerStoreVisitSoap> soapModels = new ArrayList<CustomerStoreVisitSoap>(models.size());

        for (CustomerStoreVisit model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CustomerStoreVisitSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _customerstorevisitId;
    }

    public void setPrimaryKey(long pk) {
        setCustomerstorevisitId(pk);
    }

    public long getCustomerstorevisitId() {
        return _customerstorevisitId;
    }

    public void setCustomerstorevisitId(long customerstorevisitId) {
        _customerstorevisitId = customerstorevisitId;
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

    public long getCustomerId() {
        return _customerId;
    }

    public void setCustomerId(long customerId) {
        _customerId = customerId;
    }

    public long getStorelocationId() {
        return _storelocationId;
    }

    public void setStorelocationId(long storelocationId) {
        _storelocationId = storelocationId;
    }
}
