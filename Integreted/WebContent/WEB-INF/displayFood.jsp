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
<form action="updateCart" method="post">
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
		<form action="updateCart" method="post">
		<tr>
			<td><input type="text" name="foodId"  value="${fds.foodId}"/></td>
			<td ><input type="text" name="foodName" value="${fds.fName}"/></td>
			<td ><input type="text" name="foodtype" value="${fds.type}"/></td>
			<td><input type="text" name="foodSize"   value="${fds.foodSize}"/></td>
			<td><input type="text"  name="foodQuantity"  value="${fds.quantity}"/></td>
			<td><input type="text"  name="foodprice"   value="${fds.price}"/></td>
			<%-- <td><a href="updateCart?foodId=${fds.foodId}">AddtoCart</a></td>  
    		<td><a href="deleteFood/${fds.foodId}">Delete</a></td>  --%> 
    		<td><input type="submit" value="addFood"/></td>
		</tr>
		</form>
	</c:forEach>

</table>
</form>
</body>
</html>