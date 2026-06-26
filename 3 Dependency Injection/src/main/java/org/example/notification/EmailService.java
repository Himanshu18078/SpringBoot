package org.example.notification;

public class EmailService implements NotificationService{
    public void sendNotification(){
        System.out.println("Email Notification sent");
    }
}
