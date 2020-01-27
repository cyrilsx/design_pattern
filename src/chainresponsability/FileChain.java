package chainresponsability;

public class FileChain extends AbstractChain<String> {

    @Override void process(String param) {
        System.out.println("File Chain " + param);
    }
}
