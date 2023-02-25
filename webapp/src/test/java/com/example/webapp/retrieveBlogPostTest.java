package com.example.webapp;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class retrieveBlogPostTest {
    private retrieveBlogPost retBlog;

    @Test
    void constructorTest(){
        retBlog = new retrieveBlogPost("Daily Bugle", "JJJ", "dailybugle.com", "I want Spiderman", "gobby.jpg");
        assertEquals(0, retBlog.getID());
        assertEquals("Daily Bugle", retBlog.getTitle());
        assertEquals("JJJ", retBlog.getAuthor());
        assertEquals("dailybugle.com", retBlog.getUrl_link());
        assertEquals("I want Spiderman", retBlog.getBlog_description());
        assertEquals("gobby.jpg", retBlog.getPhoto());

    }

    @Test
    void getID() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        final Field field = retBlog.getClass().getDeclaredField("id");
        field.setAccessible(true);
        field.set(retBlog, 1);

        final int result = retBlog.getID();
        assertEquals(1, result, "Field wasn't retrieved properly");
    }

    @Test
    void getTitle() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        final Field field = retBlog.getClass().getDeclaredField("title");
        field.setAccessible(true);
        field.set(retBlog, "Daily Bugle");

        final String result = retBlog.getTitle();
        assertEquals("Daily Bugle", result, "Field wasn't retrieved properly");

    }

    @Test
    void setTitle() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        retBlog.setTitle("Daily Bugle");

        final Field field = retBlog.getClass().getDeclaredField("title");
        field.setAccessible(true);
        assertEquals("Daily Bugle", field.get(retBlog), "Fields didn't match");
    }

    @Test
    void getAuthor() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        final Field field = retBlog.getClass().getDeclaredField("author");
        field.setAccessible(true);
        field.set(retBlog, "JJJ");

        final String result = retBlog.getAuthor();
        assertEquals("JJJ", result, "Field wasn't retrieved properly");

    }

    @Test
    void setAuthor() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        retBlog.setAuthor("JJJ");

        final Field field = retBlog.getClass().getDeclaredField("author");
        field.setAccessible(true);
        assertEquals("JJJ", field.get(retBlog), "Fields didn't match");
    }

    @Test
    void getUrl_link() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        final Field field = retBlog.getClass().getDeclaredField("url_link");
        field.setAccessible(true);
        field.set(retBlog, "dailybugle.com");

        final String result = retBlog.getUrl_link();
        assertEquals("dailybugle.com", result, "Field wasn't retrieved properly");

    }

    @Test
    void setUrl_link() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        retBlog.setUrl_link("dailybugle.com");

        final Field field = retBlog.getClass().getDeclaredField("url_link");
        field.setAccessible(true);
        assertEquals("dailybugle.com", field.get(retBlog), "Fields didn't match");
    }

    @Test
    void getBlog_description() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        final Field field = retBlog.getClass().getDeclaredField("blog_description");
        field.setAccessible(true);
        field.set(retBlog, "I want Spiderman");

        final String result = retBlog.getBlog_description();
        assertEquals("I want Spiderman", result, "Field wasn't retrieved properly");

    }

    @Test
    void setBlog_description() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        retBlog.setBlog_description("I want Spiderman");

        final Field field = retBlog.getClass().getDeclaredField("blog_description");
        field.setAccessible(true);
        assertEquals("I want Spiderman", field.get(retBlog), "Fields didn't match");
    }

    @Test
    void getPhoto() throws NoSuchFieldException, IllegalAccessException {
        retBlog = new retrieveBlogPost();
        final Field field = retBlog.getClass().getDeclaredField("photo");
        field.setAccessible(true);
        field.set(retBlog, "gobby.jpg");

        final String result = retBlog.getPhoto();
        assertEquals("gobby.jpg", result, "Field wasn't retrieved properly");

    }
}