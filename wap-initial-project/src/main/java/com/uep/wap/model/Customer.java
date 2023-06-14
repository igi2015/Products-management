package com.uep.wap.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Customer {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;

}
