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
 <a href="${urlad }">Add Student</a><br>
 <spring:url value="/Mppsstudent/search" var="srlad" />
 <a href="${srlad }">Search Student</a>

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
  <c:forEach items="${Stobj }" var="Mppsstudent" >
   <tr>
    <td>${Mppsstudent.mppssid }</td>
    <td>${Mppsstudent.firstname }</td>
    <td>${Mppsstudent.lastname }</td>
    <td>${Mppsstudent.age}</td>
    <td>${Mppsstudent.caste }</td>
    <td>${Mppsstudent.gender }</td>
    
     <td>
     <spring:url value="/Mppsclass/find/${Mppsstudent.classid }" var="clsurl" />
     <a href="${clsurl }">Class</a>
    </td>
     <td>
     <spring:url value="/Prevschool/find/${Mppsstudent.schoolid }" var="clsurl" />
     <a href="${clsurl }">Previous School</a>
    </td>
    <td>
     <spring:url value="/Mppsstudent/update/${Mppsstudent.mppssid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Mppsstudent/delete/${Mppsstudent.mppssid }" var="delurl" />
     <a href="${delurl }">Delete</a>
    </td>
    <td>
     <spring:url value="/Healthlog/list1/${Mppsstudent.mppssid }" var="delurl" />
     <a href="${delurl }">Healthlog</a>
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