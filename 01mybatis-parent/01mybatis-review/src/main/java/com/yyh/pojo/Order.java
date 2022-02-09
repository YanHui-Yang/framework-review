package com.yyh.pojo;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {

    private Integer id;
    private Integer userId;
    private String number;
    private Date createTime;
    private String note;
    private User user;

    public Order() {
    }

    public Integer getId() {
        return this.id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public String getNumber() {
        return this.number;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public String getNote() {
        return this.note;
    }

    public User getUser() {
        return this.user;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order(id=" + this.getId() + ", userId=" + this.getUserId() + ", number=" + this.getNumber() + ", createTime=" + this.getCreateTime() + ", note=" + this.getNote() + ", user=" + this.getUser() + ")";
    }
}
