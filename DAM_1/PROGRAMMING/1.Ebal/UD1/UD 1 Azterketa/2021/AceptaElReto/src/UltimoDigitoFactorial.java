//https://www.aceptaelreto.com/problem/statement.php?id=114

import java.util.Scanner;

public class UltimoDigitoFactorial {

    public static Scanner in;

    public static int faktoriala(int number) {
        int faktoriala = 1;

        if (number != 0 && number != 1) {
            for (int i = 2; i <= number; i++) {
                faktoriala = faktoriala * i;
            }
        }
    return faktoriala ;
    }
    
    public static void casoDePrueba(int i, int[] fak) {
        int n;

        n = in.nextInt();
        if (n > 6) {
            fak[i] = 0;
        } else {
            fak[i] = faktoriala(n) % 10;
        }

    }

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos, fak[];

        numCasos = in.nextInt();
        fak = new int[numCasos];

        for (int i = 0; i < numCasos; i++) {
            casoDePrueba(i, fak);
        }

        for (int i = 0; i < numCasos; i++) {
            System.out.println(fak[i]);
        }
    }
}
