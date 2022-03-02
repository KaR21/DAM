package _1_GettingStartedExercises;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elorza.karmele
 */
public class PrintDayInWord {
    public static void main(String[] args) {
        int number;  // Set the value of "number" here!
        Scanner teklatua = new Scanner(System.in);
        System.out.println("Sartu zenbaki bat 1 - 7 tartean.");
        number = teklatua.nextInt();
      // Using nested-if
        if (number == 1) {   // Use == for comparison
            System.out.println("ASTELEHENA");
        } else if (number == 2) {
            System.out.println("ASTEARTEA");
        } else if ( number == 3 ) {
            System.out.println("AZTEAZKENA");
        } else if (number == 4) {
            System.out.println("OSTEGUNA");
        } else if ( number == 5 ) {
            System.out.println("OSTIRALA");
        } else if (number == 6) {
            System.out.println("LARUNBATA");
        } else if ( number == 7 ) {
            System.out.println("IGANDEA");
        } else {
            System.out.println("Gaizki sartu duzu zenbakia.");
        }
 
      // Using switch-case-default
        switch(number) {
            case 1: 
                System.out.println("ASTELEHENA"); break;  // Don't forget the "break" after each case!
            case 2: 
                System.out.println("ASTEARTEA"); break;
            case 3: 
                System.out.println("AZTEAZKENA"); break;  // Don't forget the "break" after each case!
            case 4: 
                System.out.println("OSTEGUNA"); break;
            case 5: 
                System.out.println("OSTIRALA"); break;  // Don't forget the "break" after each case!
            case 6: 
                System.out.println("LARUNBATA"); break;
            case 7: 
                System.out.println("IGANDEA"); break;  // Don't forget the "break" after each case!

            default: System.out.println("Gaizki sartu duzu zenbakia."); 
      }
   }
}
