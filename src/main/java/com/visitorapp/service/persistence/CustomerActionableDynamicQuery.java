package com.visitorapp.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.visitorapp.model.Customer;

import com.visitorapp.service.CustomerLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class CustomerActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public CustomerActionableDynamicQuery() throws SystemException {
        setBaseLocalService(CustomerLocalServiceUtil.getService());
        setClass(Customer.class);

        setClassLoader(com.visitorapp.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("customerId");
    }
}
