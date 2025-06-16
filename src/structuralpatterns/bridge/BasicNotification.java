package structuralpatterns.bridge;

//Refined Abstraction
public class BasicNotification extends Notification {
    public BasicNotification(MessageSender sender) {
        super(sender);
    }

    public void send(String subject, String message) {
        sender.sendMessage(subject, "[Basic Notification] : " + message);
    }
}
