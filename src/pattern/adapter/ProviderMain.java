package pattern.adapter;

import pattern.adapter.interfaces.Service;

/**
 * @author Ethan
 * @version 1.0
 * @date 10/30 19:19
 */
public class ProviderMain {
    public static void main(String[] args) {
        Service service = Services.newInstance();
        service.doService();
    }
}
