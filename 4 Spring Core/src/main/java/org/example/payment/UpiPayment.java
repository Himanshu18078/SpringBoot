package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Primary //This is to give Priority if we have multiple bean of same type
//@Qualifier("up")
public class UpiPayment implements PaymentService{
    public void pay(){
        System.out.println("Payment done via UPI");
    }
}
