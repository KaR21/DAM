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
public class CheckerPattern {
    public static void main(String[] args) { 
        int row, col, number;
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        number = in.nextInt();
        in.close(); 
        for(row = 0; row < number; row++)
        {
            for(col = 0; col < number*2; col++){
                if((row % 2) == 0 && (col % 2)== 0){
                System.out.print("*"); 
                }
                else{
                    if((row % 2) != 0 && (col % 2)!= 0){
                        System.out.print("*"); 
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        
        // -------------------------------------------------- mal
        for (row = 1; row <= number; row++) { 
            for (col = 1; col <= number; col++) {  
                if ((row % 2) == 0) 
                {   System.out.print(" ");
               
                }
                System.out.print("#");  

            }
         System.out.println();
        }
    }
}
