package abstractfactory;

/**
 * Created by xuan on 4/3/17.
 */
public class ComputerEngineer {
    private Cpu cpu;
    private Mainboard mainboard;

    private AbstractFactory factory;

    public ComputerEngineer(AbstractFactory factory) {
        this.factory = factory;
        cpu = factory.createCpu();
        mainboard = factory.createMainboard();
    }

    public void makeComputer() {
        mainboard.installCpu();
        cpu.calculate();
    }
}
