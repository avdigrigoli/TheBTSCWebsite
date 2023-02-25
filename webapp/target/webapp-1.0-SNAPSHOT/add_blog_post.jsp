<%@ page import="com.example.webapp.adminUser" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>TheBTSC | Blog Options</title>

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
  #insertform
  {
    text-align: center;
    display: block;
  }
  form
  {
    width: 50%;
    margin-left: auto;
    margin-right: auto;
    text-align: left;
    border-bottom: 10px solid white;
    border-top: 10px solid white;
    border-left: 10px solid white;
    border-right: 10px solid white;
  }
</style>
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<%
  adminUser user = (adminUser) session.getAttribute("user");
  if(user != null)
  {

%>

<br>
<h3 style="text-align: center">Adding a Blog Post</h3>
<br>
<div id="insertform">
      <form role="form" action="retrieve_blog_post" method="post" style="background-color: black" enctype="multipart/form-data">
        <div class="form-group">
          <label for="title"> Title </label>
          <input type="text" class="form-control" name="title" id="title" placeholder="Title" required/>
        </div>
        <div class="form-group">
          <label for="author"> Author </label>
          <input type="text" class="form-control" name="author" id="author" placeholder="Author" required/>
        </div>
        <div class="form-group">
          <label for="url_link"> URL Link </label>
          <input type="text" class="form-control" name="url_link" id="url_link" placeholder="URL Link" required/>
        </div>
        <div class="form-group">
          <label for="blog_description"> Blog Description </label>
          <input type="text" class="form-control" name="blog_description" id="blog_description" placeholder="Blog Description" required/>
        </div>
        <div class="form-group">
          <label for="photo"> Photo </label>
          <input type="file" class="form-control" name="photo" id="photo" required/>
        </div>
        <button href="adminBlogOptions.jsp" type="submit" class="btn btn-block">Add The Blog Post
          <span class="glyphicon glyphicon-ok"></span>
        </button>
      </form>
</div>
<%
}
else
{


%>
<h1>
  Access Denied
</h1>
<%
  }
%>

<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>
