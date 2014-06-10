package com.visitorapp.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.visitorapp.service.http.CustomerServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.visitorapp.service.http.CustomerServiceSoap
 * @generated
 */
public class CustomerSoap implements Serializable {
    private long _customerId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _name;
    private String _picture;
    private String _email;

    public CustomerSoap() {
    }

    public static CustomerSoap toSoapModel(Customer model) {
        CustomerSoap soapModel = new CustomerSoap();

        soapModel.setCustomerId(model.getCustomerId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setName(model.getName());
        soapModel.setPicture(model.getPicture());
        soapModel.setEmail(model.getEmail());

        return soapModel;
    }

    public static CustomerSoap[] toSoapModels(Customer[] models) {
        CustomerSoap[] soapModels = new CustomerSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static CustomerSoap[][] toSoapModels(Customer[][] models) {
        CustomerSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new CustomerSoap[models.length][models[0].length];
        } else {
            soapModels = new CustomerSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static CustomerSoap[] toSoapModels(List<Customer> models) {
        List<CustomerSoap> soapModels = new ArrayList<CustomerSoap>(models.size());

        for (Customer model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new CustomerSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _customerId;
    }

    public void setPrimaryKey(long pk) {
        setCustomerId(pk);
    }

    public long getCustomerId() {
        return _customerId;
    }

    public void setCustomerId(long customerId) {
        _customerId = customerId;
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

    public String getPicture() {
        return _picture;
    }

    public void setPicture(String picture) {
        _picture = picture;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }
}
