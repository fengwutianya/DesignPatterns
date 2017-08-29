package singleton.eager;

/**
 * Created by xuan on 8/28/17.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    //or
    static {
        instance = new Singleton();
    }

    private Singleton getInstance() {
        return instance;
    }
}
