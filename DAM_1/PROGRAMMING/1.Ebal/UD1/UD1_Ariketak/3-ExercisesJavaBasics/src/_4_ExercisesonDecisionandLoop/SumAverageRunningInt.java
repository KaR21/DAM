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
public class SumAverageRunningInt {

    public static void main(String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        // Use a for-loop to sum from lowerbound to upperbound
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;     // same as "sum = sum + number"
        }
        // Compute average in double. Beware that int / int produces int!
        average = (double)sum / (UPPERBOUND - LOWERBOUND + 1);
        // Print sum and average
        System.out.printf("The sum is %d and the average is %.2f\n", sum, average);

        
        
        sum = 0;
        int number = LOWERBOUND;        // declare and init loop index variable
        while (number <= UPPERBOUND) {  // test
            sum += number;
            ++number;                    // update
        }
         average = (double)sum / (UPPERBOUND - LOWERBOUND + 1);
        System.out.printf("The sum is %d and the average is %.2f\n", sum, average);
        
        
        
        sum = 0;
        number = LOWERBOUND;         // declare and init loop index variable
        do {
           sum += number;
           ++number;                     // update
        } while (number <= UPPERBOUND);  // test
         average = (double)sum / (UPPERBOUND - LOWERBOUND + 1);
        System.out.printf("The sum is %d and the average is %.2f\n", sum, average);
        
        
        
        //What is the difference between "for" and "while-do" loops? What is the difference between "while-do" and "do-while" loops?
                //That in for we know when do it ends but on while ew don´t.
                //That in while-do first we have a condition to enter and on do-while, first it enter to the loop and then it see if is valid the condition for the variable
                
                
        sum = 0;
        int LOWERBOUND2;
        int UPPERBOUND2 = 8899;
        int count = 0;   // Count the number within the range, init to 0
        
        for (LOWERBOUND2 = 111; LOWERBOUND2<=UPPERBOUND2; LOWERBOUND2++) {
            sum = sum + LOWERBOUND2;
            count++;
        }
        
        average = (double)sum / (LOWERBOUND2 - UPPERBOUND2 + 1);
        System.out.printf("The sum is %d and the average is %.2f\n", sum, average);
        
        
        
        sum = 0;
        int i;
        for (i = 1; i <= 100; i++){
            sum =sum + i*i;
        }
        System.out.printf("The sum is %d.\n", sum);
        
        
        
        int sumOdd = 0, sumEven = 0, absDiff;
        for(number = 1; number <= 100; number++)
        {
            if(number % 2 == 0)
            {
                 sumOdd += number;
            }
            else
            {
                 sumEven += number;
            }
        }
        if(sumOdd > sumEven)
        {
            absDiff= sumOdd - sumEven; 
        }
        else
        {
            absDiff= sumEven - sumOdd;
        }
        System.out.printf("The absolute difference between the numbers is %d.\n", absDiff);
    }
}
