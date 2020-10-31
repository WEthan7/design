package pattern.factory.factory;

import pattern.factory.bean.Bean;
import pattern.factory.bean.InfoBean;
import pattern.factory.bean.LogBean;
import pattern.factory.bean.SysOutBean;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 12:09
 *
 * <p>
 *     抽象工厂的实现2
 * </p>
 */
public class AbsEnumFactory extends AbstractFactory {
    enum TYPE {
        SYS_OUT,
        LOG,
        INFO;

        public static TYPE getType(String name) {
            for (TYPE type : values()) {
                if (type.name().equals(name)) {
                    return type;
                }
            }
            return SYS_OUT;
        }
    }

    @Override
    public Bean createBean(String alias) {
        TYPE type = TYPE.getType(alias);
        switch (type) {
            case LOG:
                return new LogBean();
            case INFO:
                return new InfoBean();
            default:
                return new SysOutBean();
        }
    }
}
