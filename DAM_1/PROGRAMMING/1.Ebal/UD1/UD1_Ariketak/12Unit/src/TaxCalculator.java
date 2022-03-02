/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
import java.util.Scanner;   // For keyboard input
public class TaxCalculator {
    
public static void main(String[] args) {
      // Declare constants first (variables may use these constants)
      final double TAX_RATE_ABOVE_20K = 0.1;
      final double TAX_RATE_ABOVE_40K = 0.2;
      final double TAX_RATE_ABOVE_60K = 0.3;

      // Declare variables
      int taxableIncome;
      double taxPayable;

      // Prompt and read inputs as "int"
      Scanner teklatua = new Scanner(System.in);
      System.out.print("Enter the taxable income: $");
      taxableIncome = teklatua.nextInt();
      teklatua.close();

      // Compute tax payable in "double" using a nested-if to handle 4 cases
      if (taxableIncome <= 20000) {         // [0, 20000]
         taxPayable = 0;
      } else if (taxableIncome <= 40000) {  // [20001, 40000]
         taxPayable = (taxableIncome - 20000) * TAX_RATE_ABOVE_20K;
      } else if (taxableIncome <= 60000) {  // [40001, 60000]
         taxPayable = 20000 * TAX_RATE_ABOVE_20K
                      + (taxableIncome - 40000) * TAX_RATE_ABOVE_40K;
      } else {                              // >=60001
         taxPayable = 20000 * TAX_RATE_ABOVE_20K
                      + 20000 * TAX_RATE_ABOVE_40K
                      + (taxableIncome - 60000) * TAX_RATE_ABOVE_60K;
      }

      // Alternatively, you could use the following nested-if conditions
      // but the above follows the table data
      //if (taxableIncome > 60000) {          // [60001, ]
      //   ......
      //} else if (taxableIncome > 40000) {   // [40001, 60000]
      //   ......
      //} else if (taxableIncome > 20000) {   // [20001, 40000]
      //   ......
      //} else {                              // [0, 20000]
      //   ......
      //}

      // Print result rounded to 2 decimal places
      System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
   }
}
   
