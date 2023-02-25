<%@ page import="com.example.webapp.adminUser" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.webapp.retrieveBlogPost_dao" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>TheBTSC | Messages</title>
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
<%
    adminUser user = (adminUser) session.getAttribute("user");
    if(user != null)
    {

%>


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



<div>
    <table class="center table table-hover table-dark">
        <thead>
        <tr>
            <th> ID </th>
            <th> Title </th>
            <th> Author </th>
            <th> URL </th>
            <th> Description </th>
            <th> Image </th>
        </tr>
        </thead>
        <tbody>
        <% ArrayList<Integer> idlist = retrieveBlogPost_dao.getIDs();
            for(int id : idlist){
                String name = retrieveBlogPost_dao.getTitle(id);
                String email = retrieveBlogPost_dao.getAuthor(id);
                String subject = retrieveBlogPost_dao.getUrl_link(id);
                String message = retrieveBlogPost_dao.getBlog_description(id);
        %>
        <tr>
            <td><%= name%></td>
            <td><%= email%></td>
            <td><%= subject%></td>
            <td><%= message%></td>

        </tr>
        </tbody>
        <% } %>
    </table>
</div>

</body>
</html>
