package com.lagou.domain;

import java.io.Serializable;

public class student implements Serializable {

    private int id;
    private String username;

    public student() {
    }

    public student(int id, String username) {
        this.id = id;
        this.username = username;
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

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
