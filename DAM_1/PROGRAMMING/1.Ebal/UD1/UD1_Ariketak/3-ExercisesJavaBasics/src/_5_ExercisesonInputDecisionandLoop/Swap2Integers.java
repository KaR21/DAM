package _5_ExercisesonInputDecisionandLoop;


import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class Swap2Integers {
    public static void main(String[] args) {
        // Declare variables
        int number1, number2, aux;  

      
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter first integer: ");  
        number1 = in.nextInt();        
        System.out.print("Enter second integer: ");  
        number2 = in.nextInt(); 
        in.close(); 
        aux = number1;
        number1 = number2;
        number2 = aux;
      // Print results
      System.out.printf("After the swap, first integer is: %d, second integer is: %d\n",number1, number2 );

    }
}
