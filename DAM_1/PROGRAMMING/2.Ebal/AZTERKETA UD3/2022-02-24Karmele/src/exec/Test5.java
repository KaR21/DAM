/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import java.util.ArrayList;
import java.util.Scanner;
import model.Kutxa;
import model.Puntua;

/**
 *
 * @author elorza.karmele
 */
public class Test5 {

      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            ArrayList<Kutxa> kutxak = new ArrayList();
            System.out.println("Zenbat kutxa sortu nahi dituzu?");
            int aldiz = in.nextInt();
            for (int i = 0; i < aldiz; ++i) {
                  System.out.println("Kutxa " + (i + 1) + ": ");
                  System.out.print("\tErpin bat-en X balioa: ");
                  int x1 = in.nextInt();
                  System.out.print("\tErpin bat-en Y balioa: ");
                  int y1 = in.nextInt();
                  System.out.println("");
                  System.out.print("\tKontrako erpin-aren X balioa: ");
                  int x2 = in.nextInt();
                  System.out.print("\tKontrako erpin-aren Y balioa: ");
                  int y2 = in.nextInt();
                  System.out.println("");
                  System.out.print("\tSaru kuxaren altuera: ");
                  int altuera = in.nextInt();
                  
                  kutxak.add(new Kutxa(new Puntua(x1, y1), new Puntua(x2, y2), altuera));

            }
            for(int i = 0; i < kutxak.size(); i++){
                  System.out.println((i+1) + ".kutxa: " + kutxak.get(i) + " altuera: " + kutxak.get(i).getAltuera());
            }
      }
}
