package strategy.booksale;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class Price {
    private PriceStrategy priceStrategy;

    public Price(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double quote(double bookPrice) {
        return priceStrategy.caculatePrice(bookPrice);
    }
}
