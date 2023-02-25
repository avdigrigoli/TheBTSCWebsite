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

@WebServlet("/retrieve_image")
@MultipartConfig
public class retrieveImage_servlet extends HttpServlet{

    private static final long serialVersionUID = 1L;
    private retrieveImage_dao retrieveIMG_dao;

    public retrieveImage_servlet() {
    }

    public void init() {
        this.retrieveIMG_dao = new retrieveImage_dao();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        insertUser(request, response);
    }

    public void insertUser(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String title = request.getParameter("title");
        String event_name = request.getParameter("event_name");
        String photographer = request.getParameter("photographer");
        String img_description = request.getParameter("img_description");
        Boolean wedding_tag = Boolean.parseBoolean(request.getParameter("wedding_tag"));
        Boolean outdoor_tag = Boolean.parseBoolean(request.getParameter("outdoor_tag"));
        Boolean food_tag = Boolean.parseBoolean(request.getParameter("food_tag"));
        Boolean facilities_tag = Boolean.parseBoolean(request.getParameter("facilities_tag"));

        Part filePart = request.getPart("image");
        String fileName = filePart.getSubmittedFileName();
        for(Part part: request.getParts()){
            part.write(getServletContext().getRealPath("/WEB-INF") + "/temp.jpg");
        }

        try{
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306","root","root");
            PreparedStatement ps = con.prepareStatement("insert into thebtsc.gallery(title,event_name," +
                    "photographer,img_description, wedding_tag, outdoor_tag, food_tag, facilities_tag, image) values(?,?,?,?,?,?,?,?,?)");
            InputStream is = new FileInputStream(new File(getServletContext().getRealPath("/WEB-INF") + "/temp.jpg"));
            ps.setString(1, title);
            ps.setString(2, event_name);
            ps.setString(3, photographer);
            ps.setString(4, img_description);
            ps.setBoolean(5, wedding_tag);
            ps.setBoolean(6, outdoor_tag);
            ps.setBoolean(7, food_tag);
            ps.setBoolean(8, facilities_tag);

            ps.setBlob(9, is);
            ps.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }



        String image = request.getParameter("image");
        //retrieveIMG_dao.addImage(new retrieveImage(title, event_name, photographer, img_description, wedding_tag, outdoor_tag, food_tag, facilities_tag, image));
        response.sendRedirect("adminGalleryOptions.jsp");
    }



}