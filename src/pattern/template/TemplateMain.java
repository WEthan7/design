package pattern.template;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 19:34
 *
 * <p>
 *     模版模式:
 *          思想是抽象算法出来, 并提供扩展能力;
 *          很可能结合策略模式, 如果想在模版上添加新功能, 则肯定需要配合继承;
 *          如果只是需要不同的实现, 不需要新增功能, 则有时策略就够用;
 *
 *     由此可见:
 *          继承是为了增加功能;
 *          组合是为了可改功能;
 *          考虑继承还是组合, 还是需要面向对象, 分清is和has的区别
 * </p>
 */
public class TemplateMain {

    public static void main(String[] args) {
        SysOutTemplate template = new ClassSysOutTemplate();
        template.serve();
    }
}
