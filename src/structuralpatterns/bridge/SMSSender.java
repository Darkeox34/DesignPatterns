package structuralpatterns.bridge;

//Concrete Implementor
public class SMSSender implements MessageSender {
    public void sendMessage(String subject, String message) {
        System.out.println("Sending SMS to " + subject + " : " + message);
    }
}
