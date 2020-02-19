package com.example.demoall.demo.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String phone;

    private Date createTime;

    private Integer age;

    public User(Integer userId, String userName, String phone, Date createTime, Integer age) {
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.createTime = createTime;
        this.age = age;
    }

    public User() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}