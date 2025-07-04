package com.learning.springtutorial;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private int lid;
    private String brand;

    // getters and setters
    public int getLid() {
        return lid;
    }

    public String getBrand() {
        return brand;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}