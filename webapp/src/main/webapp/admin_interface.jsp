<%@ page import="com.example.webapp.adminUser" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>TheBTSC | Admin Options</title>

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
<body>
 <jsp:include page="navbar.jsp"></jsp:include>

 <%
     adminUser user = (adminUser) session.getAttribute("user");
     if(user != null)
     {

 %>

<br>
 <h3 style="text-align: center">Admin Options</h3>
<br>
 <div id="galleryOptions" style="text-align: center">
     <a id="galleryButton" class="btn btn-primary p-3 px-xl-4 py-xl-3" href="adminGalleryOptions.jsp">Gallery Options</a>
 </div>
<br>
 <div id="blogOptions" style="text-align: center">
     <a id="blogButton" class="btn btn-primary p-3 px-xl-4 py-xl-3" href="adminBlogOptions.jsp">Blog Options</a>
 </div>
<br>
 <div id="calendarApproval" style="text-align: center">
     <a id="approveButton" class="btn btn-primary p-3 px-xl-4 py-xl-3" href="adminCalendarApproval.jsp">Add Event to Calendar</a>
 </div>
<br>
 <div id="messagesTab" style="text-align: center">
     <a id="messagesButton" class="btn btn-primary p-3 px-xl-4 py-xl-3" href="adminMessages.jsp">Messages</a>
 </div>

 <br>

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

</body>
</html>
