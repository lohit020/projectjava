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
<form action="userlogin" method="post">

<table>
	<tr>
		<td>User Id</td>
		<td><input type="text" name="userId"/></td>
	</tr>
	<tr>
		<td>Password</td>
		<td> <input type="text" name="passWord" /> </td>
	</tr>
	<tr>
		<td>User Type</td>
		<td><input type="radio" name="usertype" value="A"/>A</td>
		<td><input type="radio" name="usertype" value="C"/>C</td>
	</tr>
	<tr>
		<td><input type="hidden" /></td>
	</tr>
</table>
<input type="submit" value="Login"/>
</form>
</body>
</html>