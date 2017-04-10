package strategy.model;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void make() {
        strategy.make();
    }
}
