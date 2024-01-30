package com.beckson.school.pojo;

import java.text.DateFormat;
import java.util.Date;

public class Student {

    private Integer id ;
    private String sid;
    private String name;
    private String gender;
    private String classroom;
    private Date createDate;
    private Date updateDate;

    public Student() {
    }

    public Student(Integer id, String sid, String name, String gender, String classroom, Date createDate, Date updateDate) {
        this.id = id;
        this.sid = sid;
        this.name = name;
        this.gender = gender;
        this.classroom = classroom;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Student(String sid, String name, String gender, String classroom, Date createDate, Date updateDate) {
        this.sid = sid;
        this.name = name;
        this.gender = gender;
        this.classroom = classroom;
        this.createDate = createDate;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", classroom='" + classroom + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
