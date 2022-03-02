package _6_ExercisesonNested_Loops;


import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class NumberPatternD {
    public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = size; row > 0; row--)
        {
            for(col = 0; col < row; col++)
            {
                System.out.printf("%d ", row - col);
            }
            System.out.printf("\n");
        }
    }
}
