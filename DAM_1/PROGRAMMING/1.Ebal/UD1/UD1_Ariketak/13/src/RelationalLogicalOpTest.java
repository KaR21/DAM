
/**
 *
 * @author elorza.karmele
 */

// Given the year, month (1-12), and day (1-31), write a boolean expression which returns true for dates before October 15, 1582 (Gregorian calendar cut-over date).
//Ans: (year < 1582) || (year == 1582 && month < 10) || (year == 1582 && month == 10 && day < 15)
import java.util.*;
public class RelationalLogicalOpTest {
     public static void main(String[] args) {
        boolean erantzuna = false;
        
        Scanner teklatua = new Scanner(System.in);
        int urtea, hilabetea, eguna;
        
        System.out.println("Sartu urtea");
        urtea = teklatua.nextInt();
        System.out.println("Sartu hilabetea");
        hilabetea = teklatua.nextInt();
        System.out.println("Sartu eguna");
        eguna = teklatua.nextInt();
        
        if((urtea <= 1582) && (hilabetea <= 10) && (eguna < 15))
        {
            erantzuna = true;
        }

        System.out.println("Erantzuna = " + erantzuna);
    }
}
