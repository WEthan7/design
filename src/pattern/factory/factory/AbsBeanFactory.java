package pattern.factory.factory;

import pattern.factory.bean.Bean;
import pattern.factory.bean.InfoBean;
import pattern.factory.bean.LogBean;
import pattern.factory.bean.SysOutBean;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 12:00
 *
 * <p>
 *     抽象工厂的实现1
 * </p>
 */
public class AbsBeanFactory extends AbstractFactory {
    @Override
    public Bean createBean(String alias) {
        super.serve();
        switch (alias) {
            case "log":
                return new LogBean();
            case "info":
                return new InfoBean();
            default:
                return new SysOutBean();
        }
    }
}
