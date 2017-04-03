package factory;

/**
 * 自己的理解是 简单工厂里面的if else过多了，
 * 可以把工厂分门别类整理一下，再抽象出抽象出工厂
 * Created by xuan on 2017/4/3 0003.
 */
public class Test {
    public static void main(String[] args) {
        ExportFactory factory = new ExportHtmlFactory();
        ExportFile file = factory.factory("standard");
        file.export("file");
    }
}
