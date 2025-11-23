package shorts;

public class NotificationProblem implements KafkaNotificationService, AwsNotificationService {


    @Override
    public void sendNotification() {
KafkaNotificationService.super.sendNotification();
    }
}
