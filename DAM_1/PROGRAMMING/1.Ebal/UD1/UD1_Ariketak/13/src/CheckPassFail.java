/**
 *
 * @author elorza.karmele
 */


/**
 * Trying if-else statement.
 * 
 * Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more than or equal to 50; 
 * or prints "FAIL" otherwise. The program shall always print “DONE” before exiting.
 */
import java.util.*;
public class CheckPassFail {  // Save as "CheckPassFail.java"
   public static void main(String[] args) {  // Program entry point
      int mark;   // Set the value of "mark" here!
      Scanner teklatua = new Scanner(System.in);
      mark = teklatua.nextInt();
      System.out.println("The mark is " + mark);
 
      // if-else statement
      if (mark < 50) {
         System.out.println( "FAIL");
      } else {
         System.out.println( "PASS");
      }
      System.out.println("DONE");
   }
}