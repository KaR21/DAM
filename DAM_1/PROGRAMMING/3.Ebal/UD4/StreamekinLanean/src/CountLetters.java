
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class CountLetters {
      public static void main(String[] args) {
            String name;
            int kont = 0;
            ArrayList<String> fitxeroa = new ArrayList();
            try {
                  FileReader ireki = new FileReader("texto.txt");
                  BufferedReader info = new BufferedReader(ireki);
                  while ((name = info.readLine()) != null) {
                        System.out.println(name);
                        fitxeroa.add(name);
                  }
            } catch (Exception e) {
                  System.out.println("Irakurtzean errorea");
            }

            System.out.println(fitxeroa);
            for (int i = 0; i < fitxeroa.size(); i++) {
                  for (int j = 0; j < fitxeroa.get(i).length(); j++) {
                        if (fitxeroa.get(i).charAt(j) == 'a') {
                              kont++;
                        }
                  }

            }
            System.out.println(kont);
      }
}
