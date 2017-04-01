package adapter.objectAdapter;

/**
 * Created by xuan on 4/1/17.
 */
public class Adapter implements Target {
    private Adaptee adaptee;    //delegate
    
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    @Override
    public void simpleOperation1() {
        adaptee.simpleOperation1();
    }

    @Override
    public void simpleOperation2() {
        //do it yourself in adapter
    }
}
