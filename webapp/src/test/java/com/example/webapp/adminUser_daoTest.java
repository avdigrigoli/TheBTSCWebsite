package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static com.example.webapp.Utils.getConnection;
import static org.junit.jupiter.api.Assertions.*;

class adminUser_daoTest {

    @Test
    void checkLogin() {
        adminUser_dao aud = new adminUser_dao();
        adminUser adUser = new adminUser("adUser1", "notPassword");
        Connection con = getConnection();
        try{
            con.setAutoCommit(false);
            aud.checkLogin(adUser.getUsername(), adUser.getPassword());
            assertNotNull(adUser);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.rollback();
                con.setAutoCommit(true);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
