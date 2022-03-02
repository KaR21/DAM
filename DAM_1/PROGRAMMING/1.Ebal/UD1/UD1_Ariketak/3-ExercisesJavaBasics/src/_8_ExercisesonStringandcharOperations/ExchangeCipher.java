package _8_ExercisesonStringandcharOperations;


import java.util.Scanner;



/**
 *
 * @author elorza.karmele
 */
public class ExchangeCipher {
    public static void main(String[] args) {
        int AZ_TARTEA = 25;
        String str;
        char encrypt;
        int strLen, letter;
        
        System.out.printf("Enter a string to encrypt:\n");
        Scanner in = new Scanner(System.in); 
        str = in.next().toUpperCase();
        strLen = str.length();
        in.close(); 
        
        for (int i = 0; i < strLen; ++i) 
        {  
            letter = (int)(str.charAt(i));
            //'A' + 'Z' == 'B' + 'Y' == 'C' + 'X' == 'D' + 'W' == 'E' + 'V' == 'F' + 'U' == 'G' + 'T' == 'H' + 'S' == 'I' + 'R' == 'J' + 'Q' == 'K' + 'P' == 'L' + 'O' == 'M' + 'N' == 'N' + 'M' == 'O' + 'L' == 'P' + 'K' == 'Q' + 'J' == 'R' + 'I' == 'S' + 'H' == 'T' + 'G' == 'U' + 'F' == 'V' + 'E' == 'W' + 'D' == 'X' + 'C' == 'Y' + 'B' == 'Z' + 'A' == letter + encrypt;
            //Hence, cipherTextChar = 'A' + 'Z' - plainTextChar
        }   
        System.out.println();
    }
}
