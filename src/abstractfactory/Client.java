package abstractfactory;

/**
 * Created by xuan on 4/3/17.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new IntelFactory();
        ComputerEngineer engineer = new ComputerEngineer(factory);
        engineer.makeComputer();
    }
}
