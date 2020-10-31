package pattern.command.service;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 15:44
 */
public class SysoutService {
    public void out() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
