package pwskills;

public class Main {
    public static void main(String[] args) {

        NotificationService notificationService= new NotificationService(new EmailProvider());
        notificationService.sendNotification("This is testing Message","Mike@gmail.com");
    }
}