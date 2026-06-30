package org.example;

/*
 @Component is REMOVED from here —
 because we are creating the User bean manually in AppConfig using @Bean
 Using both @Component and @Bean for the same class causes BeanCreationException
*/
public class User {
    private String name;
    private int age;

    /*
     Spring cannot call this constructor on its own —
     because it does not know what values to pass for String and int
     That is why we create the bean manually in AppConfig
    */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
