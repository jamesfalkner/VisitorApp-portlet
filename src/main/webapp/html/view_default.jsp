<%@page import="com.visitorapp.model.CustomerStoreVisit"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.dao.orm.QueryUtil"%>
<%@page import="com.liferay.portlet.portletdisplaytemplate.util.PortletDisplayTemplateUtil"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.visitorapp.service.CustomerStoreVisitLocalServiceUtil"%>
<%@page import="com.visitorapp.service.CustomerLocalServiceUtil"%>
<%@page import="com.visitorapp.model.StoreLocation"%>
<%@page import="com.visitorapp.service.StoreLocationLocalServiceUtil"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@ page import="com.liferay.portal.util.PortalUtil" %>

<%!
   com.liferay.portal.kernel.dao.search.SearchContainer<StoreLocation> searchContainer = null;
%>
<h1>Customer Visits</h1>
<liferay-ui:search-container emptyResultsMessage="There are no visits to display">
    <liferay-ui:search-container-results 
        results="<%= CustomerStoreVisitLocalServiceUtil.getCustomerStoreVisits(searchContainer.getStart(), searchContainer.getEnd()) %>"
        total="<%= CustomerStoreVisitLocalServiceUtil.getCustomerStoreVisitsCount() %>"
    />

    <liferay-ui:search-container-row
        className="com.visitorapp.model.CustomerStoreVisit"
        keyProperty="customerstorevisitId"
        modelVar="visit" escapedModel="<%= true %>"
    >
        <liferay-ui:search-container-column-text
            name="Customer"
            value="<%= visit.getCustomer().getName() %>"
        />

        <liferay-ui:search-container-column-text
            name="Store Location"
            value="<%= visit.getStoreLocation().getName() %>"
        />
        <liferay-ui:search-container-column-text
            name="Address"
            value="<%= visit.getStoreLocation().getAddress() %>"
        />
        <liferay-ui:search-container-column-date
            name="Date"
            value="<%= visit.getCreateDate() %>"
        />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

