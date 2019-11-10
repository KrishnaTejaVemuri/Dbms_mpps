<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
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
      <div class="row mt-5">


        <div class="row">
            <div class="col-lg-12 ml-5" >
<spring:url value="/authorityvisit/save" var="savingpath" />
 <form:form modelAttribute="Authobj" method="post" action="${savingpath }" >
 
  <form:hidden path="Auid"/>
  <div align=center>
 <fieldset>
  <table>
   <tr>
    <td>Authority name: </td>
    <td>
     <form:input path="Authname"/>
    </td>
   </tr>
   <tr>
    <td>Designation </td>
    <td>
     <form:input path="Designation"/>
    </td>
   </tr>
   
   <tr>
    <td>Date of visit </td>
    <td>
     <form:input path="Dov"/>
    </td>
   </tr>
   
   <tr>
    <td>Remarks </td>
    <td>
     <form:input path="Remarks"/>
    </td>
   </tr>
   <tr>
   </tr>
   <tr>
    <td></td>
    <td>
     <button type="submit">Save</button>
    </td>
   </tr>
  </table>
  
  </fieldset>
  </div>
 </form:form>
</div>
</div>


</div>
</div>
</div>
</div>

</div>

<jsp:include page="../footer.jsp" />

</body>

</html>