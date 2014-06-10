package com.visitorapp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CustomerStoreVisitService}.
 *
 * @author Brian Wing Shun Chan
 * @see CustomerStoreVisitService
 * @generated
 */
public class CustomerStoreVisitServiceWrapper
    implements CustomerStoreVisitService,
        ServiceWrapper<CustomerStoreVisitService> {
    private CustomerStoreVisitService _customerStoreVisitService;

    public CustomerStoreVisitServiceWrapper(
        CustomerStoreVisitService customerStoreVisitService) {
        _customerStoreVisitService = customerStoreVisitService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _customerStoreVisitService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _customerStoreVisitService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _customerStoreVisitService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public CustomerStoreVisitService getWrappedCustomerStoreVisitService() {
        return _customerStoreVisitService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedCustomerStoreVisitService(
        CustomerStoreVisitService customerStoreVisitService) {
        _customerStoreVisitService = customerStoreVisitService;
    }

    @Override
    public CustomerStoreVisitService getWrappedService() {
        return _customerStoreVisitService;
    }

    @Override
    public void setWrappedService(
        CustomerStoreVisitService customerStoreVisitService) {
        _customerStoreVisitService = customerStoreVisitService;
    }
}
