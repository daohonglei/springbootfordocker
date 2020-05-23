package com.springbootfordocker.model;

import java.util.Date;

public class UserEntity {
    private int id;
    private String pwd;
    private String name;
    private int age;
    private Date createTime;

    public UserEntity() {
    }

    public UserEntity(int id, String pwd, String name, int age, Date createTime) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.age = age;
        this.createTime = createTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
