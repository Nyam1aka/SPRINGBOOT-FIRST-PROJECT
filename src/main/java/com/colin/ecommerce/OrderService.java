package com.colin.ecommerce;

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
