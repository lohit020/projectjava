<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Food</h1>
<form action="food/saveFood" method="post">

<table>
	<tr>
		<td>Food Id</td>
		<td><input type="text" name="foodId"/></td>
	</tr>
	<tr>
		<td>Name</td>
		<td> <input type="text" name="fName"/> </td>
	</tr>
	<tr>
		<td>Type</td>
		<td><input type="text" name="type"/></td>
	</tr>
	<tr>
		<td>Food Size</td>
		<td><input type="text" name="foodSize"/></td>
	</tr>
	<tr>
		<td>Quantity</td>
		<td><input type="text" name="quantity"/></td>
	</tr>
	<tr>
		<td>Price</td>
		<td><input type="text" name="price"/></td>
	</tr>
	
</table>
<input type="submit" value="save"/>

</form>
</body>
</html>