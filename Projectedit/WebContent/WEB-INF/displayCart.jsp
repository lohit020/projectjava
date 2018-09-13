<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<form action="addCart" method="post">
<input type="submit" value="add to cart"/>

<table border="3">
	<tr>
		<th>CartID</th>
		<th>Quantity</th>
		<th>Type</th>
		</tr>
	
	<c:forEach var="str" items="${CartBean}">
		<tr>
			<td>${str.cartID}</td>
			<td>${str.quantity}</td>
			<td>${str.type}</td>
			</tr>
	</c:forEach>
</table>

<table border="3">
<tr>
        <th>FoodId</th>
		
		<th>Cost</th>
		
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	
	<c:forEach var="str" items="${FoodBean}">
		<tr>
			<td>${str.foodId}</td>
			
			<td>${str.price}</td>
			</tr>
	</c:forEach>
</table>		
			
			
			<%-- <td><a href="editStore/${str.storeId}">Edit</a></td>  
    		<td><a href="deleteStore/${str.storeId}">Delete</a></td> 
		 --%>
	
	
	


</form>

</body>
</html>