package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Lazy
@Scope("prototype")
public class CartService /*implements InitializingBean*/ implements BeanNameAware , ApplicationContextAware /*, DisposableBean */{
    Map<Integer,String> mp;
    public CartService(){
        mp = new HashMap<>();
        System.out.println("Cart service constructor called");
    }
    @Override
    public void setBeanName(String name) {
        System.out.println("Bean Name is : "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context name is : "+applicationContext.getClass());
    }
    @PostConstruct
    public void start2(){
        System.out.println("Initialization callback ");
        mp.put(1 , "Himanshu");
        mp.put(2 , "Mohit");
    }
    @PreDestroy
    public void end(){
        mp.clear();
        System.out.println("Bean is getting destroyed");
    }
    public void addToCart(){
        System.out.println("Added to cart...");
    }
    public String getValue(int key){
        return mp.get(key);
    }
/*
    @Override
    public void destroy() throws Exception {
        mp.clear();
        System.out.println("Bean is getting destroyed...");
    }

 */
    /*
    public void start(){
        System.out.println("Bean is ready");
        mp.put(1 , "Himanshu");
        mp.put(2 , "Mohit");
    }

    public void end(){
        mp.clear();
        System.out.println("Bean is getting destroyed...");
    }
     */
    /*
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialization callback ");
        mp.put(1 , "Himanshu");
        mp.put(2 , "Mohit");
    }
     */
}
