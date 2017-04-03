package singleton;

/**
 * Created by xuan on 4/2/17.
 */
public class DoubleCheckedLockSingleton {
    private volatile static DoubleCheckedLockSingleton instance = null;

    private DoubleCheckedLockSingleton() {}

    public static DoubleCheckedLockSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockSingleton();
                }
            }
        }
        return instance;
    }
}
