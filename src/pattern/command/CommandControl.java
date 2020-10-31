package pattern.command;

import pattern.command.cmd.Command;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 15:49
 */
public class CommandControl {
    private List<Command> commands = new LinkedList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void on() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
