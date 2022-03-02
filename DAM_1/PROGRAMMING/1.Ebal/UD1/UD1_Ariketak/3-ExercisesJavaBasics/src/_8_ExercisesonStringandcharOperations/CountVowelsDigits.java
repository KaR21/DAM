package _8_ExercisesonStringandcharOperations;




import java.util.Scanner;


/**
 *
 * @author elorza.karmele
 */
public class CountVowelsDigits {
    public static void main(String[] args) {
        String str;
        char letter;
        int strLen, vowel = 0, digit = 0;   
        
        Scanner in = new Scanner(System.in); 
        str = in.next();
        strLen = str.length();
        in.close(); 
        
        for (int charIdx = 0; charIdx < strLen; ++charIdx) 
        {  
            letter = str.charAt(charIdx);
            if((letter == 'A')||(letter == 'a')|| (letter == 'E')||(letter == 'e') || (letter == 'I')||(letter == 'i')|| (letter == 'O')||(letter == 'o') || (letter == 'U')||(letter == 'u'))
            {
                vowel++;
            }
            if(letter >= 48 && letter <= 57)
            {
                digit++;
            }
            
        }
        System.out.printf("%s = %d (vowels percentage = %.2f%%) and %d (digits percentage = %.2f%%)", str,vowel,(float)(100*vowel)/strLen, digit, (float)(100*digit)/strLen);
        System.out.println();
    }
}
