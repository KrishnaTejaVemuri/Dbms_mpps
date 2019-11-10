<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>

<head>
<jsp:include page="head.jsp" />
</head>
<body  data-spy="scroll" data-target=".site-navbar-target" data-offset="300">

<div class="site-wrap" id="home-section">

<jsp:include page="header.jsp" />


<div class="ftco-blocks-cover-1">

  <div class="site-section-cover overlay">
    <div class="container">
      <div class="row">
You are giving incorrect input. please verify it again.<br>
<br>
<br> 
Error can be in: <br>
Foreign key<br>
Date format : yyyy-mm-dd<br>
Phone Number : It should contain only 10 digits.<br>
Giving an entry which is already present.<br>
Not filling necessary fields<br>
Likewise.
<br>
<br>

      
      </div>
    </div>
  </div>
</div>

</div>

<jsp:include page="footer.jsp" />

</body>

</html>