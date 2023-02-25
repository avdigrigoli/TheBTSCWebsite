<%@ page import="java.util.ArrayList" %>
<%@page import="com.example.webapp.retrieveBlogPost_dao"%>
<%@ page import="java.nio.charset.StandardCharsets" %>
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
    h3{
        color: #3fc3e8;
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
<h3 style="text-align: center">Admin Blog Posts</h3>
<br>

<p><a class="btn btn-white btn-outline-white" href="add_blog_post.jsp">Add A Blog Post</a></p>
<br>

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
                String title = retrieveBlogPost_dao.getTitle(id);
                String author = retrieveBlogPost_dao.getAuthor(id);
                String url_link = retrieveBlogPost_dao.getUrl_link(id);
                String blog_description = retrieveBlogPost_dao.getBlog_description(id);
        %>
            <tr>
                <td><%= id%></td>
                <td><%= title%></td>
                <td><%= author%></td>
                <td><%= url_link%></td>
                <td><%= blog_description%></td>
                <td><img src="create_blog_post.jsp?id=<%= id%>" loading="lazy" width="100px" class="img-fluid"/></td>
                <td><a class="btn btn-white btn-outline-white" href="DeleteBlogPostServlet?id=<%= id%>">Delete Blog Post</a></td>

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
