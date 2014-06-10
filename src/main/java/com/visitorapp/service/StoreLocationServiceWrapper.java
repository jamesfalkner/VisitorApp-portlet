package com.visitorapp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StoreLocationService}.
 *
 * @author Brian Wing Shun Chan
 * @see StoreLocationService
 * @generated
 */
public class StoreLocationServiceWrapper implements StoreLocationService,
    ServiceWrapper<StoreLocationService> {
    private StoreLocationService _storeLocationService;

    public StoreLocationServiceWrapper(
        StoreLocationService storeLocationService) {
        _storeLocationService = storeLocationService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _storeLocationService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _storeLocationService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _storeLocationService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public StoreLocationService getWrappedStoreLocationService() {
        return _storeLocationService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedStoreLocationService(
        StoreLocationService storeLocationService) {
        _storeLocationService = storeLocationService;
    }

    @Override
    public StoreLocationService getWrappedService() {
        return _storeLocationService;
    }

    @Override
    public void setWrappedService(StoreLocationService storeLocationService) {
        _storeLocationService = storeLocationService;
    }
}
