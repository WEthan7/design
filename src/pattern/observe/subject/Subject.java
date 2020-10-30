package pattern.observe.subject;

import pattern.observe.observer.Observer;

/**
 * @author Ethan
 * @version 1.0
 * @date 10/30 19:06
 *
 * <p>
 *     发布者接口:
 *          提供观察者注册,注销
 * </p>
 */
public interface Subject {
    void register(Observer observer);

    void withdraw(Observer observer);

    void broadcast();
}
