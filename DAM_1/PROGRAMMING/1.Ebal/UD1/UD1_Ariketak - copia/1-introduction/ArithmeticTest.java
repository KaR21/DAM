/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class ArithmeticTest {
    public static void main(String[] args) {
      int number1 = 98; // Declare an int variable number1 and initialize it to 98
      int number2 = 5, number3 = 77;  // Declare an int variable number2 and initialize it to 5
      int sum, sumthree, productthree, difference, product, quotient, remainder;  // Declare 5 int variables to hold results
   
      // Perform arithmetic Operations
      sumthree = number1 + number2 + number3;
      productthree = number1*number2*number3;
      
       sum = number1 + number2;
      difference = number1 - number2;
      product = number1 * number2;
      quotient = number1 / number2;
      remainder = number1 % number2;
  
      // Print results
      System.out.print("The sum, difference, product, quotient and remainder of " + number1 + " and " + number2 + " are " + sum + ", " + difference + ", " + product + ", " + quotient);
      System.out.print(", and ");
      System.out.println(remainder);
   
      ++number1;  // Increment the value stored in the variable "number1" by 1
                  // Same as "number1 = number1 + 1"
      --number2;  // Decrement the value stored in the variable "number2" by 1
                  // Same as "number2 = number2 - 1"
      System.out.println("number1 after increment is " + number1);  // Print description and variable
      System.out.println("number2 after decrement is " + number2);
      quotient = number1 / number2; 
      System.out.println("The new quotient of " + number1 + " and " + number2 
            + " is " + quotient);
      
      //the sum of 31 times of number1 and 17 times of number2
      sum = (31*number1) + (17*number2);
      System.out.print("the sum of 31 times of number1 and 17 times of number2 is =" + sum);
      
      System.out.print("The sum and the product of " + (number1-1) + " and " + (number2 + 1) + " are " + sumthree + " and " + productthree);
   }
}
