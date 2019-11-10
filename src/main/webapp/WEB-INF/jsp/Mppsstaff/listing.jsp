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
 <br>
 <spring:url value="/Mppsstaff/search" var="urlad" />
 <a href="${urlad }">Search Staff</a>

 <h1>staff List</h1>
 <table class="table">
  <tr>
   <th>Staff Id</th>
   <th>Staff Name</th>
   <th>Gender</th>
   <th>Work</th>
   <th>Staff Phone</th>
   
  </tr>
  <c:forEach items="${Staffobj }" var="Mppsstaff" >
   <tr>
    <td>${Mppsstaff.staffid }</td>
    <td>${Mppsstaff.stname }</td>
    <td>${Mppsstaff.gender }</td>
    <td>${Mppsstaff.work }</td>
    <td>${Mppsstaff.staffphone }</td>
    <td>
     <spring:url value="/Mppsstaff/update/${Mppsstaff.staffid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Mppsstaff/delete/${Mppsstaff.staffid }" var="delurl" />
     <a href="${delurl }">Delete</a>
    </td>
   </tr>    
  </c:forEach>
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