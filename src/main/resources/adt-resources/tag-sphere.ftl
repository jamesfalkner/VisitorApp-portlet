<#assign portlet_tl = taglibLiferayHash["/WEB-INF/tld/liferay-portlet.tld"] />
<@portlet_tl.defineObjects />
<#assign rru = renderResponse.createActionURL() />

<script type="text/javascript" src="http://www.goat1000.com/tagcanvas.min.js?2.2"></script>

<div id="myCanvasContainer">
 <canvas width="300" height="300" id="myCanvas">
  <p>Get a real browser, please!</p>
  <ul>
  
      <#if entries?has_content>
    	<#list entries as curTag>
           <#assign foo = rru.setParameter("tag", curTag.name) />
           <li><a style="font-size: ${curTag.assetCount}pt" href="${rru}">${curTag.name}</a></li>
         
    	</#list>
      </#if>   

  </ul>
 </canvas>
</div>

 <script type="text/javascript">
  window.onload = function() {
    try {
      var opts = {
        textColour:'#2aaae6',
        weightSize: 0.3,
        weight: true,
        clickToFront: 500
      };
      
      TagCanvas.Start('myCanvas', '', opts);
    } catch(e) {
      // something went wrong, hide the canvas container
      document.getElementById('myCanvasContainer').style.display = 'none';
    }
  };
 </script>