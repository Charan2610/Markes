package com.Marks.Models;

public class test {

    private int id;
    private String username;
    private String father_Name;

    public test(int id, String username, String father_Name) {
        this.id = id;
        this.username = username;
        this.father_Name = father_Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFather_Name() {
        return father_Name;
    }

    public void setFather_Name(String father_Name) {
        this.father_Name = father_Name;
    }
}
