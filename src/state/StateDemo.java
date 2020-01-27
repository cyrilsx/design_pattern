package state;

public class StateDemo {

    public static void main(String[] args) {
        final AlertStateContext alertStateContext = new AlertStateContext();

        alertStateContext.setCurrentState(new RingAlert());
        alertStateContext.alert();
        alertStateContext.setCurrentState(new SilentAlert());
        alertStateContext.alert();
    }

}
