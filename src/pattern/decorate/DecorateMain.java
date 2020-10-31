package pattern.decorate;

import pattern.decorate.component.SysOutWrapper;
import pattern.decorate.component.Wrapper;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 0:48
 *
 * <p>
 *     装饰器模式:
 *          在一个接口上玩套娃, 通过组合方式, 实现嵌套调用
 *          加入一层decorater装饰器层是为了提供一层拓展, 封装公共方法
 *          此时decorator中方法的访问权限最低是protected
 * </p>
 */
public class DecorateMain {

    public static void main(String[] args) {
        Wrapper wrapper = new SysOutWrapper();
        Decoration decoration = new InfoDecoration(wrapper);
        decoration = new InfoDecoration(decoration);
        decoration.serve();
    }
}
