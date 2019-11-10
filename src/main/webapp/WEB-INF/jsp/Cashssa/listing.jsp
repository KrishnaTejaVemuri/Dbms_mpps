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
 <spring:url value="/Cashssa/add" var="urlad" />
 <a href="${urlad }">Add Cashssa</a>

 <h1>Cashssa List</h1>
 <table class="table">
  <tr>
   <th>SGID</th>
   <th>Release Month</th>
   <th>Maintenance Grant</th>
   <th>School Grant</th>
   
  </tr>
  <c:forEach items="${Ssaobj }" var="cashssa" >
   <tr>
    <td>${cashssa.sgid }</td>
    <td>${cashssa.month }</td>
     <td>${cashssa.maintainancegrant}</td>
    <td>${cashssa.schoolgrant }</td>
    <td>
     <spring:url value="/Cashssa/update/${cashssa.sgid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Cashssa/delete/${cashssa.sgid }" var="delurl" />
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