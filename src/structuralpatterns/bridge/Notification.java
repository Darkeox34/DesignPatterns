package structuralpatterns.bridge;

//Abstraction
public abstract class Notification {
    protected MessageSender sender;

    Notification(MessageSender sender) {
        this.sender = sender;
    }

    public abstract void send(String subject, String message);
}
