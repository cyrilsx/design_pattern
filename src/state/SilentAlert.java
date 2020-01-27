package state;

public class SilentAlert implements State {

    @Override
    public void alert(AlertStateContext alertStateContext) {
        System.out.println("...");
    }
}
