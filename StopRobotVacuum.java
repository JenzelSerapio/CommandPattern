package commandPattern;

public class StopRobotVacuum implements Command {
    private RobotVacuum robotVacuum;

    public StopRobotVacuum(RobotVacuum robotVacuum) {
        this.robotVacuum = robotVacuum;
    }

    @Override
    public void execute() {
        robotVacuum.stopCleaning();
    }
}
