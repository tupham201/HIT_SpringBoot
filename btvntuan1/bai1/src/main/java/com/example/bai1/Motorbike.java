package com.example.bai1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle {

    private Engine engine;

    @Autowired
    public Motorbike(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        System.out.println("Driving motorbike");
    }
}
