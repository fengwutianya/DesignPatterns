package decorator;

/**
 * Created by xuan on 2017/4/2 0002.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        //some code to decorate
    }
}
