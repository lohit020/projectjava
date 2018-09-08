<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Employee details</h1>
<table border="3">
 
<tr>
<th> employee no</th>
<th> employee name</th>
<th> gender</th>
<th> age</th>
<th> salary</th>
</tr>
 <c:forEach var="employee" items="${employees }">
 <tr>
     <td>${employee.id }</td>
     <td>${employee.name }</td>
     <td>${employee.gender }</td>
     <td>${employee.age }</td>
     <td>${employee.salary}</td>
     </tr>
   </c:forEach>  
</table>
<form method="post" action="addemployee">
 <input type="submit" value="Add employeE" >
 </form>
</body>
</html>