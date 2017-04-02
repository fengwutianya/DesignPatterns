package decorator;

/**
 * Created by xuan on 2017/4/2 0002.
 */
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
