package facade.simple;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class Facade {
    public void test() {
        ModuleA a = new ModuleA();
        a.test();
        ModuleB b = new ModuleB();
        b.test();
        ModuleC c = new ModuleC();
        c.test();
    }
}
