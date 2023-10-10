package commandPattern;

public class StartRobotVacuum implements Command {
    private RobotVacuum robotVacuum;

    public StartRobotVacuum(RobotVacuum robotVacuum) {
        this.robotVacuum = robotVacuum;
    }

    @Override
    public void execute() {
        robotVacuum.startCleaning();
    }
}

