<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.example.webapp.retrieveImage_dao"%>
<%@ page import="java.util.ArrayList" %>

<style>
    .row {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        align-items: flex-start;
        padding: 0 24px;
    }

    /* Create four equal columns that sits next to each other */
    .column {
        flex: 25%;
        max-width: 25%;
        padding: 0 24px;
    }

    .column img {
        margin-top: 24px;
        vertical-align: middle;
        width: 100%;
        object-fit: contain;
    }

    .btn-group {
        margin: auto;
        display: flex;
        flex-direction: row;
        justify-content: center;
    }

    /* Responsive layout - makes a two column-layout instead of four columns */
    @media screen and (max-width: 800px) {
        .column {
            flex: 50%;
            max-width: 50%;
        }
    }

    /* Responsive layout - makes the two columns stack on top of each other instead of next to each other */
    @media screen and (max-width: 600px) {
        .column {
            flex: 100%;
            max-width: 100%;
        }
    }
</style>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>TheBTSC | Gallery</title>
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

<script>
        function changeAllPictures() {
        var all = document.getElementById("all-photos");
        var wed = document.getElementById("wedding-photos");
        var outdoor = document.getElementById("outdoor-photos");
        var food = document.getElementById("food-photos");
        var facilities = document.getElementById("facilities-photos");

        if (all.style.display === "none") {
        all.style.display = "block";
        wed.style.display = "none";
        outdoor.style.display = "none";
        food.style.display = "none";
        facilities.style.display = "none";
    }
    }

        function changeWeddingPictures() {
        var all = document.getElementById("all-photos");
        var wed = document.getElementById("wedding-photos");
        var outdoor = document.getElementById("outdoor-photos");
        var food = document.getElementById("food-photos");
        var facilities = document.getElementById("facilities-photos");
        if (wed.style.display === "none") {
        wed.style.display = "block";
        all.style.display = "none";
        outdoor.style.display = "none";
        facilities.style.display = "none";

    }
    }

        function changeOutdoorPictures(){
            var outdoor = document.getElementById("outdoor-photos");
            var all = document.getElementById("all-photos");
            var wed = document.getElementById("wedding-photos");
            var food = document.getElementById("food-photos");
            var facilities = document.getElementById("facilities-photos");
            if(outdoor.style.display === "none"){
                outdoor.style.display = "block";
                all.style.display = "none";
                wed.style.display = "none";
                food.style.display = "none";
                facilities.style.display = "none";

            }
        }

        function changeFoodPicture(){
            var food = document.getElementById("food-photos");
            var outdoor = document.getElementById("outdoor-photos");
            var all = document.getElementById("all-photos");
            var wed = document.getElementById("wedding-photos");
            var facilities = document.getElementById("facilities-photos");
            if(food.style.display === "none"){
                food.style.display = "block";
                outdoor.style.display = "none";
                all.style.display = "none";
                wed.style.display = "none";
                facilities.style.display = "none";

            }
        }

        function changeFacilitiesPictures(){
            var facilities = document.getElementById("facilities-photos");
            var food = document.getElementById("food-photos");
            var outdoor = document.getElementById("outdoor-photos");
            var all = document.getElementById("all-photos");
            var wed = document.getElementById("wedding-photos");
            if(facilities.style.display === "none"){
                facilities.style.display = "block";
                outdoor.style.display = "none";
                all.style.display = "none";
                wed.style.display = "none";
                food.style.display = "none";

            }
        }

</script>

<body>

<jsp:include page="navbar.jsp"></jsp:include>

<%--      <jsp:include page="gallery.jsp">
      <jsp:param name="id" value="<%= id%>"/>
  </jsp:include> --%>
<br>

<div class="text-center">
    <div class="btn-group">
        <button data-toggle="#all-photos" type="button" onclick="changeAllPictures()" class="btn btn-primary">All</button>
        <button data-toggle="#wedding-photos" type="button" onclick="changeWeddingPictures()" class="btn btn-primary">Weddings</button>
        <button data-toggle="#outdoor-photos" type="button" onclick="changeOutdoorPictures()" class="btn btn-primary">Outdoor</button>
        <button data-toggle="#food-photos" type="button" onclick="changeFoodPicture()" class="btn btn-primary">Food</button>
        <button data-toggle="#facilities-photos" type="button" onclick="changeFacilitiesPictures()" class="btn btn-primary">Facilities</button>
    </div>
</div>

<div id="gallery">
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

    <div id="outdoor-photos" style="display: none">
        <div class="row">
            <div class="column">

                <%
                    ArrayList<Integer> idlistO = retrieveImage_dao.getIDs(retrieveImage_dao.outdoor_images);
                    int each_columnO = idlistO.size()/4 + 1;
                    int counterO = 0;
                    for(int id : idlistO){
                %>
                <%
                    counterO++;
                    if(counterO == each_columnO)
                    {
                        counterO = 0;
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

    <div id="food-photos" style="display: none">
        <div class="row">
            <div class="column">

                <%
                    ArrayList<Integer> idlistF = retrieveImage_dao.getIDs(retrieveImage_dao.food_images);
                    int each_columnF = idlistF.size()/4 + 1;
                    int counterF = 0;
                    for(int id : idlistF){
                %>
                <%
                    counterF++;
                    if(counterF == each_columnO)
                    {
                        counterF = 0;
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

    <div id="facilities-photos" style="display: none">
        <div class="row">
            <div class="column">

                <%
                    ArrayList<Integer> idlistF1 = retrieveImage_dao.getIDs(retrieveImage_dao.facilities_images);
                    int each_columnF1 = idlistF1.size()/4 + 1;
                    int counterF1 = 0;
                    for(int id : idlistF1){
                %>
                <%
                    counterF1++;
                    if(counterF1 == each_columnO)
                    {
                        counterF1 = 0;
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
</div>

<jsp:include page="footer.jsp"></jsp:include>


<a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

<!-- Vendor JS Files -->
<script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="assets/vendor/glightbox/js/glightbox.min.js"></script>
<script src="assets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
<script src="assets/vendor/swiper/swiper-bundle.min.js"></script>
<script src="assets/vendor/waypoints/noframework.waypoints.js"></script>
<script src="assets/vendor/php-email-form/validate.js"></script>

<!-- Template Main JS File -->
<script src="assets/js/main.js"></script>

</body>

</html>