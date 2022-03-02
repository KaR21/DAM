package _8_ExercisesonStringandcharOperations;


import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class ReverseString {
    public static void main(String[] args) {
        String str;
        char letter;
        int strLen;   
        
        Scanner in = new Scanner(System.in); 
        str = in.next();
        strLen = str.length();
        in.close(); 
        
        for (int charIdx = strLen - 1; charIdx >= 0; --charIdx) 
        {  
            letter = str.charAt(charIdx);
            System.out.printf("%c", letter);
        }
        System.out.println();
    }
}
