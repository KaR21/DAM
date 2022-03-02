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
public class TriangularPatternC { 
    public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = size; row >= 0; row--)
        {
            for(col = 2*(size - row); col >= 0; col--)
            {
                System.out.printf(" ");
            } 
            for(col = 0; col < row; col++)
            {
                System.out.printf("* ");
            } 
            System.out.printf("\n");
        }
    }
   
} 

/*
public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 0; row < size; row++)
        {
            for(col = row; col < size; col++)
            {
                System.out.printf(" ");
            }
            for(int i = 0; i < size; i++)
            {
                System.out.printf("*");
            }
            System.out.printf("\n");
            
            
        }
        
    }



public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 0; row < size; row++)
        {
            for(col = row; col < size; col++)
            {
                System.out.printf(" ");
            }
            for(int i = 0; i < row + size; i++)
            {
                System.out.printf("* ");
            }
            System.out.printf("\n");
            
            
        }
        
    }



public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 0; row < size; row++)
        {
            for(col = row; col < size; col++)
            {
                System.out.printf(" ");
            }
            for(int i = 0; i < row; i++)
            {
                System.out.printf("* ");
            }
            System.out.printf("\n");
            
            
        }
        
    }



 public static void main(String[] args) {
        int row,col, size;   
        
        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in); 
        size = in.nextInt();
        in.close(); 
        
        for(row = 1; row <= size; row++)
        {
            for(col = 1; col <= size; col++)
            {
                if(row < col)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf(" ");
                }
            }  
            System.out.printf("\n");
        }
    }

*/