package com.uep.wap.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name="customerName")
    private String customerName;
    @Column(name="total")
    private double total;
    @Column(name="date")
    private String date;
    @Column(name="items")
    private List<Item> myList= new ArrayList<Item>();
}
