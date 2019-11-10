<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>

<head>
<jsp:include page="../head.jsp" />
</head>


<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">


<div class="site-wrap" id="home-section">

<jsp:include page="../header.jsp" />


<div class="ftco-blocks-cover-1">

  <div class="site-section-cover overlay">
    <div class="container">
      <div >
 <spring:url value="/Mppsstaff/add" var="urlad" />
 <a href="${urlad }">Add Staff</a>

 <h1>staff List</h1>
 <table class="table">
  <tr>
   <th>Staff Id</th>
   <th>Staff Name</th>
   <th>Gender</th>
   <th>Work</th>
   <th>Staff Phone</th>
   
  </tr>
   <tr>
    <td>${Staffobj.staffid }</td>
    <td>${Staffobj.stname }</td>
    <td>${Staffobj.gender }</td>
    <td>${Staffobj.work }</td>
    <td>${Staffobj.staffphone }</td>
    <td>
     <spring:url value="/Mppsstaff/update/${Staffobj.staffid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Mppsstaff/delete/${Staffobj.staffid }" var="delurl" />
     <a href="${delurl }">Delete</a>
    </td>
   </tr>
 </table>
 
</body>
</html>