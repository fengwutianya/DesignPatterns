package builder;

/**
 * Created by xuan on 4/20/17.
 */
public interface Builder {
    void buildHead();
    void buildBody();
    void buildHand();
    void buildFeet();

    Product getResult();
}
