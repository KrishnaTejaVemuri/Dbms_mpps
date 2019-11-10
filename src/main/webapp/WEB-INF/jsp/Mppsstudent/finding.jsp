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
 <spring:url value="/Mppsstudent/add" var="urlad" />
 <a href="${urlad }">Add Student</a>

 <h1>Student List</h1>
 <table class="table">
  <tr>
   <th>Student Id</th>
   <th>First Name</th>
   <th>Last Name</th>
   <th>Age</th>
   <th>Caste</th>
   <th>Gender</th>
   <th>Class Id</th>
   <th>School Id</th>
   
  </tr>
   <tr>
    <td>${Stobj.mppssid }</td>
    <td>${Stobj.firstname }</td>
    <td>${Stobj.lastname }</td>
    <td>${Stobj.age}</td>
    <td>${Stobj.caste }</td>
    <td>${Stobj.gender }</td>
    
     <td>
     <spring:url value="/Mppsclass/find/${Stobj.classid }" var="clsurl" />
     <a href="${clsurl }">Class</a>
    </td>
     <td>
     <spring:url value="/Prevschool/find/${Stobj.schoolid }" var="clsurl" />
     <a href="${clsurl }">Previous School</a>
    </td>
    <td>
     <spring:url value="/Mppsstudent/update/${Stobj.mppssid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Mppsstudent/delete/${Stobj.mppssid }" var="delurl" />
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