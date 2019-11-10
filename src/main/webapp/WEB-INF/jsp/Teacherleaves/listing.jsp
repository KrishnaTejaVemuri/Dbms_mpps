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
 <spring:url value="/Teacherleave/add" var="urlad" />
 <a href="${urlad }">Add Teacher Leaves Details</a>

 <h1>Teacher Leaves List</h1>
 <table class="table">
  <tr>
   <th>Teacher Leaves Id</th>
   <th>From Date</th>
   <th>To Date</th>
   <th>Type</th>
   
  </tr>
  <c:forEach items="${Tlobj }" var="Teacherleaves" >
   <tr>
    <td>${Teacherleaves.tlid }</td>
    <td>${Teacherleaves.fromdate }</td>
    <td>${Teacherleaves.todate }</td>
    <td>${Teacherleaves.type }</td>
    <td>
     <spring:url value="/Mppsteacher/find/${Teacherleaves.tid }" var="upurl" />
     <a href="${upurl }">Teacher</a>
    </td>
    <td>
     <spring:url value="/Teacherleave/update/${Teacherleaves.tlid }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/Teacherleave/delete/${Teacherleaves.tlid }" var="delurl" />
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