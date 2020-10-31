package pattern.observe;

import pattern.observe.observer.Observer;
import pattern.observe.observer.SysoutObserver;
import pattern.observe.subject.Observable;

/**
 * @author Ethan.Barbatos
 * @version AWS-G.1.0
 * @date 10/30 19:12
 *
 * <p>
 *     观察者模式:
 *          发布者维护一个观察者列表, 观察者引用了发布者, 可以自己进行注册注销
 *          类似与回调, 但是维护了多个回调接口
 * </p>
 */
public class ObserverMain {

    public static void main(String[] args) {
        Observable observable = new Observable();
        Observer observer = new SysoutObserver(observable);
        observable.broadcast();
    }
}
