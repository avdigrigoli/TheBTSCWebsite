package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class event_requestTest {

    private event_request event;

    @Test
    void constructorTest(){
        event = new event_request("Norman", "Osborn", "911", "obama@usa.gov", "03-03-2022");
        assertEquals("Norman", event.getFname());
        assertEquals("Osborn", event.getLname());
        assertEquals("911", event.getPhone_number());
        assertEquals("obama@usa.gov", event.getEmail());
        assertEquals("03-03-2022", event.getDate());
    }

    @Test
    void getEmail() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        final Field field = event.getClass().getDeclaredField("email_address");
        field.setAccessible(true);
        field.set(event, "obama@usa.gov");

        final String result = event.getEmail();
        assertEquals("obama@usa.gov", result, "Field wasn't retrieved properly");

    }

    @Test
    void setEmail() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        event.setEmail("obama@usa.gov");

        final Field field = event.getClass().getDeclaredField("email_address");
        field.setAccessible(true);
        assertEquals("obama@usa.gov", field.get(event), "Fields didn't match");
    }

    @Test
    void getFname() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        final Field field = event.getClass().getDeclaredField("first_name");
        field.setAccessible(true);
        field.set(event, "Norman");

        final String result = event.getFname();
        assertEquals("Norman", result, "Field wasn't retrieved properly");

    }

    @Test
    void setFname() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        event.setFname("Norman");

        final Field field = event.getClass().getDeclaredField("first_name");
        field.setAccessible(true);
        assertEquals("Norman", field.get(event), "Fields didn't match");
    }

    @Test
    void getLname() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        final Field field = event.getClass().getDeclaredField("last_name");
        field.setAccessible(true);
        field.set(event, "Osborn");

        final String result = event.getLname();
        assertEquals("Osborn", result, "Field wasn't retrieved properly");

    }

    @Test
    void setLname() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        event.setLname("Osborn");

        final Field field = event.getClass().getDeclaredField("last_name");
        field.setAccessible(true);
        assertEquals("Osborn", field.get(event), "Fields didn't match");
    }

    @Test
    void getPhone_number() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        final Field field = event.getClass().getDeclaredField("phone_number");
        field.setAccessible(true);
        field.set(event, "911");

        final String result = event.getPhone_number();
        assertEquals("911", result, "Field wasn't retrieved properly");

    }

    @Test
    void setPhone_number() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        event.setPhone_number("911");

        final Field field = event.getClass().getDeclaredField("phone_number");
        field.setAccessible(true);
        assertEquals("911", field.get(event), "Fields didn't match");
    }

    @Test
    void getDate() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        final Field field = event.getClass().getDeclaredField("requested_date");
        field.setAccessible(true);
        field.set(event, "03-03-2022");

        final String result = event.getDate();
        assertEquals("03-03-2022", result, "Field wasn't retrieved properly");

    }

    @Test
    void setDate() throws NoSuchFieldException, IllegalAccessException {
        event = new event_request();
        event.setDate("03-03-2022");

        final Field field = event.getClass().getDeclaredField("requested_date");
        field.setAccessible(true);
        assertEquals("03-03-2022", field.get(event), "Fields didn't match");
    }
}