<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Cart</h1>
<form action="updateCart" method="post">

<table>
	<tr>
		<td>cart Id</td>
		<td><input type="text" name="cartID" value="${CartBean.cartID}"/></td>
</tr>
<tr>
      <td>User Id</td>
     <td>
     <input type="text" name="userId" value="${CartBean.userId}"/>
     </td>
</tr>
<tr>
<td>Food Id</td>
     <td>
     <input type="text" name="foodId" value="${CartBean.foodId}"/>
     </td>
     <%-- <td><%=FoodBean.getFoodId()%></td> --%>
</tr>
<tr>
<td>Type</td>
     <td>
     <input type="text" name="type" value="${CartBean.type}"/>
     </td>
</tr>
<tr>

        
        <td>Select Quantity:		
		<select name="quantity" onchange="value"  >
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
	


</tr>
<tr>
<td>cost</td>
     <td>
     <input type="text" name="cost" value="${CartBean.cost}"/>
     </td>
</tr>
<tr>
<td>Order Date</td>
     <td>
     <input type="date" name="orderDate" value="${CartBean.orderDate}"/>
     </td>
</tr>
	
	
</table>
<input type="submit" value="updateCart"/>

</form>
</body>
</html>