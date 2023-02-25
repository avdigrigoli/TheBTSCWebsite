package com.example.webapp;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.example.webapp.Utils.getConnection;

public class DeleteImageDAO {

    private static final String DELETE_IMAGE_SQL = "DELETE FROM thebtsc.gallery WHERE id = ?";


    public void deleteImage(int id)
    {
        try(
                PreparedStatement preparedStatement = getConnection().prepareStatement(DELETE_IMAGE_SQL)){
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


