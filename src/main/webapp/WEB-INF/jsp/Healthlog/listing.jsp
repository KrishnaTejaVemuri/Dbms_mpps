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
 <spring:url value="/Healthlog/add" var="urlad" />
 <a href="${urlad }">Add Healthlog</a>

 <h1>Healthlog List</h1>
 <table class="table">
  <tr>
   <th>Check Up Id</th>
   <th>Date</th>
   <th>Problem</th>
   <th>Student Id</th>
  </tr>
  <c:forEach items="${Hobj }" var="Healthlog" >
   <tr>
    <td>${Healthlog.checkupid }</td>
    <td>${Healthlog.date }</td>
    <td>${Healthlog.problem }</td>
    <td>${Healthlog.sid }</td>
    <td>
     <spring:url value="/Mppsstudent/find/${Healthlog.sid }" var="upurl" />
     <a href="${upurl }">Student</a>
    </td>
    <td>
     <spring:url value="/Healthlog/update/${Healthlog.checkupid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Healthlog/delete/${Healthlog.checkupid }" var="delurl" />
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