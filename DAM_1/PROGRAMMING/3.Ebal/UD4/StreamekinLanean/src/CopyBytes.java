
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author elorza.karmele
 */
public class CopyBytes {
      public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("license.png");
            out = new FileOutputStream("kopi.png");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
