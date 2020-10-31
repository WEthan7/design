package pattern.command.cmd;

import pattern.command.service.SysoutService;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 15:43
 */
public class SysOutCommand implements Command {
    private SysoutService service;

    public SysOutCommand(SysoutService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.out();
    }
}
