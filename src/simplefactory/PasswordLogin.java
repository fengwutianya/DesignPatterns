package simplefactory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        /*
        业务逻辑
         */
        return true;
    }
}
