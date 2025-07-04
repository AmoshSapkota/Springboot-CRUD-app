package com.learning.springtutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int id;
    private String name;
    private String technology;
    @Autowired
    private Laptop laptop;

    // getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTechnology() {
        return technology;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public void show() {
        System.out.println("in show");
    }
}