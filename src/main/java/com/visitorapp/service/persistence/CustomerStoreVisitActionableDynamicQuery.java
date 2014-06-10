package com.visitorapp.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.visitorapp.model.CustomerStoreVisit;

import com.visitorapp.service.CustomerStoreVisitLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CustomerStoreVisitActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CustomerStoreVisitActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CustomerStoreVisitLocalServiceUtil.getService());
        setClass(CustomerStoreVisit.class);

        setClassLoader(com.visitorapp.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("customerstorevisitId");
    }
}
