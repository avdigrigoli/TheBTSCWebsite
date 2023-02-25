package com.example.webapp;

import java.io.*;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/adminUser_servlet")
public class adminUser_servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public adminUser_servlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Admin Login!");
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        adminUser_dao userDao = new adminUser_dao();

        try {
            adminUser user = userDao.checkLogin(username, password);
            String destPage = "admin_interface.jsp";

            if (user != null) {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                destPage = "admin_interface.jsp";
            } else {
                String message = "Invalid username/password";
                request.setAttribute("message", message);
            }

            RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
            dispatcher.forward(request, response);

        } catch (SQLException | ClassNotFoundException ex) {
            throw new ServletException(ex);
        }
    }
}