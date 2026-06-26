package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SMSService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
//        NotificationService notification = new EmailService();
//        NotificationService notification = new PopUpNotificationService();
        NotificationService notification = new SMSService();
        OrderService order = new OrderService();
        order.setNotification(notification);
        order.placeOrder();
    }
}
 