
/**
 *
 * @author elorza.karmele
 */
public class RunningNumberMod7Sum { //all the numbers between 1 to 1000 that are divisible by 7. 
    //(Hint: Modify the initialization statement to begin from 7 and post-processing statement to increment by 7. Ans: 71071)
    public static void main(String[] args) {
      final int LOWERBOUND = 7;      // Store the lowerbound
      final int UPPERBOUND = 1000;   // Store the upperbound
      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
                     // Set the initial sum to 0
      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
      int number = LOWERBOUND;
      while (number <= UPPERBOUND) {
            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
         sum = sum + number;  // Accumulate number into sum
         number = number + 7;            // increment number
      }
      // Print the result
      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
   }
}
