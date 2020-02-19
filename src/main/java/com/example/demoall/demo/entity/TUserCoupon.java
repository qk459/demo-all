package com.example.demoall.demo.entity;

import java.util.Date;

public class TUserCoupon {
    private Integer id;

    private String userCouponCode;

    private String picUrl;

    private Integer userId;

    private Integer status;

    private Integer orderId;

    private Date createTime;

    public TUserCoupon(Integer id, String userCouponCode, String picUrl, Integer userId, Integer status, Integer orderId, Date createTime) {
        this.id = id;
        this.userCouponCode = userCouponCode;
        this.picUrl = picUrl;
        this.userId = userId;
        this.status = status;
        this.orderId = orderId;
        this.createTime = createTime;
    }

    public TUserCoupon() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserCouponCode() {
        return userCouponCode;
    }

    public void setUserCouponCode(String userCouponCode) {
        this.userCouponCode = userCouponCode == null ? null : userCouponCode.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}