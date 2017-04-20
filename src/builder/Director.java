package builder;

/**
 * Created by xuan on 4/20/17.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildHead();
        builder.buildBody();
        builder.buildHand();
        builder.buildFeet();
    }
}
