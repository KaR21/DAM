package _5_ExercisesonInputDecisionandLoop;


import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class AverageWithInputValidation {
    public static void main(String[] args) {
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;   
        int sum = 0;
        double average;

        Scanner in = new Scanner(System.in); 
        
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            System.out.printf("Enter the mark (0-100) for student %d\n", studentNo);
            isValid = false;    
            do 
            {
                numberIn = in.nextInt();    
                if(numberIn < 0 || numberIn > 100)
                {
                    System.out.printf("Invalid input, try again...\n");
                }
                else
                {
                    isValid = true;
                }
            } while (!isValid);

            sum += numberIn;
        }
        average = (double)sum/NUM_STUDENTS;
        in.close(); 
        System.out.printf("Sum of the marks: %.2f\n", average);
            
    }
}

