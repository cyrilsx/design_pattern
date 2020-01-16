package command;

public class Switch {

    public void storeAndExecute(Command onCommand) {
        onCommand.execute();
    }
}
