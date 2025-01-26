package pwskills;

public class SMSProvider implements NotificationProvider{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Message is sent to"+recipient+"having this message"+message);
    }
}
