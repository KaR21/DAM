package _6_ExercisesonNested_Loops;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class TimeTable {
    public static void main(String[] args) {
        int row,col, number;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        number = in.nextInt();
        in.close(); 
        
        for(row = -1; row <= number; row++)
        {
            if (row == -1) {
                System.out.print("*     |");
            }
            else if (row == 0) {
                System.out.print("------------");
            }
            else if (row > 0) {                    
                System.out.printf("%4d  |", row);    
            }
            
            for(col = 1; col <= number; col++)
            {  
                if (row == -1) {
                    System.out.printf("  %4d", col);
                    continue;
                }
                else if (row == 0) {
                    System.out.print("--------");
                    continue;
                }
                
                System.out.printf("  %4d", row * col);
            }
            System.out.println();
        }
        System.out.printf("\n\n");
    }
}