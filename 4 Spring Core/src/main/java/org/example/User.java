package org.example;

import org.springframework.stereotype.Component;

// @Component tells Spring IOC Container —
// "create and manage the bean of this class"
// BUT this will cause an ERROR at runtime!
// Because Spring does not know what values to pass
// for String name and int age in the constructor
//@Component
public class User {

    private String name;
    private int age;

    // Spring will try to call this constructor to create the bean
    // But it cannot find String and int values to inject
    // This will cause — NoSuchBeanDefinitionException or BeanCreationException
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}