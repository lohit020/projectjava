<%@page import="com.training.pos.bean.CartBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cart</title>
</head>
<body>
<h1>Cart</h1>
<jsp:useBean id="CartBean" class="com.training.pos.bean.CartBean" scope="session"/>
<jsp:setProperty name="CartBean" property="*"/>
<jsp:useBean id="FoodBean" class="com.training.pos.bean.FoodBean" scope="session"/>
<jsp:setProperty name="FoodBean" property="*"/>
<form action="saveCart" method="post">
<table border="3">
<tr>
<td>cart Id</td>
     <td>
     <input type="text" name="cartID">
     
     </td>
</tr>
<tr>
<td>User Id</td>
     <td>
     <input type="text" name="userId">
     </td>
</tr>
<tr>
<td>Food Id</td>
     <!-- <td>
     <input type="text" name="foodId">
     </td> -->
     <td><%=FoodBean.getFoodId()%></td>
</tr>
<tr>
<td>Type</td>
     <td>
     <input type="text" name="type">
     </td>
</tr>
<tr>
<td>Quantity</td>
     <td>
     <input type="text" name="quantity">
     </td>
</tr>
<tr>
<td>cost</td>
     <td>
     <input type="text" name="cost">
     </td>
</tr>
<tr>
<td>Order Date</td>
     <td>
     <input type="date" name="orderDate">
     </td>
</tr>

</table>
<input type="submit" value="saveCart"/>
</form>
</body>
</html>






<%-- <body>
<h1>Cart</h1>
<jsp:useBean id="CartBean" class="com.training.pos.bean.CartBean" scope="session"/>
<jsp:setProperty name="CartBean" property="*"/>
<jsp:useBean id="FoodBean" class="com.training.pos.bean.FoodBean" scope="session"/>
<jsp:setProperty name="FoodBean" property="*"/>
<form action="saveCart" method="post">
<table border="3">
<tr>
		<td>Cart Id:<%=CartBean.getCartID()%></td>
</tr>

<tr>
        <td>Type: <%=CartBean.getType()%></td>
</tr>

<tr>
        <td>Name: <%=FoodBean.getName()%></td>
</tr>

<tr>
        <td>Id: <%=FoodBean.getFoodId()%></td>
</tr>


<!-- <tr>
        
        <td>Select Quantity:		
		<select name="quantity" onchange="value" >
		<option>Quantity</option>
		<option value="1">1</option>
		<option value="2">2</option>
		<option value="3">3</option>
		<option value="4">4</option>
		<option value="5">5</option>
		<option value="6">6</option>
		<option value="7">7</option>
		<option value="8">8</option>
		<option>9</option>
		</select></td>
	
</tr> -->
<tr>
     <td>cartid</td>
     <td>
     <input type="text" name="cartID">
     </td>
</tr>
<!-- <tr>
     <td>type</td>
     <td>
     <input type="text" name="cartID">
     </td>
</tr>
<tr>
     <td>Enter Quantity :</td>
     <td>
     <input type="text" name="quantity">
     </td>
</tr> -->
		
		
<tr>		
		<td>Cost: <%=FoodBean.getPrice() %></td>
		
</tr>

</table>
<input type="submit" value="saveCart"/>
</form>



</body> --%>
