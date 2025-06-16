package structuralpatterns.bridge;

//Concrete Implementor
public class EmailSender implements MessageSender {
    public void sendMessage(String subject, String message) {
        System.out.println("Sending email to " + subject + ": " + message);
    }
}
