package _5_ExercisesonInputDecisionandLoop;


/**
 *
 * @author elorza.karmele
 */
import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        int inNumber;   
        int inDigit;   
        
        Scanner in = new Scanner(System.in); 
        inNumber = in.nextInt();
        in.close(); 
        System.out.printf("The reverse number is : ");
        while (inNumber > 0) {
            inDigit = inNumber % 10; 
            System.out.printf("%d", inDigit);
            inNumber /= 10;   
        }
    }
}
