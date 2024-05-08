package com.example.myapplication;

public class User {
    private int userid;
    private int id;
    private String title;
    private String body;

    public int getUserid() {
        return userid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
