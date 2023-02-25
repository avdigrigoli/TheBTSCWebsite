<%@ page import="java.util.ArrayList" %>
<%@page import="com.example.webapp.event_request_dao"%>
<%@ page import="java.nio.charset.StandardCharsets" %>
<%@ page import="com.example.webapp.adminUser" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>TheBTSC | Calendar Options</title>
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
<h3 style="text-align: center">Adding a Calendar Event</h3>
<br>

<div id="insertform">
        <form role="form" action="CalendarEventServlet" style="background-color: black" method="post">
            <div class="form-group">
                <label for="name"> Name </label>
                <input type="text" class="form-control" name="name" id="name" placeholder="Name" required/>
            </div>
            <div class="form-group">
                <label for="description"> Description </label>
                <input type="text" class="form-control" name="description" id="description" placeholder="Description" required/>
            </div>
            <div class="form-group">
                <label for="date"> Date </label>
                <input type="text" class="form-control" name="date" id="date" placeholder="Date" required/>
            </div>
            <div class="form-group">
                <label for="type"> Type </label>
                <input type="text" class="form-control" name="type" id="type" placeholder="Type" required/>
            </div>
            <div class="form-group">
                <label for="color"> Color </label>
                <input type="text" class="form-control" name="color" id="color" placeholder="Color" required/>
            </div>
            <button href="adminCalendarApproval.jsp" type="submit" class="btn btn-block">Add The Event
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
