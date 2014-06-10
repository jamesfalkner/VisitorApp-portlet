package com.visitorapp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CustomerService}.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerService
 * @generated
 */
public class CustomerServiceWrapper implements CustomerService,
    ServiceWrapper<CustomerService> {
    private CustomerService _customerService;

    public CustomerServiceWrapper(CustomerService customerService) {
        _customerService = customerService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _customerService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _customerService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _customerService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CustomerService getWrappedCustomerService() {
        return _customerService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCustomerService(CustomerService customerService) {
        _customerService = customerService;
    }

    @Override
    public CustomerService getWrappedService() {
        return _customerService;
    }

    @Override
    public void setWrappedService(CustomerService customerService) {
        _customerService = customerService;
    }
}
