
/**
 *
 * @author elorza.karmele
 */
public class RunningNumberProduct { //compute the product of all the numbers from 1 to 10. (Hint: Use a variable called product instead of sum and initialize product to 1. 
    //Modify the sum = sum + number statement to do multiplication on variable product. Ans: 3628800)
    public static void main(String[] args) {
      final int LOWERBOUND = 1;      // Store the lowerbound
      final int UPPERBOUND = 10;   // Store the upperbound
      int product = 1;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
            product = product * number;
            ++number;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + product);
   }
}
