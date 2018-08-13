package com.example.list2;

public class Data {
    private String major;
    private String Prof;

    public Data(String major, String prof) {
        this.major = major;
        Prof = prof;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getProf() {
        return Prof;
    }

    public void setProf(String prof) {
        Prof = prof;
    }
}