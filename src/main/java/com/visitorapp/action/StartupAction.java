
package com.visitorapp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.template.TemplateConstants;
import com.liferay.portal.kernel.template.TemplateHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.xml.Element;
import com.liferay.portal.service.GroupLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.dynamicdatamapping.model.DDMTemplate;
import com.liferay.portlet.dynamicdatamapping.model.DDMTemplateConstants;
import com.liferay.portlet.dynamicdatamapping.service.DDMTemplateLocalServiceUtil;
import com.liferay.util.ContentUtil;
import com.visitorapp.adt.DisplayTemplateHandler;
import com.visitorapp.model.CustomerStoreVisit;

public class StartupAction extends SimpleAction {

	@Override
	public void run(String[] companyIds)
		throws ActionException {

		// programmatically install a simple ADT template

		long classNameId = PortalUtil.getClassNameId(CustomerStoreVisit.class);
		long classPK = 0;

		Map<Locale, String> nameMap = new HashMap<Locale, String>();
		nameMap.put(LocaleUtil.getSiteDefault(), "Visitor App - Programmatically Installed Template");

		Map<Locale, String> descriptionMap = new HashMap<Locale, String>();
		descriptionMap.put(
			LocaleUtil.getSiteDefault(), "MyProgrammaticTemplateDescription");

		String type = DDMTemplateConstants.TEMPLATE_TYPE_DISPLAY;

		String mode = DDMTemplateConstants.TEMPLATE_MODE_CREATE;

		String language = TemplateConstants.LANG_TYPE_FTL;

		String templateKey = "MY-FAKE-KEY";

		boolean cacheable = false;

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setAddGuestPermissions(true);
		serviceContext.setAddGroupPermissions(true);

		try {

			long groupId =
				GroupLocalServiceUtil.getCompanyGroup(GetterUtil.getLong(companyIds[0])).getGroupId();

			DDMTemplate existingTemplate =
				DDMTemplateLocalServiceUtil.fetchTemplate(
					groupId, classNameId, templateKey);
			if (existingTemplate != null) {
				DDMTemplateLocalServiceUtil.deleteDDMTemplate(existingTemplate);
			}

			// put it in the global scope
			long userId =
				UserLocalServiceUtil.getDefaultUserId(GetterUtil.getLong(companyIds[0]));

			DDMTemplateLocalServiceUtil.addTemplate(
				userId, groupId, classNameId, classPK, templateKey, nameMap,
				descriptionMap, type, mode, language, INLINE_FAKE_SCRIPT, cacheable, false, "",
				null, serviceContext);

			// now read some files and use those as scripts
			TemplateHandler myHandler = new DisplayTemplateHandler();

			List<Element> templateElements = myHandler.getDefaultTemplateElements();
			for (Element templateElement : templateElements) {
				String templateKey1 = templateElement.elementText("template-key");

				DDMTemplate ddmTemplate =
					DDMTemplateLocalServiceUtil.fetchTemplate(
						groupId, classNameId, templateKey1);

				if (ddmTemplate != null) {
					DDMTemplateLocalServiceUtil.deleteDDMTemplate(ddmTemplate);
				}

				String name = templateElement.elementText("name");
				String description = templateElement.elementText("description");
				String language1 = templateElement.elementText("language");
				String scriptFileName = templateElement.elementText("script-file");
				boolean cacheable1 =
					GetterUtil.getBoolean(templateElement.elementText("cacheable"));

				addDDMTemplate(
					userId, groupId, classNameId, templateKey1, name, description,
					language1, scriptFileName, cacheable1, serviceContext);

			}

		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void addDDMTemplate(
		long userId, long groupId, long classNameId, String templateKey,
		String name, String description, String language, String scriptFileName,
		boolean cacheable, ServiceContext serviceContext)
		throws PortalException, SystemException {

		DDMTemplate ddmTemplate =
			DDMTemplateLocalServiceUtil.fetchTemplate(
				groupId, classNameId, templateKey);

		if (ddmTemplate != null) {
			return;
		}

		Map<Locale, String> nameMap = new HashMap<Locale, String>();

		Locale locale = PortalUtil.getSiteDefaultLocale(groupId);

		nameMap.put(locale, LanguageUtil.get(locale, name));

		Map<Locale, String> descriptionMap = new HashMap<Locale, String>();

		descriptionMap.put(locale, LanguageUtil.get(locale, description));

		String script = ContentUtil.get(scriptFileName);

		DDMTemplateLocalServiceUtil.addTemplate(
			userId, groupId, classNameId, 0, templateKey, nameMap, descriptionMap,
			DDMTemplateConstants.TEMPLATE_TYPE_DISPLAY, null, language, script,
			cacheable, false, null, null, serviceContext);
	}

	private static final String INLINE_FAKE_SCRIPT =
		"<#assign liferay_ui = taglibLiferayHash[\"/WEB-INF/tld/liferay-ui.tld\"] />\n"
			+ "<div class=\"img-polaroid\">\n"
			+ "    <@liferay_ui[\"user-display\"]\n"
			+ "        userId=user.getUserId()\n" + "        displayStyle=2\n"
			+ "    />\n" + "</div>\n"
			+ "<h2 style=\"text-align:center\">Hi there! Is this you?</h2>";
}
