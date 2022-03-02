
/**
 *
 * @author elorza.karmele
 */
public class RunningNumberSquareSum { //find the sum of the square of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 +... (Hint: Modify the sum = sum + number statement. Ans: 338350)
    public static void main(String[] args) {
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 100;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         sum = sum + (number * number);  // Accumulate number into sum
         ++number;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }
}
