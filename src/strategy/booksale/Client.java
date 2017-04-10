package strategy.booksale;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class Client {
    public static void main(String[] args) {
        PriceStrategy strategy = new AdvancedMemberStrategy();
        Price price = new Price(strategy);
        double money = price.quote(138);
        System.out.println("你应该付款" + money + "元");
    }
}
