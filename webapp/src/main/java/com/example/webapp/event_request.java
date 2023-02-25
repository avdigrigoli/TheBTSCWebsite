package com.example.webapp;

public class event_request {
    private int id;
    private String email_address;
    private String first_name;
    private String last_name;
    private String phone_number;
    private String requested_date;

    public event_request(){

    }

    public event_request(String first_name, String last_name, String phone_number, String email, String requested_date) {
        super();
        this.email_address = email;
        this.first_name = first_name;
        this.last_name = last_name;
        this.phone_number = phone_number;
        this.requested_date = requested_date;
    }

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public String getEmail() {
        return email_address;
    }

    public void setEmail(String email) {
        this.email_address = email;
    }

    public String getFname() {
        return first_name;
    }

    public void setFname(String fname) {
        this.first_name = fname;
    }

    public String getLname() {
        return last_name;
    }

    public void setLname(String lname) {
        this.last_name = lname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDate()
    {
        return requested_date;
    }

    public void setDate(String date)
    {
        this.requested_date = date;
    }


}
