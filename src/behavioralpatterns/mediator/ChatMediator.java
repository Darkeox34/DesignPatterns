package behavioralpatterns.mediator;

//Mediator

/**
 *          MAIN USAGE
 *
 *         ChatMediator chatRoom = new ChatRoom();
 *
 *         User user1 = new ConcreteUser(chatRoom, "Antonio");
 *         User user2 = new ConcreteUser(chatRoom, "Vito");
 *         User user3 = new ConcreteUser(chatRoom, "Davide");
 *
 *         chatRoom.addUser(user1);
 *         chatRoom.addUser(user2);
 *         chatRoom.addUser(user3);
 *
 *         user1.send("Hi everyone");
 *         user2.send("Hello!");
*/

public interface ChatMediator {
    void sendMessage(User sender, String message);
    void addUser(User user);
}
