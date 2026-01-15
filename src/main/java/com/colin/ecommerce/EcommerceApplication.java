package com.colin.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        //SpringApplication.run(EcommerceApplication.class, args);

        //Constructor injection line below
        //var orderService = new OrderService(new PaypalPaymentService());

        var orderService = new OrderService();
        orderService.setPaymentService(new PaypalPaymentService());
        orderService.placeOrder();
    }

}
