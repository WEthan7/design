package pattern.strategy.behavior;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/30 19:02
 */
public class SysOutBehavior implements Behavior {
    @Override
    public void serve() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
