package observer.again;

/**
 * Created by xuan on 2017/8/27.
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
