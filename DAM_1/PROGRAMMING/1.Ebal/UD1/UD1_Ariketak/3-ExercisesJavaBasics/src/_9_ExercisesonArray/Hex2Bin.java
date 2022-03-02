package _9_ExercisesonArray;


import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
      // Define variables
      String hexStr;     // The input hexadecimal String
      int hexStrLen;     // The length of hexStr
      char hexChar;      // Each char in the hexStr
      String binStr =""; // The equivalent binary String, to accumulate from an empty String
      // Lookup table for the binary sub-string corresponding to Hex digit '0' (index 0) to 'F' (index 15)
      final String[] BIN_STRS =
         {"0000", "0001", "0010", "0011",
          "0100", "0101", "0110", "0111",
          "1000", "1001", "1010", "1011",
          "1100", "1101", "1110", "1111"};

      // Prompt and read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Hexadecimal string: ");
      hexStr = in.next();
      hexStrLen = hexStr.length();
      in.close();

      // Process the string from the left (most-significant hex digit)
      for (int charIdx = 0; charIdx < hexStrLen; ++charIdx) {
         hexChar = hexStr.charAt(charIdx);
         if (hexChar >= '0' && hexChar <= '9') {
            binStr += BIN_STRS[hexChar - '0'];  // index into the BIN_STRS array and concatenate
         } else if (hexChar >= 'a' && hexChar <= 'f') {
            binStr += BIN_STRS[hexChar - 'a' + 10];
         } else if (hexChar >= 'A' && hexChar <= 'F') {
            binStr += BIN_STRS[hexChar - 'A' + 10];
         } else {
            System.err.println("error: invalid hex string \"" + hexStr + "\"");
            return;   // or System.exit(1);
         }
      }
      System.out.println("The equivalent binary for \"" + hexStr + "\" is \"" + binStr + "\"");
   }
    /*public static void main(String[] args) {
        
      // Declare variables
      String hexStr;   // The input hexadecimal String
      int hexStrLen;   // The length of hexStr
      int dec = 0, bin[], i = 0, len;     // The decimal equivalent, to accumulate from 0

      // Prompt and Read input as "String"
      Scanner in = new Scanner(System.in);
      System.out.print("Enter a Hexadecimal string: ");
      hexStr = in.next();
      hexStrLen = hexStr.length();
      in.close();

      // Process char by char from the left (most-significant digit)
      for (int charIdx = 0; charIdx < hexStrLen; ++charIdx) {
         char hexChar = hexStr.charAt(charIdx);
         int expFactor = (int)Math.pow(16, hexStrLen - 1 - charIdx);
         // 23 cases: '0'-'9', 'a'-'f', 'A'-'F', other (error)
         if (hexChar == '0') {
            // Valid but do nothing
         } else if (hexChar >= '1' && hexChar <= '9') {
            dec += (hexChar - '0') * expFactor;   // Convert char '0'-'9' to int 0-9
         } else if (hexChar >= 'a' && hexChar <= 'f') {
            dec += (hexChar - 'a' + 10) * expFactor;  // Convert char 'a'-'f' to int 10-15
         } else if (hexChar >= 'A' && hexChar <= 'F') {
            dec += (hexChar - 'A' + 10) * expFactor;  // Convert char 'A'-'F' to int 10-15
         } else {
            System.out.println("error: invalid hex string \"" + hexStr + "\"");
            return;   // or System.exit(1);
         }
      }
      System.out.println("The equivalent decimal for \"" + hexStr + "\" is " + dec);
      
      bin = new int[1000];
      
        while(dec > 0)
        {
            bin[i] = dec % 2;
            dec = dec / 2;
            i++;
        }
      
      for(int j=0; j<i; j++)
        {
            System.out.printf("%d \n", bin[j]);
        }
   }*/
}