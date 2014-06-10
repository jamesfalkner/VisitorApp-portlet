package com.visitorapp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.visitorapp.model.CustomerStoreVisit;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing CustomerStoreVisit in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisit
 * @generated
 */
public class CustomerStoreVisitCacheModel implements CacheModel<CustomerStoreVisit>,
    Externalizable {
    public long customerstorevisitId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long customerId;
    public long storelocationId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{customerstorevisitId=");
        sb.append(customerstorevisitId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", customerId=");
        sb.append(customerId);
        sb.append(", storelocationId=");
        sb.append(storelocationId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public CustomerStoreVisit toEntityModel() {
        CustomerStoreVisitImpl customerStoreVisitImpl = new CustomerStoreVisitImpl();

        customerStoreVisitImpl.setCustomerstorevisitId(customerstorevisitId);
        customerStoreVisitImpl.setGroupId(groupId);
        customerStoreVisitImpl.setCompanyId(companyId);
        customerStoreVisitImpl.setUserId(userId);

        if (userName == null) {
            customerStoreVisitImpl.setUserName(StringPool.BLANK);
        } else {
            customerStoreVisitImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            customerStoreVisitImpl.setCreateDate(null);
        } else {
            customerStoreVisitImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            customerStoreVisitImpl.setModifiedDate(null);
        } else {
            customerStoreVisitImpl.setModifiedDate(new Date(modifiedDate));
        }

        customerStoreVisitImpl.setCustomerId(customerId);
        customerStoreVisitImpl.setStorelocationId(storelocationId);

        customerStoreVisitImpl.resetOriginalValues();

        return customerStoreVisitImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        customerstorevisitId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        customerId = objectInput.readLong();
        storelocationId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(customerstorevisitId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(customerId);
        objectOutput.writeLong(storelocationId);
    }
}
