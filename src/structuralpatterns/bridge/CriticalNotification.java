package structuralpatterns.bridge;

//Refined Abstraction
public class CriticalNotification extends Notification {
    public CriticalNotification(MessageSender sender) {
        super(sender);
    }

    public void send(String subject, String message) {
        sender.sendMessage(subject, "[Critical Notification] : " + message);
    }
}
