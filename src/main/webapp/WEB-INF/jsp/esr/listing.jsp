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
 <spring:url value="/esr/add" var="urlad" />
 <a href="${urlad }">Add Exam Subject Relation</a>

 <h1>Exam Subject Relation List</h1>
 <table class="table">
  <tr>
   <th>Exam ID</th>
   <th>Subject Id</th>
   
  </tr>
  <c:forEach items="${esrobj }" var="esr" >
   <tr>
    <td>${esr.examid }</td>
    <td>${esr.subid }</td>
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