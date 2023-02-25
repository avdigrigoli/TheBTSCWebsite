package com.example.webapp;
import com.example.webapp.Utils;

public class retrieveBlogPost
{
    private int id;
    private String title;
    private String author;
    private String url_link;
    private String blog_description;
    private String photo;

    public retrieveBlogPost(){

    }

    public retrieveBlogPost(String title, String author, String url_link, String blog_description, String photo) {
        super();
        this.title = title;
        this.author = author;
        this.url_link = url_link;
        this.blog_description = blog_description;
        this.photo = photo;
    }


    public int getID() {
        return id;
    }

    public void setID(int id){this.id = id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUrl_link() {
        return url_link;
    }

    public void setUrl_link(String url_link) {
        this.url_link = url_link;
    }

    public String getBlog_description()
    {
        return blog_description;
    }

    public void setBlog_description(String blog_description)
    {
        this.blog_description = blog_description;
    }

    public String getPhoto() {return photo;}



}
