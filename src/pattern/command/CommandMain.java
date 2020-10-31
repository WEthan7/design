package pattern.command;

import pattern.command.cmd.Command;
import pattern.command.cmd.LogCommand;
import pattern.command.cmd.SysOutCommand;
import pattern.command.service.LogService;
import pattern.command.service.SysoutService;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 15:51
 */
public class CommandMain {

    public static void main(String[] args) {
        SysoutService outService = new SysoutService();
        LogService logService = new LogService();

        // 封装命令, 组合无关的service
        Command outCommand = new SysOutCommand(outService);
        Command logCommand = new LogCommand(logService);

        CommandControl control = new CommandControl();
        control.addCommand(outCommand);
        control.addCommand(logCommand);

        // 组合多个command在一起, 将多个无关的service, 用同一个接口管理
        control.on();
    }
}
