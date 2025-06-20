package behavioralpatterns.mediator;

//Concrete Component

public class ConcreteUser extends User{
    public ConcreteUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    public void receive(String message) {
        System.out.println("User " + name + " received: " + message);
    }

    public void send(String message) {
        System.out.println("User " + name + " sent: " + message);
        chatMediator.sendMessage(this, message);
    }
}
