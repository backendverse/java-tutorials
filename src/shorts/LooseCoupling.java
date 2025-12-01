void main() {

    NotificationService service =
            new KafkaNotificationService();

    NotificationHandler handler =
            new NotificationHandler(service);

    handler.triggerNotification("alice@gmail.com", "email template");

}

class NotificationHandler {

    private final NotificationService service;

    public NotificationHandler(
            NotificationService service) {
        this.service = service;
    }

    void triggerNotification(
            String email, String template) {
        service.sendNotification(email, template);
    }

}

interface NotificationService {
    void sendNotification(
            String email,
            String template);
}

class KafkaNotificationService implements NotificationService {

    @Override
    public void sendNotification(
            String email, String template) {
        System.out.println("Sending Kafka Notification");
    }

}

class MqttNotificationService implements NotificationService {

    @Override
    public void sendNotification(
            String email, String template) {
        System.out.println("Sending MQTT Notification");
    }

}