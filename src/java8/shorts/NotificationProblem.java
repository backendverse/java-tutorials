package java8.shorts;

public class NotificationProblem implements KafkaNotificationService, AwsNotificationService {


    @Override
    public void sendNotification() {
KafkaNotificationService.super.sendNotification();
    }
}
