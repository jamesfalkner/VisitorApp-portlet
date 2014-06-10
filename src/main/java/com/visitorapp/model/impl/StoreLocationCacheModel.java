package com.visitorapp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.visitorapp.model.StoreLocation;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing StoreLocation in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocation
 * @generated
 */
public class StoreLocationCacheModel implements CacheModel<StoreLocation>,
    Externalizable {
    public long storelocationId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String name;
    public String address;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{storelocationId=");
        sb.append(storelocationId);
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
        sb.append(", address=");
        sb.append(address);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public StoreLocation toEntityModel() {
        StoreLocationImpl storeLocationImpl = new StoreLocationImpl();

        storeLocationImpl.setStorelocationId(storelocationId);
        storeLocationImpl.setGroupId(groupId);
        storeLocationImpl.setCompanyId(companyId);
        storeLocationImpl.setUserId(userId);

        if (userName == null) {
            storeLocationImpl.setUserName(StringPool.BLANK);
        } else {
            storeLocationImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            storeLocationImpl.setCreateDate(null);
        } else {
            storeLocationImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            storeLocationImpl.setModifiedDate(null);
        } else {
            storeLocationImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (name == null) {
            storeLocationImpl.setName(StringPool.BLANK);
        } else {
            storeLocationImpl.setName(name);
        }

        if (address == null) {
            storeLocationImpl.setAddress(StringPool.BLANK);
        } else {
            storeLocationImpl.setAddress(address);
        }

        storeLocationImpl.resetOriginalValues();

        return storeLocationImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        storelocationId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        name = objectInput.readUTF();
        address = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(storelocationId);
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

        if (address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(address);
        }
    }
}
