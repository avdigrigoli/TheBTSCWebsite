package com.example.webapp;

import org.junit.jupiter.api.Test;
import static com.example.webapp.Utils.getConnection;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.util.ArrayList;

class event_request_daoTest {

    @Test
    public void getRequestById(){
        event_request_dao erd = new event_request_dao();

        event_request request = erd.getRequestById(1);
        assertNull(request);

        request = erd.getRequestById(5);
        assertNotNull(request);
        assertEquals("Norman", request.getFname());
        assertEquals("Osborn", request.getLname());
        assertEquals("911", request.getPhone_number());
        assertEquals("obama@usa.gov", request.getEmail());
        assertEquals("03-03-2022", request.getDate());
    }



    @Test
    void insertRequest() {
        event_request_dao erd = new event_request_dao();
        event_request eventRequest = new event_request("Norman", "Osborn", "911", "obama@usa.gov", "03-03-2022");
        Connection con = getConnection();
        try{
            con.setAutoCommit(false);
            erd.insertRequest(eventRequest);
            assertNotNull(eventRequest);

            event_request request = erd.getRequestById(eventRequest.getId());
            assertEquals(eventRequest.getFname(), request.getFname());
            assertEquals(eventRequest.getLname(), request.getLname());
            assertEquals(eventRequest.getPhone_number(), request.getPhone_number());
            assertEquals(eventRequest.getEmail(), request.getEmail());
            assertEquals(eventRequest.getDate(), request.getDate());
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

    @Test
    void getIDs() {
        event_request_dao erd = new event_request_dao();
        ArrayList<Integer> listEvents = erd.getIDs();
        assertNotNull(listEvents);
        assertEquals(16, listEvents.size());
    }

    @Test
    void getFirstName() {
        event_request_dao erd = new event_request_dao();
        String list = erd.getFirstName(5);
        assertNotNull(list);
        assertEquals("Norman", list);
    }

    @Test
    void getLastName() {
        event_request_dao erd = new event_request_dao();
        String list = erd.getLastName(5);
        assertNotNull(list);
        assertEquals("Osborn", list);
    }

    @Test
    void getPhone() {
        event_request_dao erd = new event_request_dao();
        String list = erd.getPhone(5);
        assertNotNull(list);
        assertEquals("911", list);
    }

    @Test
    void getEmail() {
        event_request_dao erd = new event_request_dao();
        String list = erd.getEmail(5);
        assertNotNull(list);
        assertEquals("obama@usa.gov", list);
    }

    @Test
    void getDate() {
        event_request_dao erd = new event_request_dao();
        String list = erd.getDate(5);
        assertNotNull(list);
        assertEquals("03-03-2022", list);
    }

    @Test
    void getApproved() {
        event_request_dao erd = new event_request_dao();
        String list = erd.getApproved(5);
        assertNotNull(list);
        assertEquals("0", list);
    }

}