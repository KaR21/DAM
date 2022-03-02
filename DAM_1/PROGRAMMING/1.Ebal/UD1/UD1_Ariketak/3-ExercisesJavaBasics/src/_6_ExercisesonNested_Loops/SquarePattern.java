
package _6_ExercisesonNested_Loops;


import java.util.Scanner;

/**
 *
 * @author elorza.karmele
 */
public class SquarePattern {
    public static void main(String[] args) {
        int row,col, number;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        number = in.nextInt();
        in.close(); 
        
        for(row = 0; row < number; row++)
        {
            for(col = 0; col < number; col++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
        
        row = 0;
        while(row < number)
        {
            col = 0;
            while(col < number)
            {
                System.out.printf("*");
                col++;
            }
            System.out.printf("\n");
            row++;
        }
    }
}
