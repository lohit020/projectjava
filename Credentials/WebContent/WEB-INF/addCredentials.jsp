<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Credentials</h1>
<form action="saveCredentials" method="post">

<table>
	<tr>
		<td>User Id</td>
		<td><input type="text" name="userId"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td> <input type="text" name="passWord"/> </td>
	</tr>
	<tr>
		<td>User Type</td>
		<td><input type="text" name="usertype"/></td>
	</tr>
	<tr>
		<td>Login status</td>
		<td><input type="text" name="loginStatus"/></td>
	</tr>
	
</table>
<input type="submit" value="save"/>

</form>
</body>
</html>