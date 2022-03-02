
import java.util.ArrayList;
import java.util.Scanner;

public class MetodoInteresgarriak {

    public static void main(String[] args) {
        int num1, num2, num3, faktoreak[];

        Scanner in = new Scanner(System.in);

        System.out.println("Sartu zenbaki bat:");
        num1 = in.nextInt();
        System.out.println("Sartu beste zenbaki bat:");
        num2 = in.nextInt();
        
        System.out.printf("Sartutako zenbakien (%d eta %d)mkt honako hau da : %d\n", num1, num2, mkt(num1, num2));
        
        System.out.println("Sartu zenbaki bat faktoreak jakiteko:\n");
        num3 = in.nextInt();
        faktoreak = faktorizatu(num3);
        /*bukaera = kenduHutzak(faktoreak);*/
        printArray(faktoreak); 
    }

    public static int mkt(int zenb, int zenb2) {
        return (zenb * zenb2) / zkh(zenb, zenb2);
    }

    public static int zkh(int zenb, int zenb2) {
        int hondarra;

        do {
            hondarra = zenb % zenb2;
            zenb = zenb2;
            zenb2 = hondarra;
        } while (hondarra != 0);

        return zenb;
    }
    
    public static int[] faktorizatu(int zenb) {
        ArrayList <Integer> fak = new ArrayList <Integer>();
        
            for (int i = 2; zenb > 1; i++) {
                while (zenb % i == 0) {
                    zenb = zenb / i;
                    fak.add(i);
                }
            }
        
        int faktoreak[] = new int[fak.size()];
        for(int i = 0; i <fak.size(); i++){
            faktoreak[i] = fak.get(i);
        }
        return faktoreak;
    }
    
    public static void printArray(int items[]) 
    {
        System.out.printf("Faktoreak hauek dira: \n");
        for(int i=0; i<items.length; i++)
        {
            System.out.printf("%d ", items[i]);
        }
        System.out.println();
    }
}
