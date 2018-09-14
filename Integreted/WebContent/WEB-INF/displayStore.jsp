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
<form action="addStore" method="post">
<input type="submit" value="addStore"/>
<table border="3">
	<tr>
		<th>StoreID</th>
		<th>Name</th>
		<th>Street</th>
		<th>MobileNo</th>
		<th>City</th>
		<th>State</th>
		<th>Pincode</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach var="str" items="${StoreBean}">
		<tr>
			<td>${str.storeId}</td>
			<td>${str.name}</td>
			<td>${str.street}</td>
			<td>${str.mobileNo}</td>
			<td>${str.city}</td>
			<td>${str.state}</td>
			<td>${str.pincode}</td>
			<td><a href="editStore?storeId=${str.storeId}">Edit</a></td>  
    		<td><a href="deleteStore/${str.storeId}">Delete</a></td> 
		</tr>
	
	
	</c:forEach>

</table>
</form>
</body>
</html>