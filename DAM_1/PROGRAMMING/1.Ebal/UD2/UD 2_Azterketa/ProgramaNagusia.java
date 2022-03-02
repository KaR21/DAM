package exekutagarriak;

import model.Liburua;
import java.util.Scanner;

public class ProgramaNagusia {

    private static Liburua[] liburuak;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        liburuak = Liburua.getLiburuSorta();

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("1.- Liburuen zerrenda sinplea ikusi");
            System.out.println("2.- Liburuen datu guztiak ikusi");
            System.out.println("3.- Liburuen zerrenda prezioaren grafikoarekin");
            System.out.println("4.- Liburu zaharrena bilatu");
            System.out.println("5.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    liburuakIkusi();
                    break;
                case 2:
                    liburuenDatuGuztiakIkusi();
                    break;
                case 3:
                    liburuenPrezioaIrudikatu();
                    break;
                case 4:
                    zaharrenaBilatu();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 5);
    }

    /**
     * Liburuen zerrenda sinplea inprimatzen du kontsolan metodo honek, liburuen
     * toString() metodoaz baliatuz.
     */
    public static void liburuakIkusi() { //ALDATUTAKO METODOA
        int i = 0;
        System.out.println("LIBURUEN ZERRENDA");
        System.out.println("==============================");
        while (i < liburuak.length) {
            if (liburuak[i] != null) {
                System.out.println(liburuak[i].toString());
            }
            i++;
        }
    }

    public static void liburuenDatuGuztiakIkusi() { //ALDATUTAKO METODOA
        int orriKop = 0, kont = 0;

        System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", "Z.", "Izenburua", "Egilea", "O.", "U.", "G.", "H.", "P.", "K.");
        for (int i = 0; i < liburuak.length; i++) {

            if (liburuak[i] != null) {
                System.out.printf("%-3s %-30s %-20s %4s %4s %-11s %1s %-6s %-15s\n", i + 1, liburuak[i].getIzenburua(), liburuak[i].getEgilea(), liburuak[i].getOrriKopurua(), liburuak[i].getUrtea(), liburuak[i].getGaia(), liburuak[i].getHizkuntza(), liburuak[i].getPrezioa(), liburuak[i].getKodea());
                orriKop = orriKop + liburuak[i].getOrriKopurua();
                kont++;
            }
        }
        System.out.println();
        System.out.printf("Liburuen batez besteko orri kopurua: %.2f", (double)orriKop / kont);
        System.out.println();
    }

    public static void liburuenPrezioaIrudikatu() { //ALDATUTAKO METODOA
        
        for (int i = 0; i < liburuak.length; i++) {

            if (liburuak[i] != null) { 
                System.out.printf("%35s: %s\n",liburuak[i].getIzenburua(), liburuak[i].getPrezioaIzartxotan());    
            }
        }
    }

    public static void zaharrenaBilatu() { //ALDATUTAKO METODOA
        int max = liburuak[0].getUrtea(), i, pos = 0;
        
        for ( i = 0; i < liburuak.length; i++) {
            if (liburuak[i] != null) { 
                if(liburuak[i].getUrtea() < max){
                    max = liburuak[i].getUrtea();
                    pos = i;
                }    
            }
        }
        System.out.printf("Liburu zaharrena %d urtean argitaratu zen: %s", max, liburuak[pos].toString());
    }

}
