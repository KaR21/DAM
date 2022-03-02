
package test;

import model.Demarkazioa;
import model.Futbolista;

/**
 *
 * @author elorza.karmele
 */
public class TestModel {
      public static void main(String[] args){
            Futbolista f1 = new Futbolista();
            f1.entrenar();
            Futbolista f2 = new Futbolista(21, Demarkazioa.DEL, 1, "Noah", 21, "Rodriguez_Diaz");
            System.out.println(f2.toString());
            System.out.println(f2.getDemarcacion());
      }
}
