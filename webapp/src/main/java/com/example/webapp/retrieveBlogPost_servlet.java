package com.example.webapp;


import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.*;

@WebServlet("/retrieve_blog_post")
@MultipartConfig
public class retrieveBlogPost_servlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private retrieveBlogPost_dao retrieveBlogPost_dao;

    public retrieveBlogPost_servlet() {
    }

    public void init() {
        this.retrieveBlogPost_dao = new retrieveBlogPost_dao();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        insertUser(request, response);
    }

    public void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String title = request.getParameter("title");
        String author = request.getParameter("author");
        String url_link = request.getParameter("url_link");
        String blog_description = request.getParameter("blog_description");
        Part filePart = request.getPart("photo");
        String fileName = filePart.getSubmittedFileName();
        for(Part part: request.getParts()){
            part.write(getServletContext().getRealPath("/WEB-INF") + "/temp.jpg");
        }

        try{
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306","root","root");
            PreparedStatement ps = con.prepareStatement("insert into thebtsc.blog_posts(title,author," +
                    "url_link,blog_description, photo) values(?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(getServletContext().getRealPath("/WEB-INF") + "/temp.jpg"));
            ps.setString(1, title);
            ps.setString(2, author);
            ps.setString(3, url_link);
            ps.setString(4, blog_description);
            ps.setBlob(5, is);
            ps.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }



        String image = request.getParameter("photo");
        response.sendRedirect("adminBlogOptions.jsp");
    }



}