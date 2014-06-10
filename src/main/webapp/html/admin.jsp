<%@page import="com.visitorapp.service.CustomerLocalServiceUtil"%>
<%@page import="com.visitorapp.service.StoreLocationLocalServiceUtil"%>
<%@page import="com.visitorapp.model.StoreLocation"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%!
   com.liferay.portal.kernel.dao.search.SearchContainer<StoreLocation> searchContainer = null;
%>

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
    String redirect = PortalUtil.getCurrentURL(renderRequest);
%>

<aui:button-row>
    <portlet:renderURL var="addLocationURL">
        <portlet:param name="mvcPath" value="/html/edit_store_location.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addLocationURL.toString() %>" value="add-location" />
</aui:button-row>

<h1>Store Locations</h1>
<liferay-ui:search-container emptyResultsMessage="There are no store locations to display">
    <liferay-ui:search-container-results 
        results="<%= StoreLocationLocalServiceUtil.getStoreLocations(searchContainer.getStart(), searchContainer.getEnd()) %>"
        total="<%= StoreLocationLocalServiceUtil.getStoreLocationsCount() %>"
    />

    <liferay-ui:search-container-row
        className="com.visitorapp.model.StoreLocation"
        keyProperty="storelocationId"
        modelVar="location" escapedModel="<%= true %>"
    >
        <liferay-ui:search-container-column-text
            name="name"
            value="<%= location.getName() %>"
        />

        <liferay-ui:search-container-column-text
            name="address"
            value="<%= location.getAddress() %>"
        />
				<liferay-ui:search-container-column-jsp
				    align="right"
				    path="/html/store_location_actions.jsp"
				/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row>
    <portlet:renderURL var="addCustomerURL">
        <portlet:param name="mvcPath" value="/html/edit_customer.jsp" />
        <portlet:param name="redirect" value="<%= redirect %>" />
    </portlet:renderURL>

    <aui:button onClick="<%= addCustomerURL.toString() %>" value="Add Customer" />
</aui:button-row>


<h1>Customers</h1>
<liferay-ui:search-container emptyResultsMessage="There are no customers to display">
    <liferay-ui:search-container-results 
        results="<%= CustomerLocalServiceUtil.getCustomers(searchContainer.getStart(), searchContainer.getEnd()) %>"
        total="<%= CustomerLocalServiceUtil.getCustomersCount() %>"
    />

    <liferay-ui:search-container-row
        className="com.visitorapp.model.Customer"
        keyProperty="customerId"
        modelVar="customer" escapedModel="<%= true %>"
    >
        <liferay-ui:search-container-column-text
            name="name"
            value="<%= customer.getName() %>"
        />
        <liferay-ui:search-container-column-text
            name="email"
            value="<%= customer.getEmail() %>"
        />

				<liferay-ui:search-container-column-jsp
				    align="right"
				    path="/html/customer_actions.jsp"
				/>

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<portlet:actionURL name="fillRandomData" var="fillURL" windowState="normal" />

<aui:form action="<%= fillURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />
        <aui:input name="count" value="1000"/>
    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" value="Generate Fake Visits" />
    </aui:button-row>
</aui:form>

