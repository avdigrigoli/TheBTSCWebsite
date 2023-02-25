<%--
  Created by IntelliJ IDEA.
  User: antho
  Date: 3/23/2022
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.webapp.adminUser" %>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
<!-- Navigation Bar Start-->
<nav class="navbar navbar-expand-lg navbar-dark ftco_navbar bg-dark ftco-navbar-light" id="ftco-navbar">
    <div class="container">
        <a class="navbar-brand" href="index.jsp"><img src="images/navbarlogo.png" class="img-fluid" alt=""></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#ftco-nav" aria-controls="ftco-nav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="oi oi-menu"></span> Menu
        </button>
        <div class="collapse navbar-collapse" id="ftco-nav">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item"><a href="index.jsp" class="nav-link">Home</a></li>
                <li class="nav-item"><a href="events.jsp" class="nav-link">Events</a></li>
                <li class="nav-item"><a href="facilities.jsp" class="nav-link">Facilities</a></li>
                <li class="nav-item"><a href="catering.jsp" class="nav-link">Catering</a></li>
                <li class="nav-item"><a href="gallery.jsp" class="nav-link">Gallery</a></li>
                <li class="nav-item"><a href="blog.jsp" class="nav-link">Blog</a></li>
                <li class="nav-item"><a href="contact.jsp" class="nav-link">Contact</a></li>
            </ul>
            <ul class="navbar-nav ms-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"><span class="bi-person-circle"></span> Account</a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <%
                            adminUser user = (adminUser) session.getAttribute("user");
                            if (user != null)
                            {
                        %>
                        <li id="menu-adminInterface"><a class="dropdown-item" href="admin_interface.jsp">Admin Options</a> </li>
                        <li id="menu-logout"><a class="dropdown-item" href="LogoutServlet">Logout</a></li>
                        <%
                            }
                            else
                            {
                        %>
                        <li id="menu-login"><a class="dropdown-item" href="adminLogin.jsp">Login</a></li>
                        <%
                            }
                        %>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<!-- Navigation Bar End-->
