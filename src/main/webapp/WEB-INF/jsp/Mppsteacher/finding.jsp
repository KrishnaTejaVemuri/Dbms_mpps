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
 <spring:url value="/Mppsteacher/add" var="urlad" />
 <a href="${urlad }">Add teacher</a>

 <h1>Teachers List</h1>
 <table class="table">
  <tr>
   <th>Teacher Id</th>
   <th>First Name</th>
   <th>Last Name</th>
   <th>Age</th>
   <th>Caste</th>
   <th>Category</th>
   <th>Educational Qualification</th>
   <th>User Id</th>
   
  </tr>
   <tr>
    <td>${Teacherobj.mppstid }</td>
    <td>${Teacherobj.firstname }</td>
    <td>${Teacherobj.lastname }</td>
    <td>${Teacherobj.age }</td>
    <td>${Teacherobj.caste }</td>
    <td>${Teacherobj.cat }</td>
    <td>${Teacherobj.edq }</td>
    <td>${Teacherobj.userid }</td>
    <td>
     <spring:url value="/Mppsteacher/update/${Teacherobj.mppstid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Mppsteacher/delete/${Teacherobj.mppstid }" var="delurl" />
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