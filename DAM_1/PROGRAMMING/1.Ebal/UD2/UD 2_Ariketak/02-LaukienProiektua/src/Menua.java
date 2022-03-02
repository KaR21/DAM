
import java.util.Scanner;

public class Menua {

    private static final int LAUKI_KOP = 10;
    private static Laukia[] laukiak = new Laukia[LAUKI_KOP];
    private static int sortutakoak = 0;

    public static void main(String[] args) {
        int aukera = 0, zabalera, altuera, laukiaPos;
        String laukiTipoa;
        Laukia max = new Laukia();
        Scanner in = new Scanner(System.in);

        while (aukera != 6) {
            System.out.printf("\n\nLAUKIAK\n");
            System.out.printf("=============================================\n");
            System.out.printf("1.- Lauki berria sortu\n");
            System.out.printf("2.- Laukien taula ikusi\n");
            System.out.printf("3.- Lauki bat marraztu\n");
            System.out.printf("4.- Lauki handiena bilatu\n");
            System.out.printf("5.- Hamar laukiak automatiko sartu\n");
            System.out.printf("6.- Irten\n\n");

            System.out.printf("Aukeratu zenbaki bat:\n");
            aukera = in.nextInt();

            switch (aukera) {
                case 1:
                    sortu();
                    break;
                case 2:
                    inprimatu();
                    break;
                case 3:
                    System.out.printf("Zenbatgarren laukia nahi duzu marraztu?:\n");
                    laukiaPos = in.nextInt();

                    System.out.printf("Beteta ala hutsik (B/H)?\n");
                    laukiTipoa = in.next();
                    marraztu(laukiaPos, laukiTipoa);
                    break;
                case 4:
                    System.out.printf("Laukirik handiena hau da:\n");
                    handiena(max);
                case 5:
                    arrayaBete();
            }
        }
    }

    public static void sortu() {
        int zabalera, altuera;
        Scanner in = new Scanner(System.in);

        if (sortutakoak < 10) {

            System.out.printf("Sartu laukiaren datuak:\n");
            System.out.printf("Zabalera: ");
            zabalera = in.nextInt();

            System.out.printf("Altuera: ");
            altuera = in.nextInt();

            laukiak[sortutakoak] = new Laukia(zabalera, altuera);
            sortutakoak++;
        } else {
            System.out.printf("Ezin dituzu lauki geihago sortu.\n");
        }
    }

    public static void inprimatu() {
        System.out.printf("Laukia\tZabalera\tAltuera\tAzalera\tPerimetroa\tMota\n");
        System.out.printf("================================================================\n");
        for (int i = 0; i < sortutakoak; i++) {
            System.out.printf("%d\t%d\t\t%d\t%d\t%d\t\t%s\n", i, laukiak[i].getZabalera(), laukiak[i].getAltuera(), laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
        }
    }

    public static void marraztu(int laukiaPos, String laukiTipoa) {
        if (laukiTipoa.equals("B")) {
            System.out.printf("Hona marrazkia beteta:\n");
            laukiak[laukiaPos].marraztuBeteta();
        }
        if (laukiTipoa.equals("H")) {
            System.out.printf("Hona marrazkia hutsik:\n");
            laukiak[laukiaPos].marraztuHutsik();
        }
    }

    public static void handiena(Laukia handiena) {
        handiena = Laukia.getTheBiggest(laukiak);
        System.out.println(handiena);
    }
    
    public static void arrayaBete(){
        for(int i = 0; i < 10; i++){
            laukiak[i] = new Laukia((int) (Math.random()*10)+ 1, (int) (Math.random()* 10) +1);
            sortutakoak++;
        }
    }
}
