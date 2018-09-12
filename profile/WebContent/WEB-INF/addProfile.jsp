<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add Profile</h1>
<form action="saveProfile" method="post">
<table>
<tr>
<td>User Id</td>
<td><input type="text" name="userId"/></td>
</tr>
<tr>
<td>First Name</td>
<td> <input type="text" name="firstName"/> </td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastName"/></td>
</tr>
<tr>
<td>Date of birth</td>
<td><input type="Date" name="dateOfBirth"/></td>
</tr>
<tr>
<td>Gender</td>
<td><input type="text" name="gender"/></td>
</tr>
<tr>
<td>Street</td>
<td><input type="text" name="street"/></td>
</tr>
<tr>
<td>City</td>
<td><input type="text" name="city"/></td>
</tr>
<tr>
<td>State</td>
<td><input type="text" name="state"/></td>
</tr>
<tr>
<td>Location</td>
<td><input type="text" name="location"/></td>
</tr>
<tr>
<td>Location</td>
<td><input type="text" name="pincode"/></td>
</tr>
<tr>
<td>Mobile number</td>
<td><input type="text" name="mobileNo"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" name="password"/></td>
</tr>


</table>
<input type="submit" value="Save"/>
</form>
</body>
</html>
    