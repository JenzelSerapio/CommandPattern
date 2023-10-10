package commandPattern;

public class TurnOnLight implements Command {
    private Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
        light.setBrightnessLevel(100); // Example: Set brightness to 75%
    }

}
