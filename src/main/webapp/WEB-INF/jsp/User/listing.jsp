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
<a  href='/'>Home</a>
 <spring:url value="/user/add" var="urlad" />
 <a href="${urlad }">Registration</a>
 <h1>Users List</h1>
 <table class="table">
  <tr>
   <th> Id</th>
   <th>User Name</th>
   <th>User Password</th>
   <th>Active</th>
   <th>Role</th>
   
  </tr>
  <c:forEach items="${Userobj }" var="Users" >
   <tr>
    <td>${Users.id }</td>
    <td>${Users.username }</td>
    <td>${Users.password }</td>
    <td>${Users.active }</td>
    <td>${Users.role }</td>

    <td>
     <spring:url value="/user/update/${Users.id }" var="upurl" />
     <a href="${upurl }">Update</a>
    </td>
    <td>
     <spring:url value="/user/delete/${Users.id }" var="delurl" />
     <a href="${delurl }">Remove</a>
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