package decorator;

import java.io.*;

/**
 * Created by xuan on 4/2/17.
 */
public class IOTest {
    public static void main(String[] args) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("text.txt")
                )
        )) {
            dos.writeInt(5);
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("text.txt")
                )
        );
        System.out.println(dis.readInt());
        System.out.println(dis.readInt());
        dis.close();
    }
}
