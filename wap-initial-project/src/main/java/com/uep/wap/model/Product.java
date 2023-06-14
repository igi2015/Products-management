package com.uep.wap.model;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Id;

public class Product {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name="name")
    String name;
    @Column(name="description")
    private String description;
    @Column(name="price")
    private double price;

    public String getName(){
        return name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public Product(String name, String description, double price){
        this.name = name;
        this.description = description;
        this.price = price;
    }





}
