s<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to home page</h1>
  <sf:form action="process" method="post" modelAttribute="employee">
  <table>
     <tr>
        <td>
            <sf:label path="id">employee id:</sf:label>
        </td>
                <td>
                <sf:input path="id"/>
                </td>
          <td>
          <sf:errors path="id" cssStyle="color:red"/>
          </td>
       </tr>
        <tr>
        <td>
            <sf:label path="name">employee name:</sf:label>
        </td>
                <td>
                <sf:input path="name"/>
                </td>
          <td>
          <sf:errors path="name" cssStyle="color:red"/>
          </td>
       </tr>
        <tr>
        <td>
            <sf:label path="phone">PHone:</sf:label>
        </td>
                <td>
                <sf:input path="phone"/>
                </td>
          <td>
          <sf:errors path="phone" cssStyle="color:red"/>
          </td>
       </tr>
        <tr>
        <td>
            <sf:label path="age">Age:</sf:label>
        </td>
                <td>
                <sf:input path="age"/>
                </td>
          <td>
          <sf:errors path="age" cssStyle="color:red"/>
          </td>
       </tr>
        <tr>
        <td>
            <sf:label path="email">Email id:</sf:label>
        </td>
                <td>
                <sf:input path="email"/>
                </td>
          <td>
          <sf:errors path="email" cssStyle="color:red"/>
          </td>
       </tr>
  
  </table>
  <input type="submit" value="validate"/>
  </sf:form>
</body>
</html>