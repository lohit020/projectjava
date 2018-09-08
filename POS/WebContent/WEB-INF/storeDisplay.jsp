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
<h1>Employee Data
</h1>
<form action="addEmployee" method="post">
<input type="submit" value="addEmployee"/></form>
<table border="3">
	<tr>
		<th>Employee No</th>
		<th>Employee Name</th>
		<th>Salary</th>
		<th>Eno</th>
		<th>Dno</th>
	</tr>
	
	<c:forEach var="employee" items="${emplo }">
		<tr>
			<td>${employee.id }</td>
			<td>${employee.name }</td>
			<td>${employee.sal }</td>
			<td>${employee.eno }</td>
			<td>${employee.dno }</td>
		</tr>
	
	
	</c:forEach>

</table>
</body>
</html>