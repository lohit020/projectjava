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
<td> Cart id</td>
</tr> -->
<tr>
        <td>Select Quantity:		
		<select id="Quantity" >
		<option>Quantity</option>
		<option>1</option>
		<option>2</option>
		<option>3</option>
		<option>4</option>
		<option>5</option>
		<option>6</option>
		<option>7</option>
		<option>8</option>
		<option>9</option>
		</select></td>
		<%-- <td>Quantity: <%=CartBean.getQuantity()%></td><br> --%>
</tr>
<tr>		
		<td>Cost: <%=FoodBean.getPrice() %></td>
		
</tr>

</table>
<input type="submit" value="saveCart"/>
</form>
<div>

</form>
</div>


</body>
</html>