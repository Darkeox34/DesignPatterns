package behavioralpatterns.mediator;

import java.util.ArrayList;

//Concrete Mediator

public class ChatRoom implements ChatMediator{
    ArrayList<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void sendMessage(User sender, String message) {
        for (User user : users) {
            if(user == sender)
                continue;
            user.receive(message);
        }
    }
}
