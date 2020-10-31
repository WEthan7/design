package pattern.factory;

import pattern.factory.bean.Bean;
import pattern.factory.factory.AbstractFactory;
import pattern.factory.statical.StaticFactory;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 13:06
 *
 * <p>
 *     静态抽象工厂使用思路:
 *          使用静态方法返回工厂接口
 *          使用工厂接口得到bean实例
 * </p>
 */
public class StaticFactoryMain {
    public static void main(String[] args) {
        AbstractFactory factory = StaticFactory.newFactory("bean");
        Bean bean = factory.createBean("info");
        bean.serve();
    }
}
