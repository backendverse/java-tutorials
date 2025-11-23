package shorts;

public interface AwsNotificationService {
    default void sendNotification() {
        System.out.println("aws notification");
    }
}
