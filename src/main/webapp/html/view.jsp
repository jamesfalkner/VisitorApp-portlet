<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="com.visitorapp.model.Customer"%>
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

<liferay-theme:defineObjects />

<portlet:defineObjects />

<%
	String redirect = PortalUtil.getCurrentURL(renderRequest);
	String displayStyle = GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
	long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null), scopeGroupId);
	
	long portletDisplayDDMTemplateId = PortletDisplayTemplateUtil.getPortletDisplayTemplateDDMTemplateId(displayStyleGroupId, displayStyle);
	
%>

<c:choose>
    <c:when test="<%= portletDisplayDDMTemplateId > 0 %>">
        <%
        	List<Customer> customers = CustomerLocalServiceUtil.getCustomers(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        	List<StoreLocation> storeLocations = StoreLocationLocalServiceUtil.getStoreLocations(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
        	Map<String, Object> contextObjs = new HashMap<String, Object>();
        	contextObjs.put("customers", customers);
        	contextObjs.put("storeLocations", storeLocations);
        	contextObjs.put("someVarName", "A random value: " + PortalUtil.getUptime().toString());
        %>

        <%= PortletDisplayTemplateUtil.renderDDMTemplate(pageContext, portletDisplayDDMTemplateId, customers, contextObjs) %>
    </c:when>
   <c:otherwise>
			<jsp:include page="view_default.jsp"></jsp:include>
    </c:otherwise>
</c:choose>
