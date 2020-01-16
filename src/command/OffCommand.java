package command;

public class OffCommand implements Command {

    private final Light light;

    public OffCommand(Light light) {
        this.light = light;
    }

    @Override public void execute() {
        this.light.toggleOff();
    }
}
