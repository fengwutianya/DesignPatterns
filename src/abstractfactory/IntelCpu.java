package abstractfactory;

/**
 * Created by xuan on 4/3/17.
 */
public class IntelCpu implements Cpu {
    private int pins = 0;

    public  IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("Intel cpu pins = " + pins);
    }
}
