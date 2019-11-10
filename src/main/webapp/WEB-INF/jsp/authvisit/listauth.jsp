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
 <spring:url value="/authorityvisit/add" var="urlad" />
 <a class="bn" href="${urlad }">Add authority visit</a>

 <h1>authority visits List</h1>
 <table class="table">
  <tr>
   <th>ID</th>
   <th>Authority name</th>
   <th>Designation</th>
   <th>Date of visit</th>
   
   <th>Remarks</th>
  </tr>
  <c:forEach items="${listAuthority }" var="authorityvisit" >
   <tr>
    <td>${authorityvisit.auid }</td>
    <td>${authorityvisit.authname }</td>
     <td>${authorityvisit.designation }</td>
    <td>${authorityvisit.dov }</td>
    <td>${authorityvisit.remarks }</td>
    <td>
     <spring:url value="/authorityvisit/update/${authorityvisit.auid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/authorityvisit/delete/${authorityvisit.auid }" var="delurl" />
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