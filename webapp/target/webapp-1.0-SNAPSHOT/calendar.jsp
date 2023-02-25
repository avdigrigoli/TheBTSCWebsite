<%@ page import="java.util.ArrayList" %>
<%@ page import="com.example.webapp.CalendarEventDAO" %>
<%@ page import="com.example.webapp.CalendarEvent" %>
<html>
<head>
    <title>My Evo Calendar</title>
    <link rel="stylesheet" type="text/css" href="evo-calendar/css/evo-calendar.css"/>
    <link rel="stylesheet" type="text/css" href="evo-calendar/css/evo-calendar.midnight-blue.css"/>
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro&amp;display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Pacifico&amp;display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Fira+Mono&amp;display=swap" rel="stylesheet">
</head>
<body>

<div id="calendar"></div>

<script src="evo-calendar/js/evo-calendar.js"></script>
<!-- Add jQuery library (required) -->
<script src="https://cdn.jsdelivr.net/npm/jquery@3.4.1/dist/jquery.min.js"></script>

<!-- Add the evo-calendar.js for.. obviously, functionality! -->
<script src="https://cdn.jsdelivr.net/npm/evo-calendar@1.1.2/evo-calendar/js/evo-calendar.min.js"></script>


<script>
    $("#calendar").evoCalendar({
        //THIS IS WHERE THEY ARE BEING STORED
        calendarEvents: [
            {
                id: 'bHay68s', // Event's ID (required)
                name: "New Year", // Event name (required)
                date: "January/1/2020", // Event date (required)
                type: "holiday", // Event type (required)
                everyYear: true // Same event every year (optional)
            },
            {
                name: "Vacation Leave",
                badge: "02/13 - 02/15", // Event badge (optional)
                date: ["February/13/2020", "February/15/2020"], // Date range
                description: "Vacation leave for 3 days.", // Event description (optional)
                type: "event",
                color: "#63d867" // Event custom color (optional)
            }
        ],
        theme:'Midnight Blue',
        sidebarDisplayDefault: false
    })
</script>
<script>
    //THIS IS WHERE THE LOOP WOULD GO
    <%
        ArrayList<Integer> idlist = CalendarEventDAO.getIDs();
        for(int id : idlist){
            String name = CalendarEventDAO.getName(id);
            String description = CalendarEventDAO.getDescription(id);
            String date = CalendarEventDAO.getDate(id);
            String type = CalendarEventDAO.getType(id);
            String color = CalendarEventDAO.getColor(id);


        %>

    $("#calendar").evoCalendar('addCalendarEvent', [
        {
            id: "<%=id%>",
            name: "<%=name%>",
            date: "<%=date%>",
            type: "<%=type%>",
            description: "<%=description%>",
            color: "<%=color%>"
        }
    ]);
    <%
    }
    %>
</script>

</body>
</html>