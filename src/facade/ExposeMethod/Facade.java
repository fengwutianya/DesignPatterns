package facade.ExposeMethod;

/**
 * Created by xuan on 2017/4/7 0007.
 */
public class Facade {
    private static ModuleA a = new ModuleA();
    private static ModuleB b = new ModuleB();

    public void test1() {
        a.test1();
    }

    public void test2() {
        b.test2();
    }
}
