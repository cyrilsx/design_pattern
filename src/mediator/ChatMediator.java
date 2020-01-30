package mediator;

// Mediator
public interface ChatMediator {


    void sendMessage(String msg, String userId);

    void addUser(User user);
}
