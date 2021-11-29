package com.mybatis.pojo;


public class User {
    private int sno;
    private String sname;
    private int classno;

    public User() {
    }

    public User(int sno, String sname, int classno) {
        this.sno = sno;
        this.sname = sname;
        this.classno = classno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getClassno() {
        return classno;
    }

    public void setClassno(int classno) {
        this.classno = classno;
    }

    @Override
    public String toString() {
        return "User{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", classno=" + classno +
                '}';
    }
}
