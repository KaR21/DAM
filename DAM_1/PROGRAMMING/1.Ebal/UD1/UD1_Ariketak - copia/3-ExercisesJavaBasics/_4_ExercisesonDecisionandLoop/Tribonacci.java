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
public class Tribonacci {
    public static void main (String[] args) {
        int n = 4;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fn;             // F(n) to be computed
        int fnMinus1 = 2;   // F(n-1), init to F(2)
        int fnMinus2 = 1;
        int fnMinus3 = 1;// F(n-2), init to F(1)
        int nMax = 20;      // maximum n, inclusive
        int sum = fnMinus1 + fnMinus2 + fnMinus3;  // Need sum to compute average
        double average;
        

        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.println(fnMinus2);
        System.out.println(fnMinus3);
        System.out.println(fnMinus1);

        while (n <= nMax) {  // n starts from 3
            // n = 3, 4, 5, ..., nMax
            // Compute F(n), print it and add to sum
            // Increment the index n and shift the numbers for the next iteration
            fn = fnMinus1 + fnMinus2 + fnMinus3;
            sum = sum + fn;
            fnMinus3 = fnMinus2;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
            ++n;
            System.out.println(fn);
        }
        average = sum / nMax;
        System.out.printf("The average is: %f\n", average);
        // Compute and display the average (=sum/nMax).
        // Beware that int/int gives int.
      
   }
}
