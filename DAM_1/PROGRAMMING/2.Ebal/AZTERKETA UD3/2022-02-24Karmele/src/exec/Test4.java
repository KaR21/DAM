package exec;

import java.util.ArrayList;
import model.Kutxa;
import model.Laukizuzena;
import model.Puntua;

/**
 *
 * @author elorza.karmele
 */
public class Test4 {

      public static void main(String[] args) {
            ArrayList<Kutxa> kutxak = new ArrayList();
            kutxak.add(new Kutxa(new Puntua(20, 20), new Puntua(26, 24), 5));
            kutxak.add(new Kutxa(new Puntua(26, 24), new Puntua(20, 28), 2));
            Laukizuzena l1 = new Laukizuzena(new Puntua(7, 2), new Puntua(10, 4));

            Kutxa k1 = new Kutxa(new Puntua(20, 20), new Puntua(26, 24), 5);
            Kutxa k2 = new Kutxa(new Puntua(20, 20), new Puntua(26, 24), 6);

            System.out.println("1. Kutxaren bolumena: " + k1.getBolumena() + " eta luzera: " + k1.getErtzenLuzera());
            System.out.println("2. Kutxaren bolumena: " + k2.getBolumena() + " eta luzera: " + k2.getErtzenLuzera());

            if (l1.isInside(new Puntua(7, 5))) {
                  System.out.println("True. Puntua(7,5) barruan dago.");
            } else {
                  System.out.println("False. Puntua(7,5) ez dago barruan");
            }
            if (l1.isInside(new Puntua(8, 3))) {
                  System.out.println("True. Puntua(8,3) barruan dago.");
            } else {
                  System.out.println("False. Puntua(8,3) ez dago barruan");
            }
            Kutxa k6 = new Kutxa(new Puntua(2, 6), new Puntua(5, 7), 5);  
            Kutxa k7 = new Kutxa(new Puntua(1, 4), new Puntua(5, 6), 12);
            Kutxa k3 = new Kutxa(new Puntua(4, 6), new Puntua(7, 8), 3);
            Kutxa k4 = new Kutxa(new Puntua(3, 2), new Puntua(4, 9), 2);
            Kutxa k5 = new Kutxa(new Puntua(1, 1), new Puntua(3, 4), 6);

            kutxak.add(k1);
            kutxak.add(k2);
            kutxak.add(k3);
            kutxak.add(k4);
            kutxak.add(k5);
            kutxak.add(k6);
            kutxak.add(k7);
            System.out.println("Puntuak:" + (Kutxa.handiena(kutxak)) + ". Altuera: " + (Kutxa.handiena(kutxak)).getAltuera());
      }
}