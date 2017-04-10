package abstractfactory;

/**
 * Created by xuan on 4/3/17.
 */
public interface AbstractFactory {
    Cpu createCpu();
    Mainboard createMainboard();
}
