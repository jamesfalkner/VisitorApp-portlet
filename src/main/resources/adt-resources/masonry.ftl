<#assign liferay_ui = taglibLiferayHash["/WEB-INF/tld/liferay-ui.tld"] /> 
<#assign liferay_portlet = taglibLiferayHash["/WEB-INF/tld/liferay-portlet.tld"] /> 
 
<script type="text/javascript" src="http://masonry.desandro.com/masonry.pkgd.min.js"> 
</script> 
<div style="background: url(/html/themes/classic/images/classic_pattern.jpg)" id="<@liferay_portlet.namespace />container" class="js-masonry" data-masonry-options=''{ "columnWidth": "50%", "gutter": 15, "itemSelector": ".picture-item" }''> 
    <#list entries as entry> 

      <div class="picture-item color${randomizer.nextInt(4)}">
        <img class="image" src="${dlUtil.getPreviewURL(entry, entry.getFileVersion(), themeDisplay, "")}" onmouseover="Liferay.Portal.ToolTip.show(this, &apos;${htmlUtil.escapeJS(entry.getDescription())}&apos;)" />

        <p class="title">${entry.getTitle()}</p>

        <#if enableRatings == "true">
            <div class="ratings">
              <@liferay_ui["ratings"]
                className="com.liferay.portlet.documentlibrary.model.DLFileEntry"
                classPK=entry.getFileEntryId()
              />
          </div>
          </#if>
      </div>

    </#list> 
</div> 
 
<style type="text/css"> 
.picture-item { 
        box-shadow: 10px 10px 10px rgba(0, 0, 0, 0.7); 
        background-color:white;
        color: #555; 
        margin: 10px; 
        width: 20%; 
 
        .image { 
                margin: 5% 5% 0 5%; 
                width: 90%; 
        } 
 
        .ratings { 
                margin: auto; 
                width: 80%; 
        } 
 
        .taglib-ratings-stars { 
                padding: 0px; 
        } 
 
        .title { 
                margin: 5px auto; 
                padding: 5px; 
                text-align: center; 
                text-transform: uppercase; 
                width: 60%; 
        } 
} 
 
</style>