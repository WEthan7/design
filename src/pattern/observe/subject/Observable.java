package pattern.observe.subject;

import pattern.observe.observer.Observer;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Ethan
 * @version 1.0
 * @date 10/30 19:04
 */
public class Observable implements Subject {
    private static final List<Observer> OBSERVERS = new LinkedList<>();

    @Override
    public void register(Observer observer) {
        OBSERVERS.add(observer);
    }

    @Override
    public void withdraw(Observer observer) {
        OBSERVERS.remove(observer);
    }

    @Override
    public void broadcast() {
        for (Observer observer : OBSERVERS) {
            observer.serve();
        }
    }
}
