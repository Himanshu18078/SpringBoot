package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        /*
          ApplicationContext is the parent interface of IOC Container
          AnnotationConfigApplicationContext is the real IOC Container (child implementation)
          AppConfig.class is the Class object that provides metadata of AppConfig to Spring
          Spring internally uses Reflection to read AppConfig's @Bean methods
          and creates all the beans and stores them inside the IOC Container
        */
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /*
          Asking the IOC Container to give us the already created bean of OrderService
          We are NOT doing new OrderService() — Spring is managing the object (IOC)
        */
        OrderService orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
        User user = context.getBean(User.class);
        System.out.printf("Name is : %s ",user.getName());
    }
}
