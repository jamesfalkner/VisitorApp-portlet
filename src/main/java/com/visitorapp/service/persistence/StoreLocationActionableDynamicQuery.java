package com.visitorapp.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.visitorapp.model.StoreLocation;

import com.visitorapp.service.StoreLocationLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class StoreLocationActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public StoreLocationActionableDynamicQuery() throws SystemException {
        setBaseLocalService(StoreLocationLocalServiceUtil.getService());
        setClass(StoreLocation.class);

        setClassLoader(com.visitorapp.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("storelocationId");
    }
}
