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
public class BoxPatternA {
    public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 0; row < size; row++)
        {
            for(col = 0; col < size; col++)
            {
                if (row == 0 || row == size-1 || col == 0 || col == size-1)
                {
                    System.out.printf("*");
                }
                else{
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
    }
}
