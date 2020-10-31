package pattern.factory.bean;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 11:58
 */
public class SysOutBean implements Bean {
    @Override
    public void serve() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
