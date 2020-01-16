package command;

public class Light {

    private boolean isOn;

    public void toggleOn() {
        this.isOn = true;
        System.out.println("light is on");
    }

    public void toggleOff() {
        this.isOn = false;
        System.out.println("light is off");
    }

    public boolean isOn() {
        return isOn;
    }
}
