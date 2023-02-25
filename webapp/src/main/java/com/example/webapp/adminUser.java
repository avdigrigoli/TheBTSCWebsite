package com.example.webapp;

public class adminUser {
    private int id;
    private String username;
    private String password;

    public adminUser(){

    }

    public adminUser(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public String getUsername() {
        return username;
    }

    public void setUsername(String user_name) {
        this.username = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pword) {
        this.password = pword;
    }
}
