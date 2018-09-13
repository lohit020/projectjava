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
<h1>Food Data
</h1>
<form action="addFood" method="post">
<input type="submit" value="addFood"/>
<table border="3">
	<tr>
		<th>Food ID</th>
		<th>Name</th>
		<th>Type</th>
		<th>Food Size</th>
		<th>Quantity</th>
		<th>Price</th>
		<th>Edit</th>
		<th>Delete</th>
		
	</tr>
	
	<c:forEach var="fds" items="${FoodBean}">
		<tr>
			<td>${fds.foodId}</td>
			<td>${fds.fName}</td>
			<td>${fds.type}</td>
			<td>${fds.foodSize}</td>
			<td>${fds.quantity}</td>
			<td>${fds.price}</td>
			<td><a href="editFood?foodId=${fds.foodId}">Edit</a></td>  
    		<td><a href="deleteFood/${fds.foodId}">Delete</a></td>  
		</tr>
	
	
	</c:forEach>

</table>
</form>
</body>
</html>