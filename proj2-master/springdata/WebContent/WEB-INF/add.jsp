<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add employee</h1>
<form method="post" action="saveemployee">
<table>
  <tr>
       <td> employee ID</td>
       <td><input type="text" name="id"/></td>
       </tr>
       <tr>
         <td> Emp Name</td>
           <td><input type="text" name="name"/></td>
           </tr>
           <tr>
             <td>Gender</td>
            <td>
               <input type="radio" name="gender" value="male"/>Male
                 <input type="radio" name="gender" value="femmale"/>Female
            </td>
            </tr>
            <tr>
              <td>Age</td>
               <td><input type="text" name="age"/></td>
               </tr>
               <tr>
               <td>Salary</td>
                <td><input type="text" name="salary"/></td>
                </tr> 
         
</table>
<input type="submit" value="save"/>
</form>
</body>
</html>