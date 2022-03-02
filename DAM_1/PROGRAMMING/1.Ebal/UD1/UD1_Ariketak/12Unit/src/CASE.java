
/**
 *
 * @author elorza.karmele
 */
public class CASE {
    
    public static void main(String[] args)
    {
        // Select arithmetic operation
        char operator = '*';
        int num1 = 5, num2 = 8, result = 0;
        
        switch (operator) {   // "char" selector
           case '+':   // "char" value
              result = num1 + num2; break;
           case '-': 
              result = num1 - num2; break;
           case '*': 
              result = num1 * num2; break;
           case '/': 
              result = num1 / num2; break;
           default:
              System.out.println("Unknown operator");
        }
        System.out.println(result);
        System.out.printf("The result is %d because the numbers are %d and %d\n", result, num1, num2);
        
    }
}
