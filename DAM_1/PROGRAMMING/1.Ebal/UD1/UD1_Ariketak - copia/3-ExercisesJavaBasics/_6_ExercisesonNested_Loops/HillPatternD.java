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
public class HillPatternD {

    public static void main(String[] args) {
        int row, col, size;

        System.out.printf("Enter a number:");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        in.close();

        for (row = 1; row <= size; row++) {
            for (col = row; col <= size; col++) {
                System.out.print("*");
            }
            for (col= 1; col <= (2 * row - 2); col++) {
                System.out.print(" ");
            }
            for (col = row; col <= size; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (row = 1; row <= size; row++) {
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            for (col = (2 * row - 2); col < (2 * size - 2);col++) {
                System.out.print(" ");
            }
            for (col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

