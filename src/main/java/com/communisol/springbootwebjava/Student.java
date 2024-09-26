package com.communisol.springbootwebjava;

public class Student {

    String sName;
    int sMarks;

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsMarks() {
        return sMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + sName + '\'' +
                ", marks=" + sMarks +
                '}';
    }

    public void setsMarks(int sMarks) {
        this.sMarks = sMarks;
    }



}
