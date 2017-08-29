package singleton.lazy.doubleCheckLock;

/**
 * Created by xuan on 8/28/17.
 */
public class Singleton {
    volatile private static Singleton instance = null;

    private Singleton() {}

    public Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
