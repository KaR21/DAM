
import java.util.Scanner;

/*
 * A Test Driver for the Date class.
 */
public class TestDate {

    public static void main(String[] args) {
        // Test constructor and toString()
        int urtea, hila, eguna;
        Date d1 = new Date(2020, 12, 4);
    
        System.out.println(d1);  // toString()

        // Test Setters and Getters
        d1.setYear(2020);
        d1.setMonth(12);
        d1.setDay(23);
        System.out.println(d1);  // run toString() to inspect the modified instance
        System.out.println("Year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getDay());

        // Test setDate()
        d1.setDate(2988, 1, 2);
        //d1.setDate(2019, 14, 50);
        System.out.println(d1);  // toString()

        System.out.println("********************************");
        // Test getHilabeteaLetretan
        System.out.println(d1.getHilabeteaLetretan());
        System.out.println(d1.getHilabeteaLetretan("EN"));
        System.out.println("********************************");
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Sar ezazu urtea:");
        urtea = in.nextInt();
        do{
            System.out.println("Sar ezazu hilabetea:");
            hila = in.nextInt();
        }while(hila < 0 || hila > 12);
        do{
            System.out.println("Sar ezazu eguna:");
            eguna = in.nextInt();
        }while(eguna > 31 || eguna < 0);
        
       
        Date n = new Date(urtea, hila, eguna);
        System.out.println("Year is: " + n.getYear());
        System.out.println("Month is: " + n.getMonth());
        System.out.println("Day is: " + n.getDay());
        System.out.println("********************************");
        // Test getHilabeteaLetretan
        System.out.println(n.getHilabeteaLetretan());
        System.out.println(n.getHilabeteaLetretan("EN"));
        System.out.println("********************************");
    }
}