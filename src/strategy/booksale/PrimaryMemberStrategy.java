package strategy.booksale;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class PrimaryMemberStrategy implements PriceStrategy {
    @Override
    public double caculatePrice(double bookPrice) {
        System.out.println("初级会员没有折扣");
        return bookPrice;
    }
}
