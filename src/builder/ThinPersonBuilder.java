package builder;

/**
 * Created by xuan on 4/20/17.
 */
public class ThinPersonBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildHead() {
        product.add("Thin Head");
    }

    @Override
    public void buildBody() {
        product.add("Thin Body");
    }

    @Override
    public void buildHand() {
        product.add("Thin Hand");
    }

    @Override
    public void buildFeet() {
        product.add("Thin Feet");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
