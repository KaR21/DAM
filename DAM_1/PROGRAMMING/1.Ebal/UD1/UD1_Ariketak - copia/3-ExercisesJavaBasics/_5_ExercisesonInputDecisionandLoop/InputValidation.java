package _5_ExercisesonInputDecisionandLoop;


import java.util.Scanner;

/**
 *
 * @author elorza.karmele
 */

public class InputValidation {
    public static void main(String[] args) {
        int numberIn; 
        boolean isValid;
        
        Scanner in = new Scanner(System.in); 
        isValid = false; 
        do
        {
            numberIn = in.nextInt();    
            if((numberIn < 0 || numberIn > 10) && (numberIn < 90 || numberIn > 100))
            {
                System.out.printf("Invalid input, try again...\n");
            }
            else
            {
                isValid = true;
            }
        }while (!isValid);
        
        in.close(); 
        System.out.printf("You have entered: %d\n", numberIn);
            
    }
}
