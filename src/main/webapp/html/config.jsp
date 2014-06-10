<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@page import="com.liferay.portal.kernel.template.TemplateHandler"%>
<%@page import="com.liferay.portal.kernel.template.TemplateHandlerRegistryUtil"%>
<%@page import="com.visitorapp.model.CustomerStoreVisit"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>
<%@ page import="com.liferay.portal.kernel.util.Constants" %>
<%@ page import="com.liferay.portal.kernel.util.GetterUtil" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html; charset=UTF-8" %>

<portlet:defineObjects />
<liferay-theme:defineObjects />

<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<liferay-portlet:renderURL portletConfiguration="true" var="configurationRenderURL" />

<aui:form action="<%= configurationURL %>" method="post" name="fm">
	<aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />
	<aui:input name="redirect" type="hidden" value="<%= configurationRenderURL %>" />

    <aui:fieldset>
        <div class="display-template">

            <%
            String displayStyle = GetterUtil.getString(portletPreferences.getValue("displayStyle", StringPool.BLANK));
            long displayStyleGroupId = GetterUtil.getLong(portletPreferences.getValue("displayStyleGroupId", null), scopeGroupId);

            TemplateHandler templateHandler = TemplateHandlerRegistryUtil.getTemplateHandler(CustomerStoreVisit.class.getName());
            %>

            <liferay-ui:ddm-template-selector
                classNameId="<%= PortalUtil.getClassNameId(templateHandler.getClassName()) %>"
                displayStyle="<%= displayStyle %>"
                displayStyleGroupId="<%= displayStyleGroupId %>"
                refreshURL="<%= PortalUtil.getCurrentURL(request) %>"
                showEmptyOption="<%= true %>"
            />
        </div>
    </aui:fieldset>


	<aui:button-row>
		<aui:button type="submit" />
	</aui:button-row>


</aui:form>