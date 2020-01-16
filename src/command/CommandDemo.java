package command;


public class CommandDemo {

    public static void main(String[] args) {
        Light light = new Light();

        Switch switchLight = new Switch();

        Command onCommand = new OnCommand(light);

        switchLight.storeAndExecute(onCommand);
    }

}
