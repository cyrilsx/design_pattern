package mediator;

// abstract colleague
public abstract class User {

    private final ChatMediator mediator;
    private final String userId;
    private final String name;

    public User(ChatMediator mediator, String userId, String name) {
        this.mediator = mediator;
        this.userId = userId;
        this.name = name;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);


    public ChatMediator getMediator() {
        return mediator;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }
}
