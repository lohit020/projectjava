<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="saveOrder" method="post">
<h1>Add order</h1>
<table>
<tr>
<td>Order Id</td>
<td><input type="text" name="orderId"/></td>
</tr>
<tr>
<td>User Id</td>
<td><input type="text" name="userId"/></td>
</tr>
<tr>
<td>Order Date</td>
<td><input type="date" name="orderDate"/></td>
</tr>
<tr>
<td>Store Id</td>
<td><input type="text" name="storeId"/></td>
</tr>
<tr>
<td>Cart Id</td>
<td><input type="text" name="cartId"/></td>
</tr>
<tr>
<td>total Price</td>
<td><input type="text" name="totalPrice"/></td>
</tr>
<tr>
<td>order status</td>
<td> <input type="text" name="orderStatus"/> </td>
</tr>
<tr>
<td> street</td>
<td><input type="text" name="street"/></td>
</tr>
<tr>
<td>city</td>
<td><input type="text" name="city"/></td>
</tr>
<tr>
<td>state</td>
<td><input type="text" name="state"/></td>
</tr>
<tr>
<td>pincode</td>
<td><input type="text" name="pincode"/></td>
</tr>
<tr>
<td>mobile number</td>
<td><input type="text" name="mobileNo"/></td>
</tr>

</table>
<input type="submit" value="Save"/>
 </form>
</body>
</html>