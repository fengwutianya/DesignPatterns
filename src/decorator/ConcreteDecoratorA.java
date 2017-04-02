package decorator;

/**
 * Created by xuan on 2017/4/2 0002.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        //some code to decorate
    }
}
