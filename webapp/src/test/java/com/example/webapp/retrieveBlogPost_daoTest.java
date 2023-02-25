package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class retrieveBlogPost_daoTest {

    @Test
    void getIDs() {
        retrieveBlogPost_dao rid = new retrieveBlogPost_dao();
        ArrayList<Integer> listImages = rid.getIDs();
        assertNotNull(listImages);
        assertEquals(2, listImages.size());
    }

    @Test
    void getTitle() {
        retrieveBlogPost_dao rtitle = new retrieveBlogPost_dao();
        String list = rtitle.getTitle(1);
        assertNotNull(list);
        assertEquals("Blog test 1", list);
    }

    @Test
    void getAuthor() {
        retrieveBlogPost_dao rauthor = new retrieveBlogPost_dao();
        String list = rauthor.getAuthor(1);
        assertNotNull(list);
        assertEquals("Test author", list);
    }

    @Test
    void getUrl_link() {
        retrieveBlogPost_dao rurl = new retrieveBlogPost_dao();
        String list = rurl.getUrl_link(1);
        assertNotNull(list);
        assertEquals("google.com", list);
    }

    @Test
    void getBlog_description() {
        retrieveBlogPost_dao rdesc = new retrieveBlogPost_dao();
        String list = rdesc.getBlog_description(1);
        assertNotNull(list);
        assertEquals("DESCRIPTION test", list);
    }

}