package azterketa_1Unitatea;

import java.util.Scanner;

public class HitzEzkutua {

    public static void main(String[] args) {
        String hitza = "udazkena";
        String hizkia;
        int i, strLen = hitza.length();

        Scanner in = new Scanner(System.in);
        System.out.printf("Sartu karaktere bat? ");
        hizkia = in.next();
        in.close(); //Scannerra itxi.

        for (i = 0; i < strLen; i++) { //String hitza zeharkatzeko.
            if (hitza.charAt(i) == hizkia.charAt(0)) { //String hitza-ko karaktereak erabiltzaileak sartutako karaktereekin alderatzeko.
                System.out.printf("%s", hizkia);
            } else {
                System.out.printf("-");
            }
        }
        System.out.println();
    }
    /* IDOIAN ERANTZUNA
    public static void main(String[] args) {
        String hitza = "udazkena";
        String hizkia;
        int i, strLen = hitza.length();

        Scanner in = new Scanner(System.in);
        System.out.printf("Sartu karaktere bat? ");
        hizkia = in.next();
        char hizkiachar = hizkia.charAt(0);
        in.close(); //Scannerra itxi.

        for (i = 0; i < strLen; i++) { //String hitza zeharkatzeko.
            if (hizkiachar == hizkia.charAt(i)) { //String hitza-ko karaktereak erabiltzaileak sartutako karaktereekin alderatzeko.
                System.out.printf("%c", hizkiachar);
            } else {
                System.out.printf("-");
            }
        }
        System.out.println();
    }
    */
    /* BESTE ERANTZUNA
    public static void main(String[] args) {
        String hitza = "udazkena";
        char hizkia = ' ';
        int i, strLen = hitza.length();

        Scanner in = new Scanner(System.in);
        System.out.printf("Sartu karaktere bat? ");
        hizkia = in.next(). charAt(0);
        in.close(); //Scannerra itxi.

        for (i = 0; i < strLen; i++) { //String hitza zeharkatzeko.
            if (hizkia == hitza.charAt(i)) { //String hitza-ko karaktereak erabiltzaileak sartutako karaktereekin alderatzeko.
                System.out.printf("%c", hizkiachar);
            } else {
                System.out.printf("-");
            }
        }
        System.out.println();
    }
    */
}
