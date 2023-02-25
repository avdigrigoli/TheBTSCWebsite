package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class retrieveImage_daoTest {

    @Test
    void getIDs() {
        retrieveImage_dao rid = new retrieveImage_dao();
        ArrayList<Integer> listImages = rid.getIDs(retrieveImage_dao.all_images);
        assertNotNull(listImages);
        assertEquals(38, listImages.size());
    }

    @Test
    void getImage() {
    }

    @Test
    void getImageById() {

    }



    @Test
    void addImage() {

    }
}