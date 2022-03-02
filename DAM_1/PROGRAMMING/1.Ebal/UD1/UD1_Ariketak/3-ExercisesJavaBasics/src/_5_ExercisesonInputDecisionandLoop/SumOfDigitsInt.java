package _5_ExercisesonInputDecisionandLoop;


import java.util.Scanner;



/**
 *
 * @author elorza.karmele
 */
public class SumOfDigitsInt {
    public static void main(String[] args) {
        int inNumber;   
        int inDigit, sum = 0;   
        
        Scanner in = new Scanner(System.in); 
        inNumber = in.nextInt();
        in.close(); 
        while (inNumber > 0) {
            inDigit = inNumber % 10; 
            sum = sum + inDigit;
            inNumber /= 10;   
        }
        System.out.printf("The sum of the digits is: %d", sum);
        System.out.println();
    }
}
