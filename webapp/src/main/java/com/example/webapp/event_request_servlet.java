package com.example.webapp;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/event_request_form")
public class event_request_servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private event_request_dao request_dao;

    public event_request_servlet() {
    }

    public void init() {
        this.request_dao = new event_request_dao();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //Need to implement some sort of data structure
        insertUser(request, response);
    }

    public void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String phone_number = request.getParameter("phone_number");
        String email = request.getParameter("email_address");
        String requested_date = request.getParameter("requested_date");
        request_dao.insertRequest(new event_request(first_name, last_name, phone_number, email, requested_date));
        response.sendRedirect("events.jsp");
    }

}
