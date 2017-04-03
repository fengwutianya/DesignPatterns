package factory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class ExportPdfFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        switch (type) {
            case "financial": return new ExportFinancialPdfFile();
            case "standard": return new ExportStandardPdfFile();
            default: throw new RuntimeException("cannot find type");
        }
    }
}
