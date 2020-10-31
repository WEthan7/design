package pattern.template;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 19:32
 *
 * <p>
 *     抽象模版:
 *          暴露protected抽象方法给子类
 * </p>
 */
public abstract class SysOutTemplate {
    public void serve() {
        System.out.println(content());
    }

    protected abstract String content();

    public void hook() {
        System.out.println("hook");
    }
}
