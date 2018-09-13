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

<form action="addOrder" method="post">
<input type="submit" value="addOrder"/>

<table border="3">
	<tr>
		<th>Order Id</th>
		<th>User Id</th>
		<th>Order Date</th>
		<th>Store Id</th>
		<th>Cart Id</th>
		<th>Total Prize</th>
		<th>Order status</th>
		<th>Street</th>
		<th>City</th>
		<th>State</th>
		<th>Pincode</th>
		<th>Mobile No</th>
		<th>Edit</th>
		<th>Delete</th>
		
	</tr>
	
	<c:forEach var="str" items="${OrderBean}">
		<tr>
			<td>${str.orderId}</td>
			<td>${str.userId}</td>
			<td>${str.orderDate}</td>
			<td>${str.storeId}</td>
			<td>${str.cartId}</td>
			<td>${str.totalPrice}</td>
			<td>${str.orderStatus}</td>
			<td>${str.street}</td>
			<td>${str.city}</td>
			<td>${str.state}</td>
			<td>${str.pincode}</td>
			<td>${str.mobileNo}</td>
			<td><a href="editOrder/${str.orderId}">Edit</a></td>  
    		<td><a href="deleteOrder/${str.orderId}">Delete</a></td>  
		</tr>
	
	
	</c:forEach>

</table>
</form>
</body>
</html>