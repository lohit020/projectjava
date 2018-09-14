<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Store Data
</h1>

<form action="addCredentials" method="post">
<input type="submit" value="addCredentials"/>

<table border="3">
	<tr>
		<th>User Id</th>
		<th>Password</th>
		<th>User Type</th>
		<th>Login status</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach var="str" items="${CredentialsBean}">
		<tr>
			<td>${str.userId}</td>
			<td>${str.passWord}</td>
			<td>${str.usertype}</td>
			<td>${str.loginStatus}</td>
			<td><a href="editCredentials?userId=${str.userId}">Edit</a></td>  
    		<td><a href="deleteCredentials/${str.userId}">Delete</a></td> 
		</tr>
		
	</c:forEach>

</table>
</form>
</body>
</html>