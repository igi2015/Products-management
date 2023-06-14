package com.uep.wap.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class Order {
    //generate id, customerName, status, date, and a list of items, all with the @Column and @Id
     @Id
     @Column(name = "id")
    private long id;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "status")
    private String status;
    @Column(name = "date")
    private String date;
    @Column(name = "items")
    private List<Item> myList = new ArrayList<Item>();

    public Order(String customerName, String status, String date, List<Item> myList) {
        this.customerName = customerName;
        this.status = status;
        this.date = date;
        this.myList = myList;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public List<Item> getItems() {
        return myList;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }




}
