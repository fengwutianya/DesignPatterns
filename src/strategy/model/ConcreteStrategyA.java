package strategy.model;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void make() {
        System.out.println("make it using A method");
    }
}
