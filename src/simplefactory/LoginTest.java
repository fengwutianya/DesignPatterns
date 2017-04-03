package simplefactory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class LoginTest {
    public static void main(String[] args) {
        Login login = LoginManager.factory("password");
        boolean pass = login.verify("name", "password");
        if (pass) System.out.println("succeed to login");
        else System.out.println("failed to login");
    }
}
