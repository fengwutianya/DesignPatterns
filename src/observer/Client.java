package observer;

/**
 * Created by xuan on 4/13/17.
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.attach(observer);
        subject.change("hello");
        subject.change("world");
    }
}
