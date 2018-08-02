package com.pch.circulardependency.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CircularDependencyB {

    @Autowired
    private CircularDependencyA circA;

//    @Getter
//    private String message;

    @Autowired
    public void setCircA(CircularDependencyA circA) {
        this.circA = circA;
    }

//    @PostConstruct
//    public void action() {
//        init();
//        System.out.println(circA.getStrA().toUpperCase() + "CircularDependencyB.action" + message);
//    }
//
//
//    private void init() {
//        message = "CircB";
//    }
}