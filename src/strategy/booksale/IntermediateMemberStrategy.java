package strategy.booksale;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class IntermediateMemberStrategy implements PriceStrategy {
    @Override
    public double caculatePrice(double bookPrice) {
        System.out.println("中级会员10%的折扣");
        return bookPrice * 0.9;
    }
}
