package com.example.SpringBootCoreDemo;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
//    @Value("${PaymentGateway.type:Razorpay}")
//    @Value("${PaymentGateway.retry:3}")

    private final PaymentProperties paymentProperties;

    public PaymentGateway(PaymentProperties paymentProperties) {
        this.paymentProperties = paymentProperties;
    }
    public String getType(){
        return paymentProperties.getType();
    }
    public int getRetryCount(){
        return paymentProperties.getRetryCount();
    }

    public boolean isEnabled(){
        return paymentProperties.isEnabled();
    }
    public int getTimeout(){
        return paymentProperties.getTimeout();
    }
    public void print(){
        System.out.println(getType());
        System.out.println(getRetryCount());
        System.out.println(isEnabled());
        System.out.println(getTimeout());
    }
}

 /*
public PaymentGateway(@Value("${PaymentGateway.type}") String type,
                      @Value("${PaymentGateway.retry}") int retryCount) {
        this.type = type;
        this.retryCount = retryCount;
    }
 */