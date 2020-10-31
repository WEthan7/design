package pattern.template.error;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 19:37
 */
public class ErrorTemplate {
    private ErrorComponent component;

    public ErrorTemplate(ErrorComponent component) {
        this.component = component;
    }

    public void serve() {
        System.out.println(content());
    }

    /**
     * 这里通过组合, 得到了可扩展的content实现
     * 这里是没有错误的, 但是component出可能会出现错误
     */
    public String content() {
        return component.content();
    }

    public void hook() {
        System.out.println("hook");
    }
}
