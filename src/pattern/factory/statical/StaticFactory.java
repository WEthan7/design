package pattern.factory.statical;

import pattern.factory.factory.AbsBeanFactory;
import pattern.factory.factory.AbsEnumFactory;
import pattern.factory.factory.AbstractFactory;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 13:03
 *
 * <p>
 *     静态抽象工厂:
 *          使用静态方法返回工厂, 至少就是静态工厂类
 *          如果返回的是工厂的接口, 那么还是具有抽象能力的静态抽象工厂类
 * </p>
 */
public class StaticFactory {
    public static AbstractFactory newFactory(String type) {
        switch (type) {
            case "bean":
                return new AbsBeanFactory();
            case "enum":
                return new AbsEnumFactory();
            default:
                return new AbsBeanFactory();
        }
    }
}
