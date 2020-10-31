package pattern.template;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 19:34
 *
 * <p>
 *
 * </p>
 */
public class ClassSysOutTemplate extends SysOutTemplate {
    @Override
    public String content() {
        super.hook();
        return this.getClass().getCanonicalName();
    }
}
