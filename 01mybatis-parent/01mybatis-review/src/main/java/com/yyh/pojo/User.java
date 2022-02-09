package com.yyh.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {

    private int id;
    private String username;
    private Date birthday;
    private String sex;
    private String address;
    private List<Order> orderList;

    public User() {
    }

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    public String getSex() {
        return this.sex;
    }

    public String getAddress() {
        return this.address;
    }

    public List<Order> getOrderList() {
        return this.orderList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "User(id=" + this.getId() + ", username=" + this.getUsername() + ", birthday=" + this.getBirthday() + ", sex=" + this.getSex() + ", address=" + this.getAddress() + ", orderList=" + this.getOrderList() + ")";
    }
}
