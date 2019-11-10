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
<spring:url value="/Mppsteacher/save" var="savingpath" />
 <form:form modelAttribute="Teacherobj" method="post" action="${savingpath }" >
  
  <div align=center>
 <fieldset>
 <table>
   <tr>
    <td>Teacher Id: </td>
    <td>
     <form:input path="Mppstid"/>
    </td>
   </tr>
   <tr>
    <td>First Name: </td>
    <td>
     <form:input path="Firstname"/>
    </td>
   </tr>
   <tr>
    <td>Last Name: </td>
    <td>
     <form:input path="Lastname"/>
    </td>
   </tr>
   <tr>
    <td>Age: </td>
    <td>
     <form:input path="Age"/>
    </td>
   </tr>
   <tr>
    <td>Caste: </td>
    <td>
     <form:input path="Caste"/>
    </td>
   </tr>
   <tr>
    <td>Category: </td>
    <td>
     <form:input path="Cat"/>
    </td>
   </tr>
   <tr>
    <td>Educational Qualification: </td>
    <td>
     <form:input path="Edq"/>
    </td>
   </tr>
   <tr>
    <td>User Id </td>
    <td>
     <form:input path="Userid"/>
    </td>
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