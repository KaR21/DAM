package azterketa_1Unitatea;

import java.util.Scanner;

public class Segida {

    public static void main(String[] args) {
        int zenbakia, multzoak, i = 1, j;

        Scanner in = new Scanner(System.in);

        System.out.printf("Zein da inprimatu nahi duzun azken zenbakia? ");
        zenbakia = in.nextInt();
        System.out.printf("Zenbat zenbakiko multzoak nahi dituzu? ");
        multzoak = in.nextInt();

        in.close(); //Scannerra itxi.
        while (i < zenbakia) { //Zenbakiraino inprimatu.
            for (j = 0; j < multzoak; j++) { //Multzoko imprimatu.
                System.out.printf("%d\n", i);
                i++;
            }
            System.out.printf("=====\n");
        }
    }
}
