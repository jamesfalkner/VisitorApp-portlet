package com.visitorapp.service.base;

import com.visitorapp.service.CustomerStoreVisitLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CustomerStoreVisitLocalServiceClpInvoker {
    private String _methodName0;
    private String[] _methodParameterTypes0;
    private String _methodName1;
    private String[] _methodParameterTypes1;
    private String _methodName2;
    private String[] _methodParameterTypes2;
    private String _methodName3;
    private String[] _methodParameterTypes3;
    private String _methodName4;
    private String[] _methodParameterTypes4;
    private String _methodName5;
    private String[] _methodParameterTypes5;
    private String _methodName6;
    private String[] _methodParameterTypes6;
    private String _methodName7;
    private String[] _methodParameterTypes7;
    private String _methodName8;
    private String[] _methodParameterTypes8;
    private String _methodName9;
    private String[] _methodParameterTypes9;
    private String _methodName10;
    private String[] _methodParameterTypes10;
    private String _methodName11;
    private String[] _methodParameterTypes11;
    private String _methodName12;
    private String[] _methodParameterTypes12;
    private String _methodName13;
    private String[] _methodParameterTypes13;
    private String _methodName14;
    private String[] _methodParameterTypes14;
    private String _methodName15;
    private String[] _methodParameterTypes15;
    private String _methodName46;
    private String[] _methodParameterTypes46;
    private String _methodName47;
    private String[] _methodParameterTypes47;
    private String _methodName52;
    private String[] _methodParameterTypes52;
    private String _methodName53;
    private String[] _methodParameterTypes53;
    private String _methodName54;
    private String[] _methodParameterTypes54;
    private String _methodName55;
    private String[] _methodParameterTypes55;
    private String _methodName56;
    private String[] _methodParameterTypes56;
    private String _methodName57;
    private String[] _methodParameterTypes57;

    public CustomerStoreVisitLocalServiceClpInvoker() {
        _methodName0 = "addCustomerStoreVisit";

        _methodParameterTypes0 = new String[] {
                "com.visitorapp.model.CustomerStoreVisit"
            };

        _methodName1 = "createCustomerStoreVisit";

        _methodParameterTypes1 = new String[] { "long" };

        _methodName2 = "deleteCustomerStoreVisit";

        _methodParameterTypes2 = new String[] { "long" };

        _methodName3 = "deleteCustomerStoreVisit";

        _methodParameterTypes3 = new String[] {
                "com.visitorapp.model.CustomerStoreVisit"
            };

        _methodName4 = "dynamicQuery";

        _methodParameterTypes4 = new String[] {  };

        _methodName5 = "dynamicQuery";

        _methodParameterTypes5 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName6 = "dynamicQuery";

        _methodParameterTypes6 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
            };

        _methodName7 = "dynamicQuery";

        _methodParameterTypes7 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
                "com.liferay.portal.kernel.util.OrderByComparator"
            };

        _methodName8 = "dynamicQueryCount";

        _methodParameterTypes8 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery"
            };

        _methodName9 = "dynamicQueryCount";

        _methodParameterTypes9 = new String[] {
                "com.liferay.portal.kernel.dao.orm.DynamicQuery",
                "com.liferay.portal.kernel.dao.orm.Projection"
            };

        _methodName10 = "fetchCustomerStoreVisit";

        _methodParameterTypes10 = new String[] { "long" };

        _methodName11 = "getCustomerStoreVisit";

        _methodParameterTypes11 = new String[] { "long" };

        _methodName12 = "getPersistedModel";

        _methodParameterTypes12 = new String[] { "java.io.Serializable" };

        _methodName13 = "getCustomerStoreVisits";

        _methodParameterTypes13 = new String[] { "int", "int" };

        _methodName14 = "getCustomerStoreVisitsCount";

        _methodParameterTypes14 = new String[] {  };

        _methodName15 = "updateCustomerStoreVisit";

        _methodParameterTypes15 = new String[] {
                "com.visitorapp.model.CustomerStoreVisit"
            };

        _methodName46 = "getBeanIdentifier";

        _methodParameterTypes46 = new String[] {  };

        _methodName47 = "setBeanIdentifier";

        _methodParameterTypes47 = new String[] { "java.lang.String" };

        _methodName52 = "addCustomerStoreVisit";

        _methodParameterTypes52 = new String[] {
                "long", "long", "long", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName53 = "deleteCustomerStoreVisit";

        _methodParameterTypes53 = new String[] {
                "com.visitorapp.model.CustomerStoreVisit"
            };

        _methodName54 = "deleteCustomerStoreVisit";

        _methodParameterTypes54 = new String[] { "long" };

        _methodName55 = "updateCustomerStoreVisit";

        _methodParameterTypes55 = new String[] {
                "long", "long", "long", "long",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName56 = "getCustomerStoreVisitByStoreAndCustomer";

        _methodParameterTypes56 = new String[] {
                "com.visitorapp.model.StoreLocation",
                "com.visitorapp.model.Customer"
            };

        _methodName57 = "removeAllCustomerStoreVisits";

        _methodParameterTypes57 = new String[] {  };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName0.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.addCustomerStoreVisit((com.visitorapp.model.CustomerStoreVisit) arguments[0]);
        }

        if (_methodName1.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.createCustomerStoreVisit(((Long) arguments[0]).longValue());
        }

        if (_methodName2.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.deleteCustomerStoreVisit(((Long) arguments[0]).longValue());
        }

        if (_methodName3.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.deleteCustomerStoreVisit((com.visitorapp.model.CustomerStoreVisit) arguments[0]);
        }

        if (_methodName4.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.dynamicQuery();
        }

        if (_methodName5.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName6.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue());
        }

        if (_methodName7.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                ((Integer) arguments[1]).intValue(),
                ((Integer) arguments[2]).intValue(),
                (com.liferay.portal.kernel.util.OrderByComparator) arguments[3]);
        }

        if (_methodName8.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0]);
        }

        if (_methodName9.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery) arguments[0],
                (com.liferay.portal.kernel.dao.orm.Projection) arguments[1]);
        }

        if (_methodName10.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.fetchCustomerStoreVisit(((Long) arguments[0]).longValue());
        }

        if (_methodName11.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.getCustomerStoreVisit(((Long) arguments[0]).longValue());
        }

        if (_methodName12.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.getPersistedModel((java.io.Serializable) arguments[0]);
        }

        if (_methodName13.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.getCustomerStoreVisits(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue());
        }

        if (_methodName14.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.getCustomerStoreVisitsCount();
        }

        if (_methodName15.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.updateCustomerStoreVisit((com.visitorapp.model.CustomerStoreVisit) arguments[0]);
        }

        if (_methodName46.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes46, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName47.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes47, parameterTypes)) {
            CustomerStoreVisitLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName52.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes52, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.addCustomerStoreVisit(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        if (_methodName53.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes53, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.deleteCustomerStoreVisit((com.visitorapp.model.CustomerStoreVisit) arguments[0]);
        }

        if (_methodName54.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes54, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.deleteCustomerStoreVisit(((Long) arguments[0]).longValue());
        }

        if (_methodName55.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes55, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.updateCustomerStoreVisit(((Long) arguments[0]).longValue(),
                ((Long) arguments[1]).longValue(),
                ((Long) arguments[2]).longValue(),
                ((Long) arguments[3]).longValue(),
                (com.liferay.portal.service.ServiceContext) arguments[4]);
        }

        if (_methodName56.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
            return CustomerStoreVisitLocalServiceUtil.getCustomerStoreVisitByStoreAndCustomer((com.visitorapp.model.StoreLocation) arguments[0],
                (com.visitorapp.model.Customer) arguments[1]);
        }

        if (_methodName57.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
            CustomerStoreVisitLocalServiceUtil.removeAllCustomerStoreVisits();

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
