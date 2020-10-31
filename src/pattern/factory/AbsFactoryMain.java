package pattern.factory;

import pattern.factory.bean.Bean;
import pattern.factory.factory.AbsEnumFactory;
import pattern.factory.factory.AbstractFactory;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 12:05
 *
 * <p>
 *     抽象工厂的使用思路:
 *          factory是依赖于接口的
 *          bean是依赖与工厂与接口的
 * </p>
 */
public class AbsFactoryMain {

    public static void main(String[] args) {


        AbstractFactory factory = new AbsEnumFactory();
        Bean enumBean = factory.createBean("INFO");
        enumBean.serve();
    }
}
