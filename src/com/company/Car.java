package com.company;

import java.io.Serializable;

public class Car implements Serializable{


    private static final long serialVersionUID = -3112919685900082757L;
    private String name;
    private String price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
