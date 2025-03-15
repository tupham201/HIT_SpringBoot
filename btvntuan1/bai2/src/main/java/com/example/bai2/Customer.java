package com.example.bai2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private FastFoodOrder fastFoodOrder;
    private HealthyFoodOrder healthyFoodOrder;
    private CreditCardPayment creditCardPayment;
    private PayPalPayment payPalPayment;

    @Autowired
    public Customer(@Qualifier("fastFoodOrder") FastFoodOrder fastFoodOrder, HealthyFoodOrder healthyFoodOrder, @Qualifier("creditCardPayment") CreditCardPayment creditCardPayment,
                    PayPalPayment payPalPayment) {
        this.fastFoodOrder = fastFoodOrder;
        this.healthyFoodOrder = healthyFoodOrder;
        this.creditCardPayment = creditCardPayment;
        this.payPalPayment = payPalPayment;
    }

    void oderFastFood(){
        fastFoodOrder.processOrder();
        creditCardPayment.pay();
    }
    void oderHealthyFood(){
        healthyFoodOrder.processOrder();
        payPalPayment.pay();
    }
}
