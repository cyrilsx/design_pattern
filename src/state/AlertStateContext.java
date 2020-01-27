package state;

public class AlertStateContext {

    private State currentState;

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void alert() {
        this.currentState.alert(this);
    }


}
