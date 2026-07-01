package com.example.SpringBootCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {
		//This will up IOC container
//		ApplicationContext context =  SpringApplication.run(SpringBootCoreDemoApplication.class, args);
//		PaymentGateway paymentGateway = context.getBean(PaymentGateway.class);
//		paymentGateway.print();
		SpringApplication.run(SpringBootCoreDemoApplication.class, args);
	}

}
