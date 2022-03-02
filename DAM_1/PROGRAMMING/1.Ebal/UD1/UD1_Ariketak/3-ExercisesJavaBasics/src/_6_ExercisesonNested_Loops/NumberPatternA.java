package _6_ExercisesonNested_Loops;


import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class NumberPatternA {
    public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 0; row < size; row++)
        {
            for(col = 0; col <= row; col++)
            {
                System.out.printf("%d ", col+1);
            }
            System.out.printf("\n");
        }
    }
}
