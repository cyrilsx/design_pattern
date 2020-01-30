package mediator;

public class MediatorDemo {

    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatRoom();

        final User userA = new ChatUser(chatMediator, "A", "Anastasia");
        final User userC = new ChatUser(chatMediator, "C", "Cyril");

        chatMediator.addUser(userA);
        chatMediator.addUser(userC);

        userA.send("Hello Cyril", userC.getUserId());
        userC.send("Coucou", userA.getUserId());
    }

}
