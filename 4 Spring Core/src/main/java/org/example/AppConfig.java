package org.example;

import org.example.payment.CardPayment;
import org.example.payment.PaymentService;
import org.example.payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/*
 @Configuration tells Spring —
 "this is the configuration class, read it to find all the beans"
*/

@Configuration
/*
 @ComponentScan tells Spring —
 "scan this package and find all @Component classes and create their beans"
*/
@ComponentScan("org.example")
public class AppConfig {
    /*
     @Bean tells Spring IOC Container —
     "call this method, store the returned User object as a bean"
     We are manually providing the values — "Himanshu" and 21
     This solves the problem of Spring not knowing constructor values
    */
    @Bean
    public User createUser(){
        return new User("Himanshu",21);
    }
    @Bean
    @Qualifier("cp")
    public PaymentService createCardPayment(){
        return new CardPayment();
    }
    @Bean("upi")
    @Qualifier
    public PaymentService createUPIPayment(){
        return new UpiPayment();
    }
    @Bean
    public OrderService createOrderService(@Qualifier/*("createUPIPayment")*/("upi") PaymentService paymentService){
        //Here the dependency will be injected by the IOC Container
        return new OrderService(paymentService);
    }
}
