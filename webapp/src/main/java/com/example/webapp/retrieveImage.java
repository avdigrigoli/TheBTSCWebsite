package com.example.webapp;
import com.example.webapp.Utils;

import java.io.File;

public class retrieveImage
{
    private int id;
    private String title;
    private String event_name;
    private String photographer;
    private String img_description;
    private boolean wedding_tag;
    private boolean outdoor_tag;
    private boolean food_tag;
    private boolean facilities_tag;
    private String image;

    public retrieveImage(){

    }

    public retrieveImage(String title, String event_name, String photographer, String img_description,
                         boolean wedding_tag, boolean outdoor_tag, boolean food_tag, boolean facilities_tag, String image) {
        super();
        this.title = title;
        this.event_name = event_name;
        this.photographer = photographer;
        this.img_description = img_description;
        this.wedding_tag = wedding_tag;
        this.outdoor_tag = outdoor_tag;
        this.food_tag = food_tag;
        this.facilities_tag = facilities_tag;
        this.image = image;
    }


    public int getID() {
        return id;
    }
    public void setId(int id){this.id = id;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getImg_description()
    {
        return img_description;
    }

    public void setImg_description(String img_description)
    {
        this.img_description = img_description;
    }

    public boolean getWedding_tag() {return wedding_tag;}

    public void setWedding_tag(boolean wedding_tag) {this.wedding_tag = wedding_tag;}

    public boolean getOutdoor_tag() {return outdoor_tag;}

    public  void setOutdoor_tag(boolean outdoor_tag) {this.outdoor_tag = outdoor_tag;}

    public boolean getFood_tag() {return food_tag;}

    public void setFood_tag(boolean food_tag) {this.food_tag = food_tag;}

    public boolean getFacilities_tag() {return facilities_tag;}

    public void setFacilities_tag(boolean facilities_tag) {this.facilities_tag =facilities_tag;}

    public String getImage() {return image;}

    public void setImage(String image){this.image = image;}



}
