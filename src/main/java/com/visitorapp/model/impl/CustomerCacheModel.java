package com.visitorapp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.visitorapp.model.Customer;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Customer in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
public class CustomerCacheModel implements CacheModel<Customer>, Externalizable {
    public long customerId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String picture;
    public String email;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(21);

        sb.append("{customerId=");
        sb.append(customerId);
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
        sb.append(", name=");
        sb.append(name);
        sb.append(", picture=");
        sb.append(picture);
        sb.append(", email=");
        sb.append(email);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Customer toEntityModel() {
        CustomerImpl customerImpl = new CustomerImpl();

        customerImpl.setCustomerId(customerId);
        customerImpl.setGroupId(groupId);
        customerImpl.setCompanyId(companyId);
        customerImpl.setUserId(userId);

        if (userName == null) {
            customerImpl.setUserName(StringPool.BLANK);
        } else {
            customerImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            customerImpl.setCreateDate(null);
        } else {
            customerImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            customerImpl.setModifiedDate(null);
        } else {
            customerImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            customerImpl.setName(StringPool.BLANK);
        } else {
            customerImpl.setName(name);
        }

        if (picture == null) {
            customerImpl.setPicture(StringPool.BLANK);
        } else {
            customerImpl.setPicture(picture);
        }

        if (email == null) {
            customerImpl.setEmail(StringPool.BLANK);
        } else {
            customerImpl.setEmail(email);
        }

        customerImpl.resetOriginalValues();

        return customerImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        customerId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        picture = objectInput.readUTF();
        email = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(customerId);
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

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        if (picture == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(picture);
        }

        if (email == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(email);
        }
    }
}
