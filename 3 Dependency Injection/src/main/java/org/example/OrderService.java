package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SMSService;

public class OrderService {
//    We can not create object of the interface, but we can store reference of the child class in the parent interface
//    EXAMPLE FOR THE MULTIPLE INHERITANCE
//    NotificationService notification = new EmailService();
//    NotificationService notification = new SMSService();
//      NotificationService notification = new PopUpNotificationService();


//    DEPENDENCY INJECTION THROUGH CONSTRUCTOR
    NotificationService notification;
    OrderService(NotificationService notification){
        this.notification = notification;
    }

//    Overloaded constructor
    OrderService(){

    }

    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }

//    DEPENDENCY INJECTION THROUGH SETTER FUNCTION
    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
