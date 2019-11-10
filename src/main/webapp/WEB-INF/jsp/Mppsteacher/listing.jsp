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
 <br>
<spring:url value="/Mppsteacher/search" var="srlad" />
 <a href="${srlad }">search teacher</a>
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
  <c:forEach items="${Teacherobj }" var="Mppsteacher" >
   <tr>
    <td>${Mppsteacher.mppstid }</td>
    <td>${Mppsteacher.firstname }</td>
    <td>${Mppsteacher.lastname }</td>
    <td>${Mppsteacher.age }</td>
    <td>${Mppsteacher.caste }</td>
    <td>${Mppsteacher.cat }</td>
    <td>${Mppsteacher.edq }</td>
    <td>${Mppsteacher.userid }</td>
    <td>
     <spring:url value="/Mppsteacher/update/${Mppsteacher.mppstid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Mppsteacher/delete/${Mppsteacher.mppstid }" var="delurl" />
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