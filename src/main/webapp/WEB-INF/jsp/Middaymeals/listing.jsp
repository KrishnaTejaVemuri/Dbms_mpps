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
            Middaymeals list <br>

            <spring:url value="/Middaymeals/add" var="urlad" />
            <a href="${urlad }">Add Middaymeals Details</a>

            <table class="table">
                <tr>
                 <th>Middaymeals Id</th>
                 <th>Date</th>
                 <th>Number of students ate</th>
                 
                </tr>
                <c:forEach items="${Mdmobj }" var="Middaymeals" >
                 <tr>
                  <td>${Middaymeals.mdmid }</td>
                  <td>${Middaymeals.date }</td>
                  <td>${Middaymeals.noofstudentsate }</td>
                  <td>
                   <spring:url value="/Messstock/find/${Middaymeals.msid }" var="delurl" />
                   <a href="${delurl }">Mess Stock</a>
                  </td>
                  <td>
                   <spring:url value="/Mppsstaff/find/${Middaymeals.staffid }" var="delurl" />
                   <a href="${delurl }">Mess Staff</a>
                  </td>
                  <td>
                   <spring:url value="/Middaymeals/update/${Middaymeals.mdmid }" var="upurl" />
                   <a href="${upurl }">Update</a>
                  </td>
                  <td>
                   <spring:url value="/Middaymeals/delete/${Middaymeals.mdmid }" var="delurl" />
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