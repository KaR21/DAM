package _8_ExercisesonStringandcharOperations;


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
public class TestPalindromicWord {
    public static void main(String[] args) {
        String str;
        char[] array;
        boolean result = false;
        
        System.out.printf("Enter a string:\n");
        Scanner in = new Scanner(System.in); 
        str = in.nextLine();
        in.close(); 

        array = str.toCharArray(); 
        result = isPalindrome(array);
        
        if(result)
        {
            System.out.printf("It is palindrome.");
        }
        else
        {
            System.out.printf("It is not palindrome.");
        }
        System.out.println();
    }
    public static boolean isPalindrome(char[] Word){
        int i = 0;
        int j = Word.length - 1;
        
        while (j > i) {
            if (Word[i] != Word[j]) {
                return false;
            }
            ++i;
            --j;
    }
    return true;
}
}
