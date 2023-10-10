package commandPattern;

import java.util.Scanner;

public class SmartDevices {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();
        RobotVacuum robotVacuum = new RobotVacuum(); // New device


        Command turnOnLivingRoomLight = new TurnOnLight(livingRoomLight);
        Command turnOffLivingRoomLight = new TurnOffLight(livingRoomLight);
        Command increaseThermostatTemperature = new IncreaseTemperature(thermostat);
        Command decreaseThermostatTemperature = new DecreaseTemperature(thermostat);
        Command playMusic = new PlayMusic(musicPlayer);
        Command stopMusic = new StopMusic(musicPlayer);
        Command startRobotVacuum = new StartRobotVacuum(robotVacuum); // New command
        Command stopRobotVacuum = new StopRobotVacuum(robotVacuum);   // New command
        
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(turnOnLivingRoomLight);
        remoteControl.addCommand(turnOffLivingRoomLight);
        remoteControl.addCommand(increaseThermostatTemperature);
        remoteControl.addCommand(decreaseThermostatTemperature);
        remoteControl.addCommand(playMusic);
        remoteControl.addCommand(stopMusic);
        remoteControl.addCommand(startRobotVacuum); // New command
        remoteControl.addCommand(stopRobotVacuum);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select a device and action:");
            System.out.println("1. Turn On Living Room Light");
            System.out.println("2. Turn Off Living Room Light");
            System.out.println("3. Increase Thermostat Temperature");
            System.out.println("4. Decrease Thermostat Temperature");
            System.out.println("5. Play Music");
            System.out.println("6. Stop Music");
            System.out.println("7. Start Robot Vacuum");
            System.out.println("8. Stop Robot Vacuum");
            System.out.println("0. Exit");
            System.out.println();
            int choice = scanner.nextInt();

            if (choice == 0) {
            	System.out.println("EXITING");
                break;
            } else {
                remoteControl.pressButton(choice - 1); // Adjust for 0-based index
            }
        }
    }
}