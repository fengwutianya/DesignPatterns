import java.io.*;
import java.util.Map;

/**
 * Created by xuan on 4/2/17.
 */
public class TestKnown {
    public static void main(String[] args) {
//        InputStream is = new
//        InputStream abstract class
        //4 InputStream subclass byteArray file piped
        InputStream bais = new ByteArrayInputStream(new byte[10]);
        try {
            InputStream fis = new FileInputStream(".");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PipedInputStream pis = new PipedInputStream();
//        StringBufferInputStream deprecated


//        FilterInputStream fis = new FilterInputStream();
//        protected constructor
        //use BufferedInputStream, DataInputStream, LineNumberInputStream instead
//        FilterInputStream bis = new BufferedInputStream(bais);
//        FilterInputStream dis = new DataInputStream(bais);
////        FilterInputStream lnis = new LineNumberInputStream(bais); //deprecated
//        FilterInputStream pbis = new PushbackInputStream(bais);
//
//
//        try {
//            ObjectInputStream ois = new ObjectInputStream(bais);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        SequenceInputStream sis = new SequenceInputStream(bais, pis);
//    }
//        class Entry<k, v> implements Map.Entry<k, v> {
//
//            @Override
//            public k getKey() {
//                return null;
//            }
//
//            @Override
//            public v getValue() {
//                return null;
//            }
//
//            @Override
//            public v setValue(v v) {
//                return null;
//            }
        Map.Entry<?, ?>[] entries = {};
        Map.Entry<String, Integer>[] entries1 =
                (Map.Entry<String, Integer>[]) entries;
        }
}
