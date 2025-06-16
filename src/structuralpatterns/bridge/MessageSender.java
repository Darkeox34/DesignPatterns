package structuralpatterns.bridge;

/**
 *         Notification notification = new CriticalNotification(new SMSSender());
 *
 *         notification.send("Antonio", "Il tuo abbonamento sta per scadere!");
 *
 *         Notification notification2 = new BasicNotification(new EmailSender());
 *
 *         notification2.send("Antonio", "Appello confermato!");
*/

//Implementor
public interface MessageSender {
    void sendMessage(String subject, String body);
}
