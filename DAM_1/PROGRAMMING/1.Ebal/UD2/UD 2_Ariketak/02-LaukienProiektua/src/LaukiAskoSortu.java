
import java.util.Scanner;


public class LaukiAskoSortu {
    public static void main(String[] args) {
        int laukiKop, zabalera, altuera;
        Scanner in = new Scanner(System.in);
        
        laukiKop = in.nextInt();
        Laukia laukiak[] = new Laukia[laukiKop];
        
        for(int i = 0; i < laukiKop; i++)
        {
            System.out.printf("Sartu %d. laukia:\n", i);
            System.out.printf("Zabalera: ");
            zabalera = in.nextInt();

            System.out.printf("Altuera: ");
            altuera = in.nextInt();
            
            laukiak[i] = new Laukia(zabalera, altuera);
        }
        System.out.printf("Laukia\tZabalera\tAltuera\tAzalera\tPerimetroa\tMota\n");
        System.out.printf("================================================================\n");
        for(int i = 0; i < laukiKop; i++)
        {
            System.out.printf("%d\t%d\t\t%d\t%d\t%d\t\t%s\n", i,laukiak[i].getZabalera(), laukiak[i].getAltuera(),laukiak[i].getAzalera(), laukiak[i].getPerimetroa(), laukiak[i].getMota());
        }
    }
}