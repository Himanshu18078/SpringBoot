package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UPIPayment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
    // @Bean tells Spring IOC Container —
    // "call this method, whatever object it returns — store it as a bean"
    // We are manually creating the User object with required values
    // This solves the problem because now Spring does not need to
    // figure out the constructor values by itself
    @Bean
    public User createUser() {
        return new User("Himanshu", 21); // we are providing the values manually
    }
    @Bean
    public PaymentService createCardPayment(){
        return new CardPayment();
    }
//    @Bean
//    public PaymentService createUPIPayment(){
//        return new UPIPayment();
//    }
    @Bean
    public OrderService createOrderService(PaymentService paymentService){
        return new OrderService(paymentService);
    }
}
