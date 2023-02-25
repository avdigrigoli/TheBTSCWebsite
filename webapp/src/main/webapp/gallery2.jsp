<%@ page import="java.util.ArrayList" %>
<%@page import="com.example.webapp.retrieveImage_dao"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>TheBTSC | Catering</title>
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

<script>
        function changeLanguage1() {
        var eng = document.getElementById("all-photos");
        var spa = document.getElementById("wedding-photos");
        if (eng.style.display === "none") {
        eng.style.display = "block";
        spa.style.display = "none";
    }
    }

        function changeLanguage2() {
            var eng = document.getElementById("all-photos");
            var spa = document.getElementById("wedding-photos");
            if (spa.style.display === "none") {
                spa.style.display = "block";
                eng.style.display = "none";
            }
        }
</script>

<div class="text-center">
    <div class="btn-group">
        <button data-toggle="#all-photos" type="button" onclick="changeLanguage1()" class="btn btn-primary">All</button>
        <button data-toggle="#wedding-photos" type="button" onclick="changeLanguage2()" class="btn btn-primary">Weddings</button>

    </div>
</div>


how to change to the gallery you want:
make a function for each one to just display that one on the button and make all the rest not display
make the function for that specific on the "onclick" for that particular one


<div id="all-photos">
    <div class="row">
        <div class="column">

            <%
                ArrayList<Integer> idlist = retrieveImage_dao.getIDs(retrieveImage_dao.all_images);
                int each_column = idlist.size()/4 + 1;
                int counter = 0;
                for(int id : idlist){
            %>
            <%
                counter++;
                if(counter == each_column)
                {
                    counter = 0;
            %>
        </div>
        <div class ="column">
            <%
                }
            %>
            <img src="create_image.jsp?id=<%= id%>" width="400px" loading="lazy" class="img-fluid"/>
            <% } %>
        </div>
    </div>
</div>
<div id="wedding-photos" style="display: none">
    <div class="row">
        <div class="column">

            <%
                ArrayList<Integer> idlistW = retrieveImage_dao.getIDs(retrieveImage_dao.wedding_images);
                int each_columnW = idlistW.size()/4 + 1;
                int counterW = 0;
                for(int id : idlistW){
            %>
            <%
                counterW++;
                if(counterW == each_columnW)
                {
                    counterW = 0;
            %>
        </div>
        <div class ="column">
            <%
                }
            %>
            <img src="create_image.jsp?id=<%= id%>" width="400px" loading="lazy" class="img-fluid"/>
            <% } %>
        </div>
    </div>
</div>
</body>



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