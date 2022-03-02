package _4_ExercisesonDecisionandLoop;


/**
 *
 * @author elorza.karmele
 */
public class HarmonicSum {

    public static void main(String[] args) {
        // Define variables
        final int MAX_DENOMINATOR = 50000;  // Use a more meaningful name instead of n
        double sumL2R;         // Sum from left-to-right
        double sumR2L = 0.0;         // Sum from right-to-left
        double absDiff;              // Absolute difference between the two sums
        
        sumL2R= 1;
        // for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
            // Beware that int/int gives int, e.g., 1/2 gives 0.
            sumL2R = sumL2R + (1/denominator);
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);
        
        for (int denominator = MAX_DENOMINATOR; denominator >= 1; --denominator) {
            // denominator = 1, 2, 3, 4, 5, ..., MAX_DENOMINATOR
            // Beware that int/int gives int, e.g., 1/2 gives 0.
            sumR2L = sumR2L + (1/denominator);
        }
        sumR2L = sumR2L + 1;
        System.out.println("The sum from right-to-left is: " + sumR2L);
        // for-loop for summing from right-to-left

        // Find the absolute difference and display
        if (sumL2R > sumR2L) {
            absDiff = sumL2R - sumR2L;
        }
        else 
        {
            absDiff = sumR2L - sumL2R;
        }
        System.out.printf("The the absolute difference between the numbers is: %f\n", absDiff);
    }
}
