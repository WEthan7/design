package pattern.factory;

import pattern.factory.bean.Bean;
import pattern.factory.factory.AbsBeanFactory;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 12:55
 *
 * <p>
 *     简单工厂的使用思路:
 *         直接创建工厂实例, 使用字符串关联bean
 * </p>
 */
public class SimpleFactoryMain {
    public static void main(String[] args) {
        AbsBeanFactory factory = new AbsBeanFactory();
        Bean bean = factory.createBean("log");
        bean.serve();
    }
}
