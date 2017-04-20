package builder;

/**
 * Created by xuan on 4/20/17.
 */
public class FatPersonBuilder implements Builder {
    private Product product = new Product();

    @Override
    public void buildHead() {
        product.add("Fat Head");
    }

    @Override
    public void buildBody() {
        product.add("Fat Body");
    }

    @Override
    public void buildHand() {
        product.add("Fat Hand");
    }

    @Override
    public void buildFeet() {
        product.add("Fat Feet");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
