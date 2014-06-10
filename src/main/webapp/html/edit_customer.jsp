<%@page import="com.visitorapp.service.CustomerLocalServiceUtil"%>
<%@page import="com.visitorapp.model.Customer"%>
<%@page import="com.visitorapp.service.StoreLocationLocalServiceUtil"%>
<%@page import="com.visitorapp.model.StoreLocation"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%
    Customer customer = null;

    long customerId = ParamUtil.getLong(request, "customerId");

    if (customerId > 0) {
    	customer = CustomerLocalServiceUtil.getCustomer(customerId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= customer %>" model="<%= Customer.class %>" />
<portlet:renderURL var="viewCustomerURL" />
<portlet:actionURL name='<%= customer == null ? "addCustomer" : "updateCustomer" %>' var="editCustomerURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewCustomerURL %>"
    title='<%= (customer != null) ? customer.getName() : "New Customer" %>'
/>

<aui:form action="<%= editCustomerURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="customerId" type="hidden" value='<%= customer == null ? "" : customer.getCustomerId() %>'/>

        <aui:input name="name" />

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewCustomerURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>