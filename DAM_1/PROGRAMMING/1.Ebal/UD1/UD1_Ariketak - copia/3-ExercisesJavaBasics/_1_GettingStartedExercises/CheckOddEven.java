package _1_GettingStartedExercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class CheckOddEven {
    public static void main(String[] args) {  // Program entry point
      int number = 49;       // Set the value of "number" here!
      System.out.println("The number is " + number);
      if (number % 2 == 0) {
         System.out.println("Even number");   // even number
      } else {
         System.out.println("Odd number");   // odd number
      }
      System.out.println("BYE");
   }
}
