package azterketa_2020;

import java.util.Scanner;

public class Izenak {

    public static void main(String[] args) {
        String[] izenak = {"Jon", "Jone", "June", "Julian", "Julen"};
        String norenBila;
        int i = 0, aurkituta = 0;

        System.out.printf("Noren bila zabiltza?:\n");
        Scanner in = new Scanner(System.in);
        norenBila = in.next();
        in.close();

        while (i < izenak.length && aurkituta == 0) {
            if (izenak[i].equals(norenBila)) //izenak[i] posizioa eta norenBila berdinak badira
            {
                aurkituta = 1;  //irten whiletik
            }
            i++;
        }
        if (aurkituta == 1) {
            System.out.printf("%s zerrendako %d.a da.\n", norenBila, i);
        } else {
            System.out.printf("%s ez dago zerrendan.\n", norenBila);
        }
    }
}

/* Giltzen erabilera: zabaltzeko eta zarratzeko giltzak parean jartzen dituzu. Ondo. Baina programen lerro kopurua handitzen delako, ez da gehien erabiltzen den irizpidea... beraz ezingo duzu ALT+MAY+F erabili ahal izango. Ziur zaude merezi dotzula?
- Pakete bat sortu duzu, oso ondo. Kontuz baina, pakete izenak beti minuskulaz doaz.*/
