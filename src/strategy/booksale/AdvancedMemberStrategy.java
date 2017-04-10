package strategy.booksale;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class AdvancedMemberStrategy implements PriceStrategy {
    @Override
    public double caculatePrice(double bookPrice) {
        System.out.println("高级会员20%优惠");
        return bookPrice * 0.8;
    }
}
