package com.example.webapp;

import java.sql.PreparedStatement;

import static com.example.webapp.Utils.getConnection;

public class DeleteBlogPostDAO {
    private static final String DELETE_BLOG_SQL = "DELETE FROM thebtsc.blog_posts WHERE id = ?";


    public void deleteBlog(int id)
    {
        try(
                PreparedStatement preparedStatement = getConnection().prepareStatement(DELETE_BLOG_SQL)){
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
