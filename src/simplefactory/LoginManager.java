package simplefactory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class LoginManager {
    //静态工厂
    public static Login factory(String type) {
        if (type.equals("password"))
            return new PasswordLogin();
        else if (type.equals("domain"))
            return new DomainLogin();
        else
            throw new RuntimeException("cannot find type");
    }
}
