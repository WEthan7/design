package pattern.decorate;

import pattern.decorate.component.Wrapper;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/30 23:54
 *
 * <p>
 *     装饰器:
 *          从逻辑上分出一层, 用于拓展
 *          最低访问权限为protected
 *          建议在装饰器中强制引入wrapper, 可覆写serve, 也可暴露wrapper交给子类
 * </p>
 */
public abstract class Decoration implements Wrapper {

    private Wrapper wrapper;

    protected Decoration(Wrapper wrapper) {
        this.wrapper = wrapper;
    }

    /**
     * 设置为protected: 则只有继承与同包下的类可访问
     * 设置private: 则只有继承关系可以访问, 但装饰器不能使用private
     * this.decorate(); 这样套娃套到自己时,this可能是最大的子类,这时是在类外调用
     */
    protected void before() {
        System.out.println("before instanceId=" + this.hashCode());
    }

    protected void after() {
        System.out.println("after instanceId=" + this.hashCode());
    }

    /**
     * 暴露wrapper, 用于子类嵌套调用接口方案, 此处装饰器不需要添加新功能
     * @return wrapper
     */
    protected Wrapper expose() {
        return wrapper;
    }
}
