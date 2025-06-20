package behavioralpatterns.mediator;

//Component

public abstract class User {
    protected String name;
    protected ChatMediator chatMediator;


    public User(ChatMediator chatMediator, String name) {
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void receive(String message);
    public abstract void send(String message);
}
