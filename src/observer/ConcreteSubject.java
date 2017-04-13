package observer;

/**
 * Created by xuan on 4/13/17.
 */
public class ConcreteSubject extends Subject {
    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        state = newState;
        System.out.println("the new state of subject is: " + state);
        this.notifyObservers(newState);
    }
}
