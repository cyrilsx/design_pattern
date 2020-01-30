package mediator;

// concrete colleague
public class ChatUser extends User {

    public ChatUser(ChatMediator mediator, String userId, String name) {
        super(mediator, userId, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        this.getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }
}
