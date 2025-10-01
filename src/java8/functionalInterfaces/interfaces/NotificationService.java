package java8.functionalInterfaces.interfaces;

public interface NotificationService {

    void sendPushNotification();

    default void sendNotification(String email) {
        System.out.println("Sending Notification");
    }

    static void pingEmail(String email) {
        System.out.println("Pinging email");
    }

}
