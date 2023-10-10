package commandPattern;

public class Thermostat {
	 private int temperature = 18; // Default temperature

	    public void increaseTemperature() {
	        temperature++;
	        System.out.println("Temperature increased to " + temperature + "°C");
            System.out.println();

	    }

	    public void decreaseTemperature() {
	        temperature--;
	        System.out.println("Temperature decreased to " + temperature + "°C");
            System.out.println();

	    }
}
