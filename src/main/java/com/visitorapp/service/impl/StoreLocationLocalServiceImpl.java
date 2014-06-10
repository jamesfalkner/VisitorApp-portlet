package com.visitorapp.service.impl;

import java.util.Date;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.visitorapp.model.StoreLocation;
import com.visitorapp.service.base.StoreLocationLocalServiceBaseImpl;

/**
 * The implementation of the store location local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.visitorapp.service.StoreLocationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.visitorapp.service.base.StoreLocationLocalServiceBaseImpl
 * @see com.visitorapp.service.StoreLocationLocalServiceUtil
 */
public class StoreLocationLocalServiceImpl
    extends StoreLocationLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.visitorapp.service.StoreLocationLocalServiceUtil} to access the store location local service.
     */
	public StoreLocation addStoreLocation(
		long userId, long groupId, String name, String address,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		User user = userPersistence.findByPrimaryKey(userId);

		Date now = new Date();

		long locationId = counterLocalService.increment(StoreLocation.class.getName());

		StoreLocation location = storeLocationPersistence.create(locationId);

		location.setName(name);
		location.setAddress(address);

		location.setGroupId(groupId);
		location.setCompanyId(user.getCompanyId());
		location.setUserId(user.getUserId());
		location.setCreateDate(serviceContext.getCreateDate(now));
		location.setModifiedDate(serviceContext.getModifiedDate(now));

		super.addStoreLocation(location);

		return location;
	}

	public StoreLocation deleteStoreLocation(StoreLocation location)
		throws SystemException {

		return storeLocationPersistence.remove(location);
	}

	public StoreLocation deleteStoreLocation(long locationId)
		throws PortalException, SystemException {

		StoreLocation location = storeLocationPersistence.fetchByPrimaryKey(locationId);

		return deleteStoreLocation(location);
	}

	public StoreLocation updateStoreLocation(
		long userId, long locationId, String name, String address,
		ServiceContext serviceContext)
		throws PortalException, SystemException {

		Date now = new Date();

		StoreLocation location = storeLocationPersistence.findByPrimaryKey(locationId);

		location.setName(name);
		location.setAddress(address);
		location.setModifiedDate(serviceContext.getModifiedDate(now));

		super.updateStoreLocation(location);

		return location;
	}
	
	public void removeAllStoreLocations() throws SystemException {
		storeLocationPersistence.removeAll();
	}

}
