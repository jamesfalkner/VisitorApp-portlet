package com.visitorapp.adt;

import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.portletdisplaytemplate.BasePortletDisplayTemplateHandler;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateVariableCodeHandler;
import com.liferay.portal.kernel.template.TemplateVariableDefinition;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portlet.portletdisplaytemplate.util.PortletDisplayTemplateConstants;
import com.visitorapp.model.Customer;
import com.visitorapp.model.CustomerStoreVisit;
import com.visitorapp.model.StoreLocation;


public class DisplayTemplateHandler
	extends BasePortletDisplayTemplateHandler {
	
	@Override
	public String getTemplatesHelpPath(String language) {
		return "adt-resources/help." + language;
	}
	
	@Override
	public String getClassName() {
		return CustomerStoreVisit.class.getName();
	}

	@Override
	protected String getTemplatesConfigPath() {
		return "adt-resources/default-templates-on-install.xml";
	}
	
	@Override
	public String getName(Locale locale) {
		return "Customer Store Visits Template";
	}

	@Override
	public String getResourceName() {

		return "VisitorApp_WAR_VisitorAppportlet";
	}

  @Override
  public Map<String, TemplateVariableGroup> getTemplateVariableGroups(
          long classPK, String language, Locale locale)
      throws Exception {
  	
    Map<String, TemplateVariableGroup> templateVariableGroups =
            super.getTemplateVariableGroups(classPK, language, locale);

        TemplateVariableGroup templateVariableGroup =
            templateVariableGroups.get("fields");

        templateVariableGroup.empty();
        
        // basic variable which is added to template editor
        templateVariableGroup.addVariable("Some Variable", String.class, "someVarName");

        // dynamically generates language-independent code into template editor
        templateVariableGroup.addFieldVariable("Customer Visit Date",
        	Date.class, "date", "The date of a customer's visit", "UNUSED",
        	false, new TemplateVariableCodeHandler() {
						
						@Override
						public String[] generate(TemplateVariableDefinition def, String lang)
							throws Exception {
							if (TemplateConstants.LANG_TYPE_FTL.equals(lang)) {
								return new String[] {
									"${dateUtil.getDate(curVisit.createDate, \"dd MMM yyyy\", locale, themeDisplay.timeZone)}",
									"second", "third", "forth (fifth will be blank)",
									StringPool.BLANK};
							} else if (TemplateConstants.LANG_TYPE_VM.equals(lang)) {
								return new String[] {
									"$dateUtil.getDate($curVisit.createDate, \"dd MMM yyyy\", $locale, $themeDisplay.timeZone)",
									StringPool.BLANK,
									StringPool.BLANK};
							} else {
								return new String[] {
									"### -- UNKNOWN LANGUAGE -- ###",
									StringPool.BLANK,
									StringPool.BLANK};
							}
						}
					});
        
        // add a couple of collection variables to template editor
        
        // all customers stored as the entries
        templateVariableGroup.addCollectionVariable(
          "customers", List.class, PortletDisplayTemplateConstants.ENTRIES,
          "customer", Customer.class, "curCustomer", "name");
        
        // all store locations and customers as collections
        templateVariableGroup.addCollectionVariable(
          "storeLocations", List.class, "storeLocations",
          "storeLocation", StoreLocation.class, "curStoreLocation", "name");
        templateVariableGroup.addCollectionVariable(
          "customers", List.class, "customers",
          "customer", Customer.class, "curCustomer", "name");

        return templateVariableGroups;
  }
  
}
