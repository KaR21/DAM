
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author elorza.karmele
 */
public class FindandReplace {

      public static void main(String[] args) {
            String name;
            ArrayList<String> fitxeroa = new ArrayList();
            ArrayList<Character> hitzBakoitza = new ArrayList();
            try {
                  FileReader ireki = new FileReader("texto.txt");
                  BufferedReader info = new BufferedReader(ireki);
                  while ((name = info.readLine()) != null) {
                        fitxeroa.add(name + "\n");
                  }
            } catch (Exception e) {
                  System.out.println("Irakurtzean errorea");
            }

            //System.out.println(fitxeroa);
            for (int i = 0; i < fitxeroa.size(); i++) {
                  for (int j = 0; j < fitxeroa.get(i).length(); j++) {
                        if (fitxeroa.get(i).charAt(j) != '[' && fitxeroa.get(i).charAt(j) != ']' && fitxeroa.get(i).charAt(j) != ',') {
                              hitzBakoitza.add(fitxeroa.get(i).charAt(j));
                        }
                  }
            }
            try {
                  //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                  File archivo = new File("texto.txt");

                  //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                  FileWriter escribir = new FileWriter(archivo, true);

                  //Escribimos en el archivo con el metodo write
                  escribir.write(hitzBakoitza.);

                  //Cerramos la conexion
                  escribir.close();
            } //Si existe un problema al escribir cae aqui
            catch (Exception e) {
                  System.out.println("Error al escribir");
            }
            /*for (int i = 0; i < hitzBakoitza.size(); i++) {
                  if (hitzBakoitza.get(i).equals('a')) {
                        hitzBakoitza.remove(i);
                  }
            }
            //System.out.println(hitzBakoitza);
            //String idatzi = hitzBakoitza.toString();
            hitzBakoitza.toString().replaceAll("[", "");
            String idatzi = hitzBakoitza.toString();
            idatzi.replace("[", "");
            System.out.println(idatzi);
            try {
                  //Crear un objeto File se encarga de crear o abrir acceso a un archivo que se especifica en su constructor
                  File archivo = new File("texto.txt");

                  //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
                  FileWriter escribir = new FileWriter(archivo, true);

                  //Escribimos en el archivo con el metodo write
                  escribir.write(idatzi);

                  //Cerramos la conexion
                  escribir.close();
            } //Si existe un problema al escribir cae aqui
            catch (Exception e) {
                  System.out.println("Error al escribir");
            }*/

      }
}
