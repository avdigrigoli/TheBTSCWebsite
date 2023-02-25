<%--
  Created by IntelliJ IDEA.
  User: jdita
  Date: 4/5/2022
  Time: 11:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Login</title>
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

    <link rel="stylesheet" href="css/icomoon.css">
    <link rel="stylesheet" href="css/style.css">
    <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
            crossorigin="anonymous"></script>
    <script type="text/javascript"
            src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
</head>
<body>
    <div style="text-align: center">
        <h1>Admin Login</h1>
        <form action="adminUser_servlet" method="post">
            <%--@declare id="username"--%><%--@declare id="password"--%><label for="username">Username:</label>
            <label>
                <input name="username" size="30" />
            </label>
            <br><br>
            <label for="password">Password:</label>
            <label>
                <input type="password" name="password" size="30" />
            </label>
            <br>${message}
            <br><br>
            <button type="submit">Login</button>
        </form>
    </div>

    <jsp:include page="footer.jsp"></jsp:include>

</body>
<script type="text/javascript">

    $(document).ready(function() {
        $("#loginForm").validate({
            rules: {
                username: {
                    required: true,
                    username: true
                },

                password: "required",
            },

            messages: {
                username: {
                    required: "Please enter username",
                    username: "Please enter a valid username"
                },

                password: "Please enter password"
            }
        });

    });
</script>
</html>
