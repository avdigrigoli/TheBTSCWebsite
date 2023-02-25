package com.example.webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteBlogPostServlet", value = "/DeleteBlogPostServlet")
public class DeleteBlogPostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sid = request.getParameter("id");


        if(sid != null)
        {
            // Call DAO passing this ID, DAO will delete based on ID
            int id = Integer.parseInt(sid);
            DeleteBlogPostDAO deleteBlog = new DeleteBlogPostDAO();
            deleteBlog.deleteBlog(id);
            System.out.println(id);
        }
        response.sendRedirect("adminBlogOptions.jsp");


    }
}
