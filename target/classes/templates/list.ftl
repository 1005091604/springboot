<html>
<head>
	<title>hello springboot</title>
</head>
<body>
	用户列表：<br>
	<table border="1">
		<tr>
			<td>id</td>
			<td>username</td>
			<td>password</td>
			<td>name</td>
		</tr>
		<#list users as user>
		<tr>
			<td>${user.id}</td>
			<td>${user.username}</td>
			<td>${user.password}</td>
			<td>${user.name}</td>
		</tr>
		</#list>
	</table>
</body>
</html>
