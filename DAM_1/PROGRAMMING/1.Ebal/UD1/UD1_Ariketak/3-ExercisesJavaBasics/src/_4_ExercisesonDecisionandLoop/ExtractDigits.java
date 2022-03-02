package _4_ExercisesonDecisionandLoop;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class ExtractDigits {

    public static void main(String[] args) {
        int n = 15423;
        
        while (n > 0) {
            int digit = n % 10; // Extract the least-significant digit
            // Print this digit
            System.out.printf("%d ", digit);

            n = n / 10;  // Drop the least-significant digit and repeat the loop
        }
    }
}
