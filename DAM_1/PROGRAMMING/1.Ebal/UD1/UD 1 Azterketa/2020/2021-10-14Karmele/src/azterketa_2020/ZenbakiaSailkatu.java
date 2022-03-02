package azterketa_2020;

import java.util.Scanner;

public class ZenbakiaSailkatu {

    public static void main(String[] args) {
        int zen;

        do {
            System.out.printf("Sartu zenbaki oso positibo bat:\n");
            Scanner in = new Scanner(System.in);
            zen = in.nextInt();
            if (zen <= 0) {
                System.out.printf("Zenbaki ezegokia.\n");
            }
        } while (zen <= 0);

        if (zen > 100) {
            if (zen % 2 == 0) {
                System.out.printf("Sartu duzun zenbaki handia bikoitia da.\n");
            } else {
                System.out.printf("Sartu duzun zenbaki handia bakoitia da.\n");
            }
        } else {
            if (zen % 2 == 0) {
                System.out.printf("Sartu duzun zenbaki txikia bikoitia da.\n");
            } else {
                System.out.printf("Sartu duzun zenbaki txikia bakoitia da.\n");
            }
        }
    }
}

/* Giltzen erabilera: zabaltzeko eta zarratzeko giltzak parean jartzen dituzu. Ondo. Baina programen lerro kopurua handitzen delako, ez da gehien erabiltzen den irizpidea... beraz ezingo duzu ALT+MAY+F erabili ahal izango. Ziur zaude merezi dotzula?
- Pakete bat sortu duzu, oso ondo. Kontuz baina, pakete izenak beti minuskulaz doaz.*/
