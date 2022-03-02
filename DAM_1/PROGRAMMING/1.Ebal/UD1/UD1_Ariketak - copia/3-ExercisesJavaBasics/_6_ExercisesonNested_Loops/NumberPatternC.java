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
public class NumberPatternC {
    public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 0; row < size; row++)
        {
            for(col = 2*(size - row); col >= 0; col--)
            {
                System.out.printf(" ");
            } 
            for(col = 0; col <= row; col++)
            {
                System.out.printf("%d ", row - col+1);
            } 
            System.out.printf("\n");
        }
    }
}
