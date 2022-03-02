package azterketa_1Unitatea;

import java.util.Scanner;

public class Zatigarritasuna {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int zenbaki1, zenbaki2;

        System.out.print("Zein zenbakiren arteko zatigarritasuna nahi duzu egiaztatu? ");
        zenbaki1 = in.nextInt();
        zenbaki2 = in.nextInt();
        if (zatigarriaDa(zenbaki1, zenbaki2)) {
            System.out.println(zenbaki1 + " zenbakia " + zenbaki2 + " zenbakiarekin zatigarria da.");
        } else {
            System.out.println(zenbaki1 + " zenbakia ez da " + zenbaki2 + " zenbakiarekin zatigarria.");
        }
    }

    public static boolean zatigarriaDa(int handia, int txikia) {
        boolean erantzuna = false;

        if (handia % txikia == 0) // Zenbaki handia (kasu honetan lehenengo sartutakoa) zenbaki txikiarekiko zatigarritasuna ikusteko.
        {
            erantzuna = true; //Zatigarriak badira, erantzuna true izango da, bestela false.
        }

        return erantzuna;
    }
    /* IDOIAN ERANTZUNA
    public static boolean zatigarriaDa(int handia, int txikia) {
        return handia % txikia == 0;
    }*/

}
