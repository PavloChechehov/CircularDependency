package com.pch.circulardependency.demo;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class CircularDependencyA {

    @Autowired
    private CircularDependencyB circB;

    @Getter
    private String strA;

//    @PostConstruct
//    public void doWork() {
//        init();
//        System.out.println(circB.getMessage().toUpperCase() + "CircularDependencyA.doWork " + strA);
//    }    private void init() {
////        strA = "string A";
////    }

//

//    public CircularDependencyB getCircB() {
//        return circB;
//    }
}