package com.colin.ecommerce;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private PaymentService paymentService;

// We can comment out the Constructor dependency injection and we use setter injection below
//    public OrderService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.processPayment(10);
    }
}
