package pattern.template.error;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 19:42
 *
 * <p>
 *     何时使用策略模式, 何时使用模版模式?
 *
 *          1. 测试可以发现, 如果serve与调用的content是紧密相连的, 则可能出现循环引用;
 *              此时推荐模版模式, 且推荐模版是abstract的, 没有默认的模版可以调用, 必须继承实现
 *
 *          2. 如果serve与content没有紧密联系, 只是一个调用另一个, 则可以实现组合, 可以使用策略模式;
 *
 *          3. 如果模版还需要加入新功能, 则肯定需要abstract模版, 但也可以结合策略模式;
 *
 *     总结:
 *          模版模式注重新增功能, 符合好莱坞原则;
 *          策略模式注重组合方法接口的不同实现;
 *
 * </p>
 */
public class ErrorTest {
    public static void main(String[] args) {
        ErrorComponent component = new ErrorComponent();
        ErrorTemplate template = new ErrorTemplate(component);
        template.serve();
    }
}
