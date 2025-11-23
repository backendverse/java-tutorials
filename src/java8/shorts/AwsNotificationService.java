package java8.shorts;

public interface AwsNotificationService {
    default void sendNotification() {
        System.out.println("aws notification");
    }
}
