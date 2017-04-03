package simplefactory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class DomainLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        /*
        业务逻辑额
         */
        return true;
    }
}
