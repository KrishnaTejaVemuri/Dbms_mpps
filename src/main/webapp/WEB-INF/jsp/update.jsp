<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<spring:url value="/authorityvisit/updatee" var="saveURL" />
 <form:form modelAttribute="userForm" method="post" action="${saveURL }" >
  <form:hidden path="auid"/>
  <table>
   <tr>
    <td>First name: </td>
    <td>
     <form:input path="firstname"/>
    </td>
   </tr>
   <tr>
    <td>Last name: </td>
    <td>
     <form:input path="lastname"/>
    </td>
   </tr>
   <tr>
    <td>Address: </td>
    <td>
     <form:input path="address"/>
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