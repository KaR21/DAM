package _10_ExercisesonMethod;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {
        int num = 0, sum = 0;
        final int SENTINEL = -1;

        Scanner in = new Scanner(System.in);
        while (num != SENTINEL) {
            System.out.printf("Enter a number:\n");
            num = in.nextInt();
            if (hasEight(num) == true) {
                sum = sum + num;
            }
        }
        System.out.printf("The magic sum is: %d\n", sum);
    }

    public static boolean hasEight(int num) {

        boolean result = false;
        int digit;

        while (num > 0 && result == false) {
            digit = num % 10;
            if (digit == 8) {
                result = true;
            } else {
                num = num / 10;
            }
        }

        return result;
    }
}
