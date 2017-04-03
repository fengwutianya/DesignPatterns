package factory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class ExportFinancialHtmlFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("export financial html file");
        return true;
    }
}
