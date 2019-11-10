
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
      <div class="row mt-5">


        <div class="row">
            <div class="col-lg-8 ml-5" >
              <form action="login" method="post">
                <div class="form-group row">
                  <div class="col-md-12 mb-4">
                    <input type="text" class="form-control" type='text' name='username' placeholder="Username">
                  </div>
                  <div class="col-md-12 mb-4">
                    <input type="text" class="form-control" type='password' name='password' placeholder="Password">
                  </div>
                  <div class="col-md-6 mr-auto">
                     <input type="submit" class="btn btn-block btn-primary text-white py-3 px-5" value="Login">
                  </div>
                </div>
              </form>
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