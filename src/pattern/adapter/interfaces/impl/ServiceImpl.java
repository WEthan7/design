package pattern.adapter.interfaces.impl;

import pattern.adapter.interfaces.Service;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/31 18:17
 */
public class ServiceImpl implements Service {
    @Override
    public void doService() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
