<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1"/>
<title>authorityvisit Page</title>
</head>
<body>
 <spring:url value="/authorityvisit/add" var="addURL" />
 <a href="${addURL }">Add authorityvisit</a>

 <h1>authorityvisits List</h1>
 <table width="100%" border="1">
  <tr>
   <th>ID</th>
   <th>Firstname</th>
   <th>Lastname</th>
   <th>Address</th>
   <th colspan="2">Action</th>
  </tr>
  <c:forEach items="${listUser }" var="authorityvisit" >
   <tr>
    <td>${authorityvisit.auid }</td>
    <td>${authorityvisit.firstname }</td>
    <td>${authorityvisit.lastname }</td>
    <td>
     <spring:url value="/authorityvisit/update/${authorityvisit.auid }" var="updateURL" />
     <a href="${updateURL }">Update</a>
    </td>
    <td>
     <spring:url value="/authorityvisit/delete/${authorityvisit.auid }" var="deleteURL" />
     <a href="${deleteURL }">Delete</a>
    </td>
   </tr>    
  </c:forEach>
 </table>
 
</body>
</html>