package factory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class ExportStandardPdfFile implements ExportFile {
    @Override
    public boolean export(String data) {
        System.out.println("export standard pdf file");
        return true;
    }
}
