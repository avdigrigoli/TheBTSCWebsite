<%@ page import="com.example.webapp.adminUser" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>TheBTSC | Gallery Options</title>

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
<h3 style="text-align: center">Adding a Photo</h3>

<br>
<div id="insertform">
<form role="form" action="retrieve_image" method="post" style="background-color: black" enctype="multipart/form-data">
    <div class="form-group">
        <label for="title"> Title </label>
        <input type="text" class="form-control" name="title" id="title" placeholder="Title" required/>
    </div>
    <div class="form-group">
        <label for="event_name"> Event Name </label>
        <input type="text" class="form-control" name="event_name" id="event_name" placeholder="Event Name" required/>
    </div>
    <div class="form-group">
        <label for="photographer"> Photographer </label>
        <input type="text" class="form-control" name="photographer" id="photographer" placeholder="Photographer" required/>
    </div>
    <div class="form-group">
        <label for="img_description"> Image Description </label>
        <input type="text" class="form-control" name="img_description" id="img_description" placeholder="Image Description" required/>
    </div>
    <div class="form-group">
        <label for="wedding_tag"> Wedding Tag </label>
        <input type="checkbox" class="form-control" name="wedding_tag" id="wedding_tag">
    </div>
    <div class="form-group">
        <label for="outdoor_tag"> Outdoor Tag </label>
        <input type="checkbox" class="form-control" name="outdoor_tag" id="outdoor_tag">
    </div>
    <div class="form-group">
        <label for="food_tag"> Food Tag </label>
        <input type="checkbox" class="form-control" name="food_tag" id="food_tag">
    </div>
    <div class="form-group">
        <label for="facilities_tag"> Facilities Tag </label>
        <input type="checkbox" class="form-control" name="facilities_tag" id="facilities_tag">
    </div>
    <div class="form-group">
        <label for="image"> Image </label>
        <input type="file" class="form-control" name="image" id="image" required/>
    </div>
    <button href="adminGalleryOptions.jsp" type="submit" class="btn btn-block">Add The Photo
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
