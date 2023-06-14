package com.uep.wap.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Category {
    @Id
    @Column(name = "id")
    private long id;
    @Column(name="name")
    private String name;

}
