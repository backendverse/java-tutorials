package java8.shorts;

public interface KafkaNotificationService {
    default void sendNotification() {
        System.out.println("kafka notification");
    }
}
