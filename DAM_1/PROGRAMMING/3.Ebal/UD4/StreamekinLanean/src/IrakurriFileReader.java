
import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author elorza.karmele
 */
public class IrakurriFileReader {

      public static void main(String[] args) {
            String name;
            int i = 0;

            try {
                  FileReader ireki = new FileReader("texto.txt");
                  BufferedReader info = new BufferedReader(ireki);
                  while ((name = info.readLine()) != null) {
                        System.out.println(name); //coge el valor de cada linea
                  }
            } catch (Exception e) {
                  System.out.println("Irakurtzean errorea");
            }
      }
}
