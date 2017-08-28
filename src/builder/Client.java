package builder;

import java.util.ArrayList;

/**
 * Created by xuan on 4/20/17.
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new FatPersonBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.getResult();
        product.show();
    }
}
