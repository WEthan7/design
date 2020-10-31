package pattern.command.service;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 15:45
 */
public class LogService {
    public void log() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
