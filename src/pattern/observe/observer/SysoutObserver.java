package pattern.observe.observer;

import pattern.observe.subject.Observable;

/**
 * @author Ethan
 * @version 1.0
 * @date 10/30 19:05
 */
public class SysoutObserver implements Observer {
    private Observable observable;

    public SysoutObserver(Observable observable) {
        this.observable = observable;
        this.register();
    }

    @Override
    public void register() {
        observable.register(this);
    }

    @Override
    public void withdraw() {
        observable.withdraw(this);
    }

    @Override
    public void serve() {
        System.out.println(this.getClass().getCanonicalName());
    }
}
