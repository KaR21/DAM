package test;

import java.util.ArrayList;
import java.util.Arrays;
 import model.MyPoint;

/**
 *
 * @author elorza.karmele
 */
public class TestMyPoint {

      public static void main(String[] args) {
            MyPoint p0 = new MyPoint(0, 0), p1 = new MyPoint(2, 1), p2 = new MyPoint(4, 0);
            System.out.println("a) Hiru puntu sortu:");
            System.out.println("p0 => " + p0);
            System.out.println("p1 => " + p1);
            System.out.println("p2 => " + p2);

            System.out.println();

            System.out.println("b) Distantziak koordenatu-jatorriarekiko:");
            System.out.println("p0 => " + p0.distance());
            System.out.println("p1 => " + p1.distance());
            System.out.println("p2 => " + p2.distance());

            System.out.println();

            System.out.println("c) Distantziak euren artean:");
            System.out.println("p0tik p1ra => " + p0.distance(p1));
            System.out.println("p0tik p2ra => " + p0.distance(p2));
            System.out.println("p1tik p2ra => " + p1.distance(p2));

            System.out.println();

            System.out.println("d) Sortu 10 puntuko array bat. Eta automatikoki bete:");
            MyPoint puntuenArraya[] = new MyPoint[10];

            for (int i = 0; i < 10; i++) {
                  MyPoint pBakoitza = new MyPoint(i + 1, i + 1);
                  puntuenArraya[i] = pBakoitza;
            }
            
            System.out.println(Arrays.toString(puntuenArraya));
            
            System.out.println("e) Sortu 100 puntuko arrayLista:");
            ArrayList<MyPoint> puntuenArrayLista = new ArrayList<>();
            for (int i = 0; i < 100; i++) {
                  MyPoint pBakoitza = new MyPoint(i, i);
                  puntuenArrayLista.add (pBakoitza);
            }
            
            System.out.println(puntuenArrayLista);
            
            System.out.println("f) Sortu ausazko 5 puntuko sorta (0-9 tartean). java.util.Random klasearen .nextInt() metodoa erabili dezakezu.");
            MyPoint puntuenArrayTxiki[] = new MyPoint[5];
            for(int i = 0; i < 5; i++){
                  MyPoint pBakoitza = new MyPoint((int) (Math.random() * (10)), (int) (Math.random() * (9)));
                  puntuenArrayTxiki[i] = pBakoitza;
            }
            
            System.out.println(Arrays.toString(puntuenArrayTxiki));
      }
}
