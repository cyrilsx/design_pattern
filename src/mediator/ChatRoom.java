package mediator;

import java.util.HashMap;
import java.util.Map;

// Concrete mediator
public class ChatRoom implements ChatMediator {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId) {
        usersMap.get(userId).receive(msg);
    }

    @Override
    public void addUser(User user) {
        usersMap.putIfAbsent(user.getUserId(), user);
    }
}
