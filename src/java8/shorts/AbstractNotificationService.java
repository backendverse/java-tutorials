package java8.shorts;

public sealed class AbstractNotificationService
        permits EmailService, PushService, SmsService {

    boolean sendNotification() {
        return true;
    }
}
