<%@page import="com.visitorapp.service.StoreLocationLocalServiceUtil"%>
<%@page import="com.visitorapp.model.StoreLocation"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<%@ page import="com.liferay.portal.kernel.util.ParamUtil" %>

<%
    StoreLocation location = null;

    long locationId = ParamUtil.getLong(request, "locationId");

    if (locationId > 0) {
        location = StoreLocationLocalServiceUtil.getStoreLocation(locationId);
    }

    String redirect = ParamUtil.getString(request, "redirect");
%>

<aui:model-context bean="<%= location %>" model="<%= StoreLocation.class %>" />
<portlet:renderURL var="viewLocationURL" />
<portlet:actionURL name='<%= location == null ? "addLocation" : "updateLocation" %>' var="editLocationURL" windowState="normal" />

<liferay-ui:header
    backURL="<%= viewLocationURL %>"
    title='<%= (location != null) ? location.getName() : "New Store Location" %>'
/>

<aui:form action="<%= editLocationURL %>" method="POST" name="fm">
    <aui:fieldset>
        <aui:input name="redirect" type="hidden" value="<%= redirect %>" />

        <aui:input name="storelocationId" type="hidden" value='<%= location == null ? "" : location.getStorelocationId() %>'/>

        <aui:input name="name" />

        <aui:input name="address" />

    </aui:fieldset>

    <aui:button-row>
        <aui:button type="submit" />

        <aui:button onClick="<%= viewLocationURL %>"  type="cancel" />
    </aui:button-row>
</aui:form>