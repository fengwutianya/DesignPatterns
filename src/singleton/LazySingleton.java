package singleton;

/**
 * Created by xuan on 4/2/17.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {}

    public synchronized static LazySingleton getInstance() {
        if (instance == null) instance = new LazySingleton();
        return instance;
    }
}
