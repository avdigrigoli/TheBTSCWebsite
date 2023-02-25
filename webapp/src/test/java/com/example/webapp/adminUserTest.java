package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class adminUserTest {
    private adminUser adminUsr;
    @Test
    void constructorTest() {
        adminUsr = new adminUser("adUser1", "notPassword");

        assertEquals("adUser1", adminUsr.getUsername());
        assertEquals("notPassword", adminUsr.getPassword());

    }
    @Test
    void getId() throws NoSuchFieldException, IllegalAccessException{
        adminUsr = new adminUser();
        final Field field = adminUsr.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(adminUsr, 1);

        final int result = adminUsr.getId();
        assertEquals(1, result, "Field wasn't retrieved properly");

    }

    @Test
    void getUsername() throws NoSuchFieldException, IllegalAccessException {
        adminUsr= new adminUser();
        final Field field =adminUsr.getClass().getDeclaredField("username");
        field.setAccessible(true);
        field.set(adminUsr, "adUser1");

        final String result =adminUsr.getUsername();
        assertEquals("adUser1", result, "Field wasn't retrieved properly");

    }

    @Test
    void setUsername() throws NoSuchFieldException, IllegalAccessException {
        adminUsr = new adminUser();
        adminUsr.setUsername("adUser1");

        final Field field = adminUsr.getClass().getDeclaredField("username");
        field.setAccessible(true);
        assertEquals("adUser1", field.get(adminUsr), "Fields didn't match");
    }

    @Test
    void getPassword() throws NoSuchFieldException, IllegalAccessException {
        adminUsr= new adminUser();
        final Field field =adminUsr.getClass().getDeclaredField("password");
        field.setAccessible(true);
        field.set(adminUsr, "notPassword");

        final String result =adminUsr.getPassword();
        assertEquals("notPassword", result, "Field wasn't retrieved properly");

    }

    @Test
    void setPassword() throws NoSuchFieldException, IllegalAccessException {
        adminUsr = new adminUser();
        adminUsr.setPassword("notPassword");

        final Field field = adminUsr.getClass().getDeclaredField("password");
        field.setAccessible(true);
        assertEquals("notPassword", field.get(adminUsr), "Fields didn't match");
    }
}