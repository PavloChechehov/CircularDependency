package com.pch.circulardependency.demo;

import org.springframework.stereotype.Component;

@Component
public class CustomBean {

    private String name;
    private String lastName;

    public CustomBean() {
    }

    public CustomBean(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName;
    }
}
