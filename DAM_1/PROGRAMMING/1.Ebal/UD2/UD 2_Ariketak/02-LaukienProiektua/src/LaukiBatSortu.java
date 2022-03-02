
import java.util.Scanner;

public class LaukiBatSortu {

    public static void main(String[] args) {
        Laukia l1 = new Laukia();
        Scanner in = new Scanner(System.in);

        System.out.printf("Sartu laukiaren zabalera: ");
        l1.setZabalera(in.nextInt());
        System.out.println();

        System.out.printf("Sartu laukiaren altuera: ");
        l1.setAltuera(in.nextInt());
        System.out.println();

        System.out.printf("Lauki %s sortu duzu: => %s\n", l1.getMota(), l1);

        System.out.printf("Hona marrazkia beteta:\n");
        l1.marraztuBeteta();
        System.out.printf("Hona marrazkia hutsik:\n");
        l1.marraztuHutsik();
    }
}
