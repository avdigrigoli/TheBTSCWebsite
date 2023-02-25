package com.example.webapp;

import java.sql.*;
import static com.example.webapp.Utils.*;

public class adminUser_dao {


        public adminUser checkLogin(String username, String password) throws SQLException,
                ClassNotFoundException {
            Connection con = Utils.getConnection();
            String sql = "SELECT * FROM thebtsc.user WHERE username = ? and password = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet result = statement.executeQuery();

            adminUser user = null;

            if (result.next()) {
                user = new adminUser();
                user.setUsername(result.getString("username"));
                user.setPassword(password);
            }

            con.close();

            return user;
        }
    }

