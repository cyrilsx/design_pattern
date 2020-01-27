package state;

public class RingAlert implements State {

    @Override
    public void alert(AlertStateContext alertStateContext) {
        System.out.println("Ring Ring Ring");
    }
}
