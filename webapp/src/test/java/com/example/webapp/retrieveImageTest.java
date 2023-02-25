package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class retrieveImageTest {
    private retrieveImage retImg;

    @Test
    void constructorTest(){
        retImg = new retrieveImage("Green Goblin", "Oscorp Board Meeting", "Peter Parker", "The new glider... back to formula",
                false, false, false, false, "gobby.jpg");

        assertEquals("Green Goblin", retImg.getTitle());
        assertEquals("Oscorp Board Meeting", retImg.getEvent_name());
        assertEquals("Peter Parker", retImg.getPhotographer());
        assertEquals("The new glider... back to formula", retImg.getImg_description());
        assertFalse(retImg.getWedding_tag());
        assertFalse(retImg.getOutdoor_tag());
        assertFalse(retImg.getFood_tag());
        assertFalse(retImg.getFacilities_tag());


    }

    @Test
    void getID() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(retImg, 1);

        final int result = retImg.getID();
        assertEquals(1, result, "Field wasn't retrieved properly");

    }

    @Test
    void getTitle() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("title");
        field.setAccessible(true);
        field.set(retImg, "Green Goblin");

        final String result = retImg.getTitle();
        assertEquals("Green Goblin", result, "Field wasn't retrieved properly");

    }

    @Test
    void setTitle() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        retImg.setTitle("Green Goblin");

        final Field field = retImg.getClass().getDeclaredField("title");
        field.setAccessible(true);
        assertEquals("Green Goblin", field.get(retImg), "Fields didn't match");
    }

    @Test
    void getEvent_name() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("event_name");
        field.setAccessible(true);
        field.set(retImg, "Oscorp Board Meeting");

        final String result = retImg.getEvent_name();
        assertEquals("Oscorp Board Meeting", result, "Field wasn't retrieved properly");

    }

    @Test
    void setEvent_name() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        retImg.setEvent_name("Oscorp Board Meeting");

        final Field field = retImg.getClass().getDeclaredField("event_name");
        field.setAccessible(true);
        assertEquals("Oscorp Board Meeting", field.get(retImg), "Fields didn't match");
    }

    @Test
    void getPhotographer() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("photographer");
        field.setAccessible(true);
        field.set(retImg, "Peter Parker");

        final String result = retImg.getPhotographer();
        assertEquals("Peter Parker", result, "Field wasn't retrieved properly");

    }

    @Test
    void setPhotographer() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        retImg.setPhotographer("Peter Parker");

        final Field field = retImg.getClass().getDeclaredField("photographer");
        field.setAccessible(true);
        assertEquals("Peter Parker", field.get(retImg), "Fields didn't match");
    }

    @Test
    void getImg_description() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("img_description");
        field.setAccessible(true);
        field.set(retImg, "The new glider... back to formula");

        final String result = retImg.getImg_description();
        assertEquals("The new glider... back to formula", result, "Field wasn't retrieved properly");

    }

    @Test
    void setImg_description() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        retImg.setImg_description("The new glider... back to formula");

        final Field field = retImg.getClass().getDeclaredField("img_description");
        field.setAccessible(true);
        assertEquals("The new glider... back to formula", field.get(retImg), "Fields didn't match");
    }

    @Test
    void getWedding_tag() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("wedding_tag");
        field.setAccessible(true);
        field.set(retImg, false);

        final boolean result = retImg.getWedding_tag();
        assertFalse(result, "Field wasn't retrieved properly");

    }

    @Test
    void getOutdoor_tag() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("outdoor_tag");
        field.setAccessible(true);
        field.set(retImg, false);

        final boolean result = retImg.getOutdoor_tag();
        assertFalse(result, "Field wasn't retrieved properly");

    }

    @Test
    void getFood_tag() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("food_tag");
        field.setAccessible(true);
        field.set(retImg, false);

        final boolean result = retImg.getFood_tag();
        assertFalse(result, "Field wasn't retrieved properly");

    }

    @Test
    void getFacilities_tag() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("facilities_tag");
        field.setAccessible(true);
        field.set(retImg, false);

        final boolean result = retImg.getFacilities_tag();
        assertFalse(result, "Field wasn't retrieved properly");

    }


    @Test
    void getImage() throws NoSuchFieldException, IllegalAccessException {
        retImg = new retrieveImage();
        final Field field = retImg.getClass().getDeclaredField("image");
        field.setAccessible(true);
        field.set(retImg, "gobby.jpg");

        final String result = retImg.getImage();
        assertEquals("gobby.jpg", result, "Field wasn't retrieved properly");

    }
}


