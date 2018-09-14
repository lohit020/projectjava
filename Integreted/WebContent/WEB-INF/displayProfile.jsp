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
<h1>Profile
</h1>
<form action="addProfile" method="post">
<input type="submit" value="addProfile"/>
<table border="3">
	<tr>
		<th>User Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Date of birth</th>
		<th>Gender</th>
		<th>Street</th>
		<th>City</th>
		<th>State</th>
		<th>Location</th>
		<th>Pincode</th>
		<th>Mobile number</th>
		<th>Edit</th>
		<th>Delete</th>
		
		
	</tr>
	
	<c:forEach var="prfl" items="${ProfileBean}">
		<tr>
			<td>${prfl.userId}</td>
			<td>${prfl.firstName}</td>
			<td>${prfl.lastName}</td>
			<td>${prfl.dateOfBirth}</td>
			<td>${prfl.gender}</td>
			<td>${prfl.street}</td>
			<td>${prfl.location}</td>
			<td>${prfl.city}</td>
			<td>${prfl.state}</td>
			<td>${prfl.pincode}</td>
			<td>${prfl.mobileNo}</td>
			<td><a href="editProfile?userId=${prfl.userId }">Edit</a></td>  
    		<td><a href="deleteProfile/${prfl.userId}">Delete</a></td>  
		</tr>
	
	
	</c:forEach>

</table>
</form>
</body>
</html>