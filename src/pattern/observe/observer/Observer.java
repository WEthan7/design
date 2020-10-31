package pattern.observe.observer;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/30 19:05
 *
 * <p>
 *     观察者接口:
 *          自己控制注册,注销
 * </p>
 */
public interface Observer {
    void register();

    void withdraw();

    void serve();
}
