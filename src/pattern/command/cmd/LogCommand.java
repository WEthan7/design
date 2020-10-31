package pattern.command.cmd;

import pattern.command.service.LogService;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 15:46
 */
public class LogCommand implements Command {
    private LogService service;

    public LogCommand(LogService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.log();
    }
}
