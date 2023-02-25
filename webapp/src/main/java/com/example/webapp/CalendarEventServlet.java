package com.example.webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalendarEventServlet", value = "/CalendarEventServlet")
public class CalendarEventServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        insertCalendarEvent(request, response);
    }

    public void insertCalendarEvent(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String date = request.getParameter("date");
        String type = request.getParameter("type");
        String color = request.getParameter("color");
        CalendarEventDAO.addCalendarEvent(new CalendarEvent(name, description, date, type, color));
        response.sendRedirect("admin_interface.jsp");
    }
}
