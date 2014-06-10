<#if storeLocations?has_content>
    <table>
    <tr><th>Name</th><th>Address</th></tr>
		<#list storeLocations as curStore>
			<tr><td>${curStore.name}</td><td>${curStore.address}</td></tr>
		</#list>
    </table>
</#if>