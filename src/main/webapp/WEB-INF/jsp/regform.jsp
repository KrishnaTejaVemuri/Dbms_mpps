<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
</head>
<body>
<spring:url value="/regis/save" var="savingpath" />
 <form:form modelAttribute="Regobj" method="post" action="${savingpath }" >
  <form:hidden path="id"/>
  <table>
   <tr>
    <td>User Name: </td>
    <td>
     <form:input path="Username"/>
    </td>
   </tr>
   <tr>
    <td>Password: </td>
    <td>
     <form:input path="Password"/>
    </td>
   </tr>
   <tr>
    <td>Active: </td>
    <td>
     <form:input path="Active"/>
    </td>
   </tr>
   <tr>
    <td>Role: </td>
    <td>
     <form:input path="Role"/>
    </td>
   </tr>
   
   <tr>
    <td></td>
    <td>
     <button type="submit">Save</button>
    </td>
   </tr>
  </table>
  
 </form:form>
</body>
</html>