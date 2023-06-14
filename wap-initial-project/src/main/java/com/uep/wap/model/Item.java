package com.uep.wap.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Item {
    // generated automatically with the @Collumn and other things like in Warehouse and Product
    @Id
    @Column(name = "id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="quantity")
    private Integer quantity;
    @Column(name="price")
    private double price;

    public Item(String name, Integer quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public void setPrice(double price){
        this.price = price;
    }


}



