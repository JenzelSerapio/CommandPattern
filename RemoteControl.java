package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl{
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void pressButton(int buttonIndex) {
        if (buttonIndex >= 0 && buttonIndex < commands.size()) {
            commands.get(buttonIndex).execute();
        } else {
            System.out.println("Invalid button.");
        }
    }
}
