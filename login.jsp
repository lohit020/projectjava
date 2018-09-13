<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login</h1>
<table>
	<tr>
		<td>Admin</td>
		<td><input type="radio" name="admin"/></td>
		<td>User</td>
		<td><input type="radio" name="user"/></td>
	</tr>
	<tr>
		<td>User Id</td>
		<td><input type="text" name="userId"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td> <input type="text" name="passWord" /> </td>
	</tr>
</table>
	<input type="submit" value="Login"/>
</body>
</html>