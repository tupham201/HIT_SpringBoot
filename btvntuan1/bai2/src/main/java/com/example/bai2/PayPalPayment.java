package com.example.bai2;

import org.springframework.stereotype.Component;

@Component

public class PayPalPayment implements PaymentMethod {
    @Override
    public void pay() {
        System.out.println("Paypal payment");
    }
}
