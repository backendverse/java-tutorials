void main() {

    KafkaNotificationService kafka =
            new KafkaNotificationService();

    NotificationHandler handler =
            new NotificationHandler(kafka);

    handler.triggerNotification("alice@gmail.com", "email template");

}

class NotificationHandler {

    private final KafkaNotificationService kafkaNotificationService;

    public NotificationHandler(
            KafkaNotificationService kafka) {
        kafkaNotificationService = kafka;
    }

    void triggerNotification(
            String email,
            String template) {
        kafkaNotificationService.sendNotification(email, template);
    }

}

class KafkaNotificationService {

    void sendNotification(
            String email,
            String template) {
        System.out.println("Sending Kafka Notification");
    }

}

class MqttNotificationService {

    void sendNotification(
            String email,
            String template) {
        System.out.println("Sending MQTT Notification");
    }

}