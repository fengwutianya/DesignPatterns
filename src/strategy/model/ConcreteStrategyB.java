package strategy.model;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void make() {
        System.out.println("do it using B method");
    }
}
