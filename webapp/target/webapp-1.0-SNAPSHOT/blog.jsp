<%@ page import="java.util.ArrayList" %>
<%@page import="com.example.webapp.retrieveBlogPost_dao"%>
<%@ page import="java.nio.charset.StandardCharsets" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>TheBTSC | Blog</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Josefin+Sans" rel="stylesheet">
  <link href="https://fonts.googleapis.com/css?family=Nothing+You+Could+Do" rel="stylesheet">

  <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
  <link rel="stylesheet" href="css/animate.css">

  <link rel="stylesheet" href="css/owl.carousel.min.css">
  <link rel="stylesheet" href="css/owl.theme.default.min.css">
  <link rel="stylesheet" href="css/magnific-popup.css">

  <link rel="stylesheet" href="css/aos.css">

  <link rel="stylesheet" href="css/ionicons.min.css">

  <link rel="stylesheet" href="css/bootstrap-datepicker.css">
  <link rel="stylesheet" href="css/jquery.timepicker.css">


  <link rel="stylesheet" href="css/flaticon.css">
  <link rel="stylesheet" href="css/icomoon.css">
  <link rel="stylesheet" href="css/style.css">
</head>

<style>
  h3{
    color: #3fc3e8;
  }
</style>

<body>

<jsp:include page="navbar.jsp"></jsp:include>


<div class="main-wrapper ">
  <section class="page-title bg-1">
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <div class="block text-center">
            <br>
            <h1 class="text-capitalize mb-4 text-lg">Blog Articles</h1>
          </div>
        </div>
      </div>
    </div>
  </section>

  <section class="section blog-wrap bg-gray">
    <div class="container">
      <div class="row">

          <% ArrayList<Integer> idlist = retrieveBlogPost_dao.getIDs();
            for(int id : idlist){
            String title = retrieveBlogPost_dao.getTitle(id);
            String author = retrieveBlogPost_dao.getAuthor(id);
            String url_link = retrieveBlogPost_dao.getUrl_link(id);
            String blog_description = retrieveBlogPost_dao.getBlog_description(id);
        %>
        <div class="col-lg-6 col-md-6 mb-5">
          <div class="blog-item">
            <img src="create_blog_post.jsp?id=<%= id%>" loading="lazy" class="img-fluid"/>

            <div class="blog-item-content bg-dark p-5">
              <h3 class="mt-3 mb-3"><%=title%></h3>
              <p class="mb-4"><%=author%></p>
                <!--<span class="text-black text-capitalize mr-3"><i class="ti-time mr-1"></i> 28th January</span>-->
              <p class="mb-4"><%=blog_description%></p>
              <a href="https://www.<%=url_link%>" class="btn btn-small btn-main btn-round-full">Learn More</a>
            </div>
          </div>
        </div>

          <% } %>
        </div>
    </div>
    </section>


  <jsp:include page="footer.jsp"></jsp:include>



  <!-- loader -->
  <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


  <script src="js/jquery.min.js"></script>
  <script src="js/jquery-migrate-3.0.1.min.js"></script>
  <script src="js/popper.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquery.easing.1.3.js"></script>
  <script src="js/jquery.waypoints.min.js"></script>
  <script src="js/jquery.stellar.min.js"></script>
  <script src="js/owl.carousel.min.js"></script>
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/aos.js"></script>
  <script src="js/jquery.animateNumber.min.js"></script>
  <script src="js/bootstrap-datepicker.js"></script>
  <script src="js/jquery.timepicker.min.js"></script>
  <script src="js/scrollax.min.js"></script>
  <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
  <script src="js/google-map.js"></script>
  <script src="js/main.js"></script>

</div>
</body>
</html>