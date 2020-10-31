package pattern.template.error;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 19:37
 */
public class ErrorComponent {
    public String content() {
        // 如果content必须调用hook方法, 则会循环引用, 虽然程序不会出错, 但是这样是应该避免的
        ErrorTemplate template = new ErrorTemplate(this);
        template.hook();
        return this.getClass().getCanonicalName();
    }
}
