package com.example.webapp;
import java.sql.*;
import java.util.ArrayList;

import static com.example.webapp.Utils.getConnection;

public class retrieveImage_dao {

    public static String all_images = "select id from thebtsc.gallery ";
    public static String wedding_images = "select id from thebtsc.gallery where wedding_tag = true";
    public static String outdoor_images = "select id from thebtsc.gallery where outdoor_tag = true";
    public static String food_images = "select id from thebtsc.gallery where food_tag = true";
    public static String facilities_images = "select id from thebtsc.gallery where facilities_tag = true";

    private static final String INSERT_IMAGE_SQL = "INSERT INTO thebtsc.gallery" + " (title, event_name, photographer, img_description, wedding_tag, outdoor_tag, food_tag, facilities_tag, image) VALUES " + " (?, ?, ?, ?, ?, ?, ?, ?, ?);";

    public retrieveImage getImageById(int key){
        retrieveImage retImg = null;
        String sql = "SELECT * FROM thebtsc.gallery WHERE id=?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, key);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                retImg = new retrieveImage();
                retImg.setId(rs.getInt("id"));
                retImg.setTitle(rs.getString("title"));
                retImg.setEvent_name(rs.getString("event_name"));
                retImg.setPhotographer(rs.getString("photographer"));
                retImg.setImg_description(rs.getString("img_description"));
                retImg.setWedding_tag(rs.getBoolean("wedding_tag"));
                retImg.setOutdoor_tag(rs.getBoolean("outdoor_tag"));
                retImg.setFood_tag(rs.getBoolean("food_tag"));
                retImg.setFacilities_tag(rs.getBoolean("facilities_tag"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return retImg;
    }



    public static ArrayList<Integer> getIDs(String select_statement){
        ArrayList<Integer> ids = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(select_statement);
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

      public static byte[] getImage(int id){
        byte[] byteArray = null;
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select image from thebtsc.gallery where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Blob blob = rs.getBlob("image");
                byteArray = blob.getBytes(1, (int) blob.length());
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return byteArray;
    }


    public static void addImage(retrieveImage retIMG)
    {
        try(
                PreparedStatement preparedStatement = getConnection().prepareStatement(INSERT_IMAGE_SQL)){
            preparedStatement.setString(1, retIMG.getTitle());
            preparedStatement.setString(2, retIMG.getEvent_name());
            preparedStatement.setString(3, retIMG.getPhotographer());
            preparedStatement.setString(4, retIMG.getImg_description());
            preparedStatement.setBoolean(5, retIMG.getWedding_tag());
            preparedStatement.setBoolean(6, retIMG.getOutdoor_tag());
            preparedStatement.setBoolean(7, retIMG.getFood_tag());
            preparedStatement.setBoolean(8, retIMG.getFacilities_tag());
            preparedStatement.setString(9, retIMG.getImage());
            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()){
                retIMG.setId(generatedKeys.getInt(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}


