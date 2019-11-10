<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <jsp:include page="head.jsp" />
</head>


<body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">


  <div class="site-wrap" id="home-section">

    <jsp:include page="header.jsp" />


    <div class="ftco-blocks-cover-1">

      <div class="site-section-cover overlay">
        <div class="container">
          <div class="row ">

            <div class="col-md-6">
                <ul class="ul-check list-unstyled teal">
                   <li><a href="/Messstock/list"> Messstock</a></li>
                    <li><a href="/Mppsexam/list"> Exams</a></li>
                    <li><a href="/Scholarship/list"> Scholarship</a></li>
                    <li><a href="/Mppssubject/list"> Subject</a></li>
                    <li><a href="/Mppsclass/list"> Class</a></li>
                    <li><a href="/Prevschool/list"> Student Previous Schools</a></li>
                    <li><a href="/Cashssa/list"> Cashssa</a></li>
                </ul>
            </div>
            <div class="col-md-6">
              <div class="pricing danger">
                  <ul class="ul-check list-unstyled teal">
                      <li><a href="/authorityvisit/list"> Authority Visits</a></li>
                      <li><a href="/Healthlog/list"> Healthlog</a></li>
                      <li><a href="/Teacherleave/list"> Teacher Leaves</a></li>
                      <li><a href="/user/list"> Users</a></li>
                      <li><a href="/esr/list"> Exam Subject Relation</a></li>
                      <li><a href="/cmr/list"> Class Middaymeals Relation</a></li>
                      <li><a href="/Gaurdian/list"> Guardian</a></li>
                  </ul>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

  </div>

  <jsp:include page="footer.jsp" />

</body>

</html>