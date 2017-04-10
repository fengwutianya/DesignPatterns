package abstractfactory;

/**
 * Created by xuan on 4/3/17.
 */
public class IntelMainboard implements Mainboard {
    private int pinHoles;

    public IntelMainboard(int pinHoles) {
        this.pinHoles = pinHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("intel mainboard has " + pinHoles + " pinHoles");
    }
}
