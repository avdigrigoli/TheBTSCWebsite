package com.example.webapp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "DeleteImageServlet", value = "/DeleteImageServlet")
public class DeleteImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String sid = request.getParameter("id");


        if(sid != null)
        {
            // Call DAO passing this ID, DAO will delete based on ID
            int id = Integer.parseInt(sid);
            DeleteImageDAO deleteImage = new DeleteImageDAO();
            deleteImage.deleteImage(id);
            System.out.println(id);
        }
        response.sendRedirect("adminGalleryOptions.jsp");

    }
}
