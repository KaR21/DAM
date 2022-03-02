package azterketa_1Unitatea;

import java.util.Scanner;

public class Gurutzea {

    public static void main(String[] args) {
        int errenkada, zutabea, tamaina;

        Scanner in = new Scanner(System.in);

        System.out.printf("Zein neurritako gurutzea marraztu nahi duzu (zenbaki bakoitia sartu)? ");
        tamaina = in.nextInt();
        in.close(); //Scannerra itxi.

        for (errenkada = 0; errenkada < tamaina; errenkada++) { //Errenkadak inprimatzeko.
            for (zutabea = 0; zutabea < tamaina; zutabea++) { //Zutabeak inprimatzeko.
                if (errenkada == (tamaina / 2) || zutabea == (tamaina / 2)) { //Sartutako zenbakiaren erdian errenkadak eta zutabeetan 0-a marrazteko.
                    System.out.printf("0 ");
                } else {
                    System.out.printf(". ");
                }
            }
            System.out.printf("\n");
        }
    }
}
