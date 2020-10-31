package pattern.factory.factory;

import pattern.factory.bean.Bean;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 11:57
 *
 * <p>
 *      抽象工厂接口:
 *          使用接口去代表工厂, 至少就是抽象接口
 * </p>
 */
public abstract class AbstractFactory {
    public abstract Bean createBean(String alias);

    public void serve() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
