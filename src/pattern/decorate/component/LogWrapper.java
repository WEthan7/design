package pattern.decorate.component;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 0:42
 */
public class LogWrapper implements Wrapper {
    @Override
    public void serve() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
