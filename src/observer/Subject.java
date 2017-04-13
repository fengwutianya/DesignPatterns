package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuan on 4/13/17.
 */
public abstract class Subject {
    private List<Observer> list = new ArrayList<Observer>();

    public void attach(Observer observer) {
        list.add(observer);
    }

    public void detach(Observer observer) {
        list.remove(observer);
    }

    public void notifyObservers(String newState) {
        for (Observer observer: list) {
            observer.update(newState);
        }
    }
}
