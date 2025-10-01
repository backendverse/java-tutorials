package java8.functionalInterfaces;

import java8.functionalInterfaces.interfaces.NotificationService;

public class NotificationServiceImpl implements NotificationService {

    @Override
    public void sendPushNotification() {
        System.out.println("Sending Push Notification");
    }

    @Override
    public void sendNotification(String email) {
        NotificationService.super.sendNotification(email);
        System.out.println("Extra Task Perform");
    }


}
