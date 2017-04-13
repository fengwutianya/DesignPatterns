package observer;

/**
 * Created by xuan on 4/13/17.
 */
public class ConcreteObserver implements Observer {
    private String observerState;

    @Override
    public void update(String state) {
        observerState = state;
        System.out.println("Concrete Observer State: " + observerState);
    }
}
