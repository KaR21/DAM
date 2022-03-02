package exekutagarriak;

import java.util.Scanner;
import model.Langilea;

public class Seigarrena {

    public static void main(String[] args) {
        Langilea[] langileGuztiak;
        String langilearenIzena;
        int portzentaia, soldataHandienaPos;
        double soldataBerria, urtekoGatuaSoldatetan = 0, soldataHandiena;
        

        langileGuztiak = Langilea.nireHamarLagunLangile();

        System.out.println("-----------------------------------LANGILEAK--------------------------------");
        System.out.printf("%2s %-13s %-12s %15s %21s\n", "ID", "IZENA", "ABIZENA", "SOLDATA", "URTEKO SOLDATA");
        System.out.printf("=============================================================================\n");
        for (int i = 0; i < langileGuztiak.length; i++) {
            System.out.printf("%2d %-13s %-10s %15.2f %15.2f\n", langileGuztiak[i].getId(), langileGuztiak[i].getIzena(), langileGuztiak[i].getAbizena(), langileGuztiak[i].getSoldata(), langileGuztiak[i].getUrtekoSoldata());
        }
        System.out.println();
        System.out.println("Sartu bilatu nahi duzun langilearen izena:");
        Scanner in = new Scanner(System.in);
        langilearenIzena = in.next();
        Langilea langileBat = Langilea.bilatu(langileGuztiak, langilearenIzena);
        if (langileBat == null) {
            System.out.println("Langile hori ez da existitzen.");
        } else {
            System.out.println(langileBat);
            System.out.println("Sartu langilearen soldataren igoera (portzentaia):");
            portzentaia = in.nextInt();
            soldataBerria = langileBat.soldataIgo(portzentaia);
            langileBat.setSoldata(soldataBerria);
            printStringArray(langileGuztiak);
        }

        for (int i = 0; i < langileGuztiak.length; i++) {
            System.out.println(langileGuztiak[i].getUrtekoSoldata());
            urtekoGatuaSoldatetan = urtekoGatuaSoldatetan + langileGuztiak[i].getUrtekoSoldata();
        }
        System.out.printf("Urtean gastatutako kopurua langileen soldatetan honako hau da: %.2f\n", urtekoGatuaSoldatetan);
        
        soldataHandienaPos = 0;
        soldataHandiena = langileGuztiak[0].getUrtekoSoldata();
        for(int i = 1; i < langileGuztiak.length; i++){ 
            if(langileGuztiak[i].getUrtekoSoldata() > soldataHandiena)
            {
                soldataHandiena = langileGuztiak[i].getUrtekoSoldata();
                soldataHandienaPos = i;
            }
        }
        
        System.out.println("Soldata handiena duen langilea hau da: " + langileGuztiak[soldataHandienaPos]);
        //bi berdin egonez gero,lehen aurkitutakoa printeatuko du.
    }

    public static void printStringArray(Langilea items[]) {
        System.out.printf("Langileen arraia hau da: \n");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        System.out.println();
    }
}
