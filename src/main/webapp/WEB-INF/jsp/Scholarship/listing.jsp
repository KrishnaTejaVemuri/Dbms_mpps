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
 <spring:url value="/Scholarship/add" var="urlad" />
 <a href="${urlad }">Add Scholarship</a>

 <h1>Scholarship List</h1>
 <table class="table">
  <tr>
   <th>Application Id</th>
   <th>Applied Amount</th>
   <th>Grant Amount</th>
   <th>Status</th>
  </tr>
  <c:forEach items="${Schobj }" var="Scholarship" >
   <tr>
    <td>${Scholarship.aplid }</td>
    <td>${Scholarship.appliedamount }</td>
    <td>${Scholarship.grantamount }</td>
    <td>${Scholarship.status }</td>
     <td>
     <spring:url value="/Mppsstudent/find/${Scholarship.mppssid }" var="upurl" />
     <a href="${upurl }">Student</a>
    </td>
    <td>
     <spring:url value="/Scholarship/update/${Scholarship.aplid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Scholarship/delete/${Scholarship.aplid }" var="delurl" />
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