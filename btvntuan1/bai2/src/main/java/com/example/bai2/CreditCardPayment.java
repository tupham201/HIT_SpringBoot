package com.example.bai2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Credit Card Payment");
    }
}
