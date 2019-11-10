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
 <spring:url value="/Messstock/add" var="urlad" />
 <a href="${urlad }">Add Messstock Details</a>
 <br>
 <spring:url value="/Messstock/search" var="urlad" />
 <a href="${urlad }">search Messstock Details</a>

 <h1>Mess Stock List</h1>
 <table class="table">
  <tr>
   <th>Mess Stock Id</th>
   <th>Month</th>
   <th>Number of eggs</th>
   <th>Rice in Kgs</th>
   
  </tr>
  <c:forEach items="${Mstobj }" var="Messstock" >
   <tr>
    <td>${Messstock.msid }</td>
    <td>${Messstock.month }</td>
    <td>${Messstock.noeggs }</td>
    <td>${Messstock.ricekgs }</td>
    <td>
     <spring:url value="/Messstock/update/${Messstock.msid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Messstock/delete/${Messstock.msid }" var="delurl" />
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