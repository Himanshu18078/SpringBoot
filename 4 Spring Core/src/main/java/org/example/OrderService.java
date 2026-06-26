package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// @Component tells Spring IOC Container —
// "this class is a Spring Bean, you create and manage its object"
//@Component
public class OrderService {

    /*
      OrderService depends on PaymentService
       @Autowired on field — This is Field Injection
       Spring IOC Container directly injects the PaymentService bean into this field
       No constructor or setter method needed
    @Autowired
    private PaymentService paymentService;
     */

    private final PaymentService paymentService;

    /*
    CONSTRUCTOR INJECTION
    // @Autowired tells Spring IOC Container —
    // "I need a PaymentService bean here, find it and inject it automatically"
    // This is Constructor Injection — dependency is injected via constructor
    MOST RECOMMENDED ONE :- AND IF WE HAVE ONLY ONE CONSTRUCTOR THEN THER IS NO NEED TO WRITE AUTOWIRED
     */
    public OrderService(PaymentService paymentService) {
//       cardPayment is the name of the bean which is the name of the class in camelCase
        this.paymentService = paymentService;
    }

    /*
    SETTER INJECTION
    // @Autowired tells Spring IOC Container —
    // "inject the PaymentService bean through this setter method"
    // This is Setter Injection — dependency is injected after the object is created
    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
     */


    public void placeOrder() {
        // Using the injected PaymentService bean to process payment
        paymentService.pay();
        System.out.println("Order Placed...");
    }
}