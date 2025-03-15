package com.example.bai2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HealthyFoodOrder implements Order{

    private PaymentMethod  paymentMethod;

    @Autowired
    public HealthyFoodOrder(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void processOrder() {
        System.out.println("HealthyFoodOrder");
    }
}
