package abstractfactory;

/**
 * Created by xuan on 4/3/17.
 */
public class AmdMainboard implements Mainboard {
    private int pinHoles;

    public AmdMainboard(int pinHoles) {
        this.pinHoles = pinHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("amd mainboard has " + pinHoles + " pinHoles");
    }
}
