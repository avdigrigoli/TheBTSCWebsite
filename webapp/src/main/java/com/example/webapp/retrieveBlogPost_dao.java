package com.example.webapp;
import java.sql.*;
import java.util.ArrayList;

import static com.example.webapp.Utils.getConnection;

public class retrieveBlogPost_dao {

    public static String blog_ids = "select id from thebtsc.blog_posts ";
    private static final String INSERT_BLOG_SQL = "INSERT INTO thebtsc.blog_posts" + " (title, author, url_link, blog_description, photo) VALUES " + " (?, ?, ?, ?, ?);";


    public static ArrayList<Integer> getIDs(){
        ArrayList<Integer> ids = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(blog_ids);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                ids.add(rs.getInt("id"));
            }

        }
        catch (Exception e){
            System.err.println(e.getLocalizedMessage());
        }
        return ids;
    }

    public static String getTitle(int id){
        String title = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select title from thebtsc.blog_posts where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                title = rs.getString("title");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return title;
    }

    public static String getAuthor(int id){
        String author = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select author from thebtsc.blog_posts where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                author = rs.getString("author");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return author;
    }

    public static String getUrl_link(int id){
        String url_link = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select url_link from thebtsc.blog_posts where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                url_link = rs.getString("url_link");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return url_link;
    }

    public static String getBlog_description(int id){
        String blog_description = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select blog_description from thebtsc.blog_posts where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                blog_description = rs.getString("blog_description");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return blog_description;
    }

    public static byte[] getPhoto(int id){
        byte[] byteArray = null;
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select photo from thebtsc.blog_posts where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Blob blob = rs.getBlob("photo");
                byteArray = blob.getBytes(1, (int) blob.length());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return byteArray;
    }


}
