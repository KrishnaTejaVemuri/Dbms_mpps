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
<spring:url value="/authorityvisit/save" var="saveURL" />
 <form:form modelAttribute="userForm" method="post" action="${saveURL }" >
  <form:hidden path="Auid"/>
  <table>
   <tr>
    <td>Authority name: </td>
    <td>
     <form:input path="Authname"/>
    </td>
   </tr>
   <tr>
    <td>Designation </td>
    <td>
     <form:input path="Designation"/>
    </td>
   </tr>
   
   <tr>
    <td>Date of visit </td>
    <td>
     <form:input path="Dov"/>
    </td>
   </tr>
   
   <tr>
    <td>Remarks </td>
    <td>
     <form:input path="Remarks"/>
    </td>
   </tr>
   <tr>
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