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
 <spring:url value="/Gaurdian/add" var="urlad" />
 <a href="${urlad }">Add Guardian</a>

 <h1>Guardian List</h1>
 <table class="table">
  <tr>
   <th>Guardian Id</th>
   <th>Guardian Name</th>
   <th>Relation</th>
   <th>Student Id</th>
  </tr>
  <c:forEach items="${gobj }" var="Gaurdian" >
   <tr>
    <td>${Gaurdian.mppsgid }</td>
    <td>${Gaurdian.gname }</td>
    <td>${Gaurdian.relation }</td>
    <td>${Gaurdian.mppssid }</td>
    <td>
     <spring:url value="/Gaurdian/update/${Gaurdian.mppsgid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Gaurdian/delete/${Gaurdian.mppsgid }" var="delurl" />
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