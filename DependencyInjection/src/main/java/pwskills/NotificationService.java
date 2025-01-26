package pwskills;

public class NotificationService {

    private  NotificationProvider notificationProvider;
    public NotificationService(NotificationProvider notificationProvider)
    {
        this.notificationProvider=notificationProvider;
    }

    public  void sendNotification(String message, String recipient)
    {
        notificationProvider.sendNotification(message,recipient);
    }
}
