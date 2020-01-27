package chainresponsability;

public class LoggerChain extends AbstractChain<String> {

    @Override
    void process(String param) {
        System.out.println("Logger " + param);
    }

}
