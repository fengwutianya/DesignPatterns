package abstractfactory;

/**
 * Created by xuan on 4/3/17.
 */
public class AmdCpu implements Cpu {
    private int pins;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("amd cpu has " + pins + " pins");
    }
}
