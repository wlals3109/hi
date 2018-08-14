package com.example.list2;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data = (Data) o;
        return Objects.equals(major, data.major) &&
                Objects.equals(Prof, data.Prof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(major, Prof);
    }

    @Override
    public String toString() {
        return "Data{" +
                "major='" + major + '\'' +
                ", Prof='" + Prof + '\'' +
                '}';
    }
}