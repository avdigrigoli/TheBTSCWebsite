package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.util.ArrayList;

import static com.example.webapp.Utils.getConnection;
import static org.junit.jupiter.api.Assertions.*;

class CalendarEventDAOTest {

    @Test
    void getEventById() {
        CalendarEventDAO ced = new CalendarEventDAO();

        CalendarEvent event = ced.getEventById(1);
        assertNotNull(event);

        event = ced.getEventById(2);
        assertNotNull(event);
        assertEquals("Wedding", event.getName());
        assertEquals("This is a test wedding", event.getDescription());
        assertEquals("May/9/2022", event.getDate());
        assertEquals("event", event.getType());
        assertEquals("ORANGE", event.getColor());
    }

    @Test
    void getIDs() {
        CalendarEventDAO cid = new CalendarEventDAO();
        ArrayList<Integer> listEvents = cid.getIDs();
        assertNotNull(listEvents);
        assertEquals(2, listEvents.size());
    }

    @Test
    void getName() {
        CalendarEventDAO calName = new CalendarEventDAO();
        String list = calName.getName(1);
        assertNotNull(list);
        assertEquals("test event", list);
    }

    @Test
    void getDescription() {
        CalendarEventDAO calName = new CalendarEventDAO();
        String list = calName.getDescription(1);
        assertNotNull(list);
        assertEquals("this event is a test event", list);
    }


    @Test
    void getDate() {
        CalendarEventDAO calName = new CalendarEventDAO();
        String list = calName.getDate(1);
        assertNotNull(list);
        assertEquals("May/1/2022", list);
    }

    @Test
    void getType() {
        CalendarEventDAO calName = new CalendarEventDAO();
        String list = calName.getType(1);
        assertNotNull(list);
        assertEquals("event", list);
    }

    @Test
    void getColor() {
        CalendarEventDAO calName = new CalendarEventDAO();
        String list = calName.getColor(1);
        assertNotNull(list);
        assertEquals("ORANGE", list);
    }

    @Test
    void addCalendarEvent() {
        CalendarEventDAO ced = new CalendarEventDAO();
        CalendarEvent calendarEvent = new CalendarEvent("Wedding", "This is a test wedding", "May/9/2022", "event", "ORANGE");
        Connection con = getConnection();
        try {
            con.setAutoCommit(false);
            ced.addCalendarEvent(calendarEvent);
            assertNotNull(calendarEvent);

            CalendarEvent event = ced.getEventById(calendarEvent.getID());
            assertEquals(calendarEvent.getName(), event.getName());
            assertEquals(calendarEvent.getDescription(), event.getDescription());
            assertEquals(calendarEvent.getDate(), event.getDate());
            assertEquals(calendarEvent.getType(), event.getType());
            assertEquals(calendarEvent.getColor(), event.getColor());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.rollback();
                con.setAutoCommit(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

