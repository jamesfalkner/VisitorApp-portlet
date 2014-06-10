package com.visitorapp.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.visitorapp.service.ClpSerializer;
import com.visitorapp.service.CustomerLocalServiceUtil;
import com.visitorapp.service.CustomerServiceUtil;
import com.visitorapp.service.CustomerStoreVisitLocalServiceUtil;
import com.visitorapp.service.CustomerStoreVisitServiceUtil;
import com.visitorapp.service.StoreLocationLocalServiceUtil;
import com.visitorapp.service.StoreLocationServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            CustomerLocalServiceUtil.clearService();

            CustomerServiceUtil.clearService();
            CustomerStoreVisitLocalServiceUtil.clearService();

            CustomerStoreVisitServiceUtil.clearService();
            StoreLocationLocalServiceUtil.clearService();

            StoreLocationServiceUtil.clearService();
        }
    }
}
