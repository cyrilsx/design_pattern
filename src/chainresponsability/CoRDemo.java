package chainresponsability;

public class CoRDemo {

    public static void main(String[] args) {
        final Chain<String> loggerChain = new LoggerChain();
        final Chain<String> fileChain = new FileChain();

        loggerChain.next(fileChain);

        loggerChain.handle("Chain of responsability");
    }

}
