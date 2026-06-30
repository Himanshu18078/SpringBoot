package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
       ConfigurableApplicationContext /*ApplicationContext*/ context = new AnnotationConfigApplicationContext(AppConfig.class);
//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();
//        UserService user = context.getBean(UserService.class);
//        user.setBeanName("userBean2");
        /*
        it will just print the name of the bean nothing else. It is not going to change the
        name of the bean in the IOC container
         */
        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));
        context.close();
    }
}
