<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please Set Password</h1>
<form action="/Integreted/updateCredentials/" method="post">
<table>
	<tr>
		<td>User Id</td>
		<td><input type="text" name="userId" value="${userId}" readonly/></td> 
		<%-- <td><input type="text" name="userId" value="${CredentialsBean.userId}" readonly/></td> --%>
	</tr>
	<tr>
		<td>Password</td>
		<td> <input type="text" name="passWord"/> </td>
	</tr>
	<tr>
		<td><input type="hidden" name="usertype" value="C"/></td>
	</tr>
	<tr>
		<td><input type="hidden" name="loginStatus" value="0"/></td>
	</tr>
</table>
<input type="submit" value="Login"/>
</form>
</body>
</html>