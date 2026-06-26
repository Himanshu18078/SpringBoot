package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
//@Qualifier("up")
//@Primary
public class UPIPayment implements PaymentService{
    public void pay(){
        System.out.println("Payment Done Through UPI");
    }
}
