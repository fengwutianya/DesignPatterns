package factory;

/**
 * Created by xuan on 2017/4/3 0003.
 */
public class ExportHtmlFactory implements ExportFactory {
    @Override
    public ExportFile factory(String type) {
        switch (type) {
            case "financial":
                return new ExportFinancialHtmlFile();
            case "standard":
                return new ExportStandardHtmlFile();
            default:
                throw new RuntimeException("cannot find type");
        }
    }
}
