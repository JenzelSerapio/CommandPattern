package commandPattern;

public class Light {
	private boolean isOn = false;
    private int brightness = 0;

    public void turnOn() {
        isOn = true;
        System.out.println("Light is turned ON");
        System.out.println();

    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is turned OFF");
        System.out.println();

    }

    public void setBrightnessLevel(int level) {
        brightness = level;
        System.out.println("Brightness set to " + brightness);
        System.out.println();

}
}
