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
 <spring:url value="/Mppsexam/add" var="urlad" />
 <a href="${urlad }">Add Exam Details</a>

 <h1>Exams List</h1>
 <table class="table">
  <tr>
   <th>Exam Id</th>
   <th>Exam Name</th>
   <th>Marks Obtained</th>
   <th>Max Marks</th>
   
  </tr>
  <c:forEach items="${Examobj }" var="Mppsexam" >
   <tr>
    <td>${Mppsexam.examid }</td>
    <td>${Mppsexam.examname }</td>
    <td>${Mppsexam.marksobtained }</td>
    <td>${Mppsexam.maxmarks }</td>
    <td>
     <spring:url value="/Mppsstudent/find/${Mppsexam.mppssid }" var="upurl" />
     <a href="${upurl }">Student</a>
    </td>
    <td>
     <spring:url value="/Mppsexam/update/${Mppsexam.examid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Mppsexam/delete/${Mppsexam.examid }" var="delurl" />
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