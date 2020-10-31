package pattern.adapter;

import pattern.adapter.interfaces.Adaptor;
import pattern.adapter.interfaces.Service;
import pattern.adapter.interfaces.Target;
import pattern.adapter.interfaces.impl.ServiceImpl;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/30 19:19
 *
 * <p>
 *     适配器模式:
 *          适配器接口继承两个需要适配的接口, 将两个接口方法, 内部调用起来
 * </p>
 */
public class AdaptorMain {
    public static void main(String[] args) {
        Target target = new Adaptor() {
            @Override
            public void serve() {
                doService();
            }

            @Override
            public void doService() {
                Service service = new ServiceImpl();
                service.doService();
            }
        };
        target.serve();
    }
}
