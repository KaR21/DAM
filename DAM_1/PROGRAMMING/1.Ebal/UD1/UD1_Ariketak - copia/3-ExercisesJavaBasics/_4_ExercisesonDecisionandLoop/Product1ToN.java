package _4_ExercisesonDecisionandLoop;


/**
 *
 * @author elorza.karmele
 */
public class Product1ToN {
    // Define variables
    public static void main(String[] args) {
        int product = 1, i;      // The accumulated product, init to 1
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 10;
        
        for(i = LOWERBOUND; i <= UPPERBOUND; i++)
        {
            product = product * i;
        }
        
        System.out.printf("The product is %d\n", product);
    }
    
    
}
