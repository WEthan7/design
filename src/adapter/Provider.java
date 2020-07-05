package adapter;

/**
 * @author Ethan
 * @description 服务提供者
 * @date 7/5 15:50
 */
public interface Provider {
    /**
     * 服务提供者提供服务功能
     * @return 服务对象
     */
    Service newService();
}
