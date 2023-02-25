package com.example.webapp;
import java.sql.*;
import java.util.ArrayList;
import static com.example.webapp.Utils.getConnection;

public class CalendarEventDAO {
    public static String calendar_event_ids = "select id from thebtsc.calendar ";

    private static final String INSERT_CALENDAR_EVENT_SQL = "INSERT INTO thebtsc.calendar" + " (name, description, date, type, color) VALUES " + " (?, ?, ?, ?, ?);";

    public CalendarEvent getEventById(int key){
        CalendarEvent calEvent = null;
        String sql = "SELECT * FROM thebtsc.calendar WHERE id=?";
        try {
            PreparedStatement ps = getConnection().prepareStatement(sql);
            ps.setInt(1, key);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                calEvent = new CalendarEvent();
                calEvent.setId(rs.getInt("id"));
                calEvent.setName(rs.getString("name"));
                calEvent.setDescription(rs.getString("description"));
                calEvent.setDate(rs.getString("date"));
                calEvent.setType(rs.getString("type"));
                calEvent.setColor(rs.getString("color"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return calEvent;
    }



    public static ArrayList<Integer> getIDs(){
        ArrayList<Integer> ids = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement ps = connection.prepareStatement(calendar_event_ids);
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

    public static String getName(int id){
        String name = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select name from thebtsc.calendar where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                name = rs.getString("name");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return name;
    }

    public static String getDescription(int id){
        String description = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select description from thebtsc.calendar where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                description = rs.getString("description");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return description;
    }

    public static String getDate(int id){
        String date = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select date from thebtsc.calendar where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                date = rs.getString("date");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return date;
    }

    public static String getType(int id){
        String type = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select type from thebtsc.calendar where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                type = rs.getString("type");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return type;
    }

    public static String getColor(int id){
        String color = "failed";
        try {
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select color from thebtsc.calendar where id = " + id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                color = rs.getString("color");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return color;
    }


    public static void addCalendarEvent(CalendarEvent calEvent)
    {
        try(
                PreparedStatement preparedStatement = getConnection().prepareStatement(INSERT_CALENDAR_EVENT_SQL)){
            preparedStatement.setString(1, calEvent.getName());
            preparedStatement.setString(2, calEvent.getDescription());
            preparedStatement.setString(3, calEvent.getDate());
            preparedStatement.setString(4, calEvent.getType());
            preparedStatement.setString(5, calEvent.getColor());
            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()){
                calEvent.setId(generatedKeys.getInt(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }



}


