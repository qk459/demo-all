package com.example.demoall.demo.entity;

import java.util.Date;

public class TCoupon {
    private Integer id;

    private String code;

    private String picUrl;

    private Integer achieveAmount;

    private Integer reduceAmount;

    private Integer stock;

    private String title;

    private String status;

    private Date createTime;

    public TCoupon(Integer id, String code, String picUrl, Integer achieveAmount, Integer reduceAmount, Integer stock, String title, String status, Date createTime) {
        this.id = id;
        this.code = code;
        this.picUrl = picUrl;
        this.achieveAmount = achieveAmount;
        this.reduceAmount = reduceAmount;
        this.stock = stock;
        this.title = title;
        this.status = status;
        this.createTime = createTime;
    }

    public TCoupon() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getAchieveAmount() {
        return achieveAmount;
    }

    public void setAchieveAmount(Integer achieveAmount) {
        this.achieveAmount = achieveAmount;
    }

    public Integer getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(Integer reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}