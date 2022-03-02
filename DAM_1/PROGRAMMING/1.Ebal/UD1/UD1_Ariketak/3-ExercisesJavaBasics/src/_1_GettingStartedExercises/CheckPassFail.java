package _1_GettingStartedExercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author elorza.karmele
 */
public class CheckPassFail {
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
