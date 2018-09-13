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
<form action="updateCredentials" method="post">

<table>
	<tr>
		<td>User Id</td>
		<td><input type="text" name="userId" value="${CredentialsBean.userId}"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td> <input type="text" name="passWord" value="${CredentialsBean.passWord}"/> </td>
	</tr>
	<tr>
		<td>User Type</td>
		<td><input type="text" name="usertype" value="${CredentialsBean.usertype}"/></td>
	</tr>
	<tr>
		<td>Login status</td>
		<td><input type="text" name="loginStatus" value="${CredentialsBean.loginStatus}"/></td>
	</tr>
	
</table>
<input type="submit" value="update"/>

</form>
</body>
</html>