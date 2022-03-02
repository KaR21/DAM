package _8_ExercisesonStringandcharOperations;


import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class DecipherCaesarCode {
    public static void main(String[] args) {
        String str;
        char letter;
        int strLen, n;
        
        System.out.printf("Enter a string to encrypt:\n");
        Scanner in = new Scanner(System.in); 
        str = in.next().toUpperCase();
        System.out.printf("Enter a number:\n");
        n = in.nextInt();
        strLen = str.length();
        in.close(); 
        
        for (int i = 0; i < strLen; ++i) 
        {  
            letter = (char)(str.charAt(i) - n);
            System.out.printf("%c", letter);
        }   
        System.out.println();
    }
}
