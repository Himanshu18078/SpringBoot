package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// @Component tells Spring IOC Container —
// "this class is a Spring Bean, you create and manage its object"
//@Component
public class OrderService {

    // OrderService depends on PaymentService
    private final PaymentService paymentService;
    /*
    FIELD INJECTION
    @Autowired
    private PaymentService paymentService;
    */

    /*
    CONSTRUCTOR INJECTION
     @Autowired tells Spring IOC Container —
     "I need a PaymentService bean here, find it and inject it automatically"
     This is Constructor Injection — dependency is injected via constructor
    */

    @Autowired //This is optional if there is only one constructor
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    /*
    SETTER INJECTION
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
     */

    public void placeOrder(){
        // Using the injected PaymentService bean to process payment
        paymentService.pay();
        System.out.println("Order Placed...");
    }
}
