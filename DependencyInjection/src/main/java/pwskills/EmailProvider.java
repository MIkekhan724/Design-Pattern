package pwskills;

public class EmailProvider implements NotificationProvider{
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Email is sent to "+recipient+" having this message "+message);
    }
}
