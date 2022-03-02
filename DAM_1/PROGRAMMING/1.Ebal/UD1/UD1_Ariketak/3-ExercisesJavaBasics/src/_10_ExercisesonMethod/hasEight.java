
package _10_ExercisesonMethod;

import java.util.Scanner;

public class hasEight {
    public static void main(String[] args) {
        int num;

        System.out.printf("Enter a number:\n");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if (hasEight(num) == true) {
            System.out.printf("The number contains a 8.\n");
        } else {
            System.out.printf("The number doesn`t contain a 8.\n");
        }
    }

    public static boolean hasEight(int num) {

        boolean result = false;
        int digit;
        
        while(num > 0 && result == false)
        {
            digit = num % 10;
            if(digit == 8)
            {
                result = true;
            }
            else
            {
                num = num / 10;
            }
        }   

        return result;
    }
}
