package com.example.webapp;
import java.sql.*;
import java.util.ArrayList;

import static com.example.webapp.Utils.getConnection;

public class event_request_dao {

    private static final String INSERT_REQUEST_SQL = "INSERT INTO thebtsc.event_request" + " (requested_date, first_name, last_name, email_address, phone_number) VALUES " + " (?, ?, ?, ?, ?);";

    public event_request getRequestById(int key){
        event_request request = null;
        String sql = "SELECT * FROM thebtsc.event_request WHERE id=?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, key);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                request = new event_request();
                request.setId(rs.getInt("id"));
                request.setFname(rs.getString("first_name"));
                request.setLname(rs.getString("last_name"));
                request.setPhone_number(rs.getString("phone_number"));
                request.setEmail(rs.getString("email_address"));
                request.setDate(rs.getString("requested_date"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return request;
    }

    public static String event_ids = "select id from thebtsc.event_request ";

    public static ArrayList<Integer> getIDs(){
        ArrayList<Integer> ids = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(event_ids);
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

    public static String getFirstName(int id){
        String fname = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select first_name from thebtsc.event_request where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                fname = rs.getString("first_name");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fname;
    }

    public static String getLastName(int id){
        String lname = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select last_name from thebtsc.event_request where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                lname = rs.getString("last_name");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return lname;
    }

    public static String getPhone(int id){
        String pnumber = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select phone_number from thebtsc.event_request where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pnumber = rs.getString("phone_number");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return pnumber;
    }

    public static String getEmail(int id){
        String email = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select email_address from thebtsc.event_request where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                email = rs.getString("email_address");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return email;
    }

    public static String getDate(int id){
        String date = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select requested_date from thebtsc.event_request where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                date = rs.getString("requested_date");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return date;
    }

    public static String getApproved(int id){
        String approve = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select approved from thebtsc.event_request where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                approve = rs.getString("approved");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return approve;
    }

    public void insertRequest(event_request request){
        try(
            PreparedStatement preparedStatement = getConnection().prepareStatement(INSERT_REQUEST_SQL)){
            preparedStatement.setString(1, request.getDate());
            preparedStatement.setString(2, request.getFname());
            preparedStatement.setString(3, request.getLname());
            preparedStatement.setString(4, request.getEmail());
            preparedStatement.setString(5, request.getPhone_number());
            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()){
                request.setId(generatedKeys.getInt(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
