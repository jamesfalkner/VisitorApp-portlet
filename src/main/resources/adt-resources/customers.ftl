<#if customers?has_content>
    <table>
    <tr><th>Name</th><th>Email</th></tr>
		<#list customers as curCustomer>
			<tr><td>${curCustomer.name}</td><td>${curCustomer.email}</td></tr>
		</#list>
    </table>
</#if>