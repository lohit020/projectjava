<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<form action="addCart" method="post">

<table border="3">
	<tr>
		<th>CartID</th>
		<th>UserId</th>
		<th>FoodId</th>
		
		<th>Type</th>
		<th>Quantity</th>
		<th>Cost</th>
		<th>OrderDate</th>		
		
	</tr>
	
	<c:forEach var="str" items="${CartBean}">
		<tr>
			<td>${str.cartID}</td>
			<td>${str.userId}</td>
			<td>${str.foodId}</td>
			<td>${str.type}</td>
			<td>${str.quantity}</td>
			<td>${str.cost}</td>
			<td>${str.orderDate}</td>
		</tr>
	</c:forEach>
</table>

<input type="submit" value="add to cart"/>
</form>
</body>
</html>
