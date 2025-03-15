package com.example.bai1;

import org.springframework.beans.factory.annotation.Qualifier;

public class Person {
    private Vehicle vehicle;
    public Person(@Qualifier("car") Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public void drive(){
        vehicle.drive();
    }
}
