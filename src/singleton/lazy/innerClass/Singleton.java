package singleton.lazy.innerClass;

/**
 * Created by xuan on 8/28/17.
 */
public class Singleton {
    public static Singleton Singleton() {
        return Holder.instance;
    }

    /**
     * inner class, its static field instance is initialized
     * when the class is loaded, the class is loaded when outer class
     * needs to return Holder.instance, inner class's static field
     * then is initialized in <clinit>()V .
     */
    private static class Holder {
        public static Singleton instance = new Singleton();
    }
}
