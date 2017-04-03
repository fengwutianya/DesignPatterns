package singleton;

/**
 * 静态内部类的一个静态字段
 * Created by xuan on 2017/4/3 0003.
 */
public class InnerClassSingleton {
    /*
    类级内部类，实例化与外部类没有关系--》延迟加载，静态字段直到被访问才实例化，静态字段由jvm保证不会被重复创建
     */
    private static class Holder {
        public static InnerClassSingleton instance = new InnerClassSingleton();
    }

    public InnerClassSingleton getInstance() {
        return Holder.instance;
    }
}
