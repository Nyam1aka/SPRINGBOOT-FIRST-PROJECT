package com.colin.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EcommerceApplication.class, args);
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();

        //Constructor injection line below
        //var orderService = new OrderService(new PaypalPaymentService());

//        setter injection dependency
//        var orderService = new OrderService();
//        orderService.setPaymentService(new PaypalPaymentService());



    }

}
