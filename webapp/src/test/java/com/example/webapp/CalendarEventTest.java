package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class CalendarEventTest {
    private CalendarEvent calEvent;

    @Test
    void constructorTest(){
        calEvent = new CalendarEvent("Norman Osborne", "Back to formula?", "8/15/2001", "event", "blue");
        assertEquals(0, calEvent.getID());
        assertEquals("Norman Osborne", calEvent.getName());
        assertEquals("Back to formula?", calEvent.getDescription());
        assertEquals("8/15/2001", calEvent.getDate());
        assertEquals("event", calEvent.getType());
        assertEquals("blue", calEvent.getColor());

    }

    @Test
    void getID() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        final Field field = calEvent.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(calEvent, 1);

        final int result = calEvent.getID();
        assertEquals(1, result, "Field wasn't retrieved properly");
    }

    @Test
    void getName() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        final Field field = calEvent.getClass().getDeclaredField("name");
        field.setAccessible(true);
        field.set(calEvent, "Norman Osborne");

        final String result = calEvent.getName();
        assertEquals("Norman Osborne", result, "Field wasn't retrieved properly");

    }

    @Test
    void setName() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        calEvent.setName("Norman Osborne");

        final Field field = calEvent.getClass().getDeclaredField("name");
        field.setAccessible(true);
        assertEquals("Norman Osborne", field.get(calEvent), "Fields didn't match");
    }

    @Test
    void getDescription() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        final Field field = calEvent.getClass().getDeclaredField("description");
        field.setAccessible(true);
        field.set(calEvent, "Back to formula?");

        final String result = calEvent.getDescription();
        assertEquals("Back to formula?", result, "Field wasn't retrieved properly");

    }

    @Test
    void setDescription() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        calEvent.setDescription("Back to formula?");

        final Field field = calEvent.getClass().getDeclaredField("description");
        field.setAccessible(true);
        assertEquals("Back to formula?", field.get(calEvent), "Fields didn't match");
    }

    @Test
    void getDate() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        final Field field = calEvent.getClass().getDeclaredField("date");
        field.setAccessible(true);
        field.set(calEvent, "8/15/2001");

        final String result = calEvent.getDate();
        assertEquals("8/15/2001", result, "Field wasn't retrieved properly");

    }

    @Test
    void setDate() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        calEvent.setDate("9/15/2001");

        final Field field = calEvent.getClass().getDeclaredField("date");
        field.setAccessible(true);
        assertEquals("9/15/2001", field.get(calEvent), "Fields didn't match");
    }

    @Test
    void getType() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        final Field field = calEvent.getClass().getDeclaredField("type");
        field.setAccessible(true);
        field.set(calEvent, "event");

        final String result = calEvent.getType();
        assertEquals("event", result, "Field wasn't retrieved properly");

    }

    @Test
    void setType() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        calEvent.setType("event");

        final Field field = calEvent.getClass().getDeclaredField("type");
        field.setAccessible(true);
        assertEquals("event", field.get(calEvent), "Fields didn't match");
    }

    @Test
    void getColor() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        final Field field = calEvent.getClass().getDeclaredField("color");
        field.setAccessible(true);
        field.set(calEvent, "blue");

        final String result = calEvent.getColor();
        assertEquals("blue", result, "Field wasn't retrieved properly");

    }

    @Test
    void setColor() throws NoSuchFieldException, IllegalAccessException {
        calEvent = new CalendarEvent();
        calEvent.setColor("blue");

        final Field field = calEvent.getClass().getDeclaredField("color");
        field.setAccessible(true);
        assertEquals("blue", field.get(calEvent), "Fields didn't match");
    }
}