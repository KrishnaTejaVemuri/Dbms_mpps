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
 <spring:url value="/Prevschool/add" var="urlad" />
 <a href="${urlad }">Add Previous School</a>

 <h1>Previous Schools List</h1>
 <table class="table">
  <tr>
   <th>School Id</th>
   <th>School Name</th>
   <th>Contact Number</th>
   
   
  </tr>
   <tr>
    <td>${Schoolobj.schoolid }</td>
    <td>${Schoolobj.schoolname }</td>
    <td>${Schoolobj.contactno }</td>
    <td>
     <spring:url value="/Prevschool/update/${Schoolobj.schoolid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Prevschool/delete/${Schoolobj.schoolid }" var="delurl" />
     <a href="${delurl }">Delete</a>
    </td>
   </tr>    
 </table>
 
</div>
</div>
</div>
</div>

</div>

<style>
.table{
margin: 20px auto;
}
</style>


<jsp:include page="../footer.jsp" />



</body>

</html>