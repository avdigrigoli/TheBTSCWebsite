/* package com.example.webapp;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.sql.Connection;

import static com.example.webapp.Utils.getConnection;
import static org.junit.jupiter.api.Assertions.*;

class DeleteBlogPostDAOTest extends Mockito {

    @Test
    void deleteBlog() {
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

 */