<%@ page import="java.util.ArrayList" %>
<%@page import="com.example.webapp.retrieveImage_dao"%>
<%@ page import="java.nio.charset.StandardCharsets" %>
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
<body>
<jsp:include page="navbar.jsp"></jsp:include>
<%
    adminUser user = (adminUser) session.getAttribute("user");
    if(user != null)
    {

%>

<br>
<h3 style="text-align: center">Admin Gallery</h3>
<br>



    <p><a class="btn btn-white btn-outline-white" href="add_photo.jsp">Add A Photo</a></p>

<div>
    <table class="center table table-hover table-dark">
        <thead>
        <tr>
            <th> ID </th>
            <th> Image </th>
            <th> </th>
        </tr>
        </thead>
        <tbody>
        <% ArrayList<Integer> idlist = retrieveImage_dao.getIDs(retrieveImage_dao.all_images);
            for(int id : idlist){
        %>
        <tr>
            <td><%= id%></td>
            <td><img src="create_image.jsp?id=<%= id%>" loading="lazy" width="100px" class="img-fluid"/></td>
            <td><a class="btn btn-white btn-outline-white" href="DeleteImageServlet?id=<%= id%>">Delete Photo</a></td>
        </tr>
        </tbody>
        <% } %>
    </table>
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