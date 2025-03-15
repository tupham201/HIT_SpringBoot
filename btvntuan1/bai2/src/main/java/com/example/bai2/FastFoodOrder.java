package com.example.bai2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FastFoodOrder implements Order{
    private PaymentMethod paymentMethod;

    @Autowired
    public FastFoodOrder(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public void processOrder() {
        System.out.println("FastFoodOrder");
    }
}
