package _10_ExercisesonMethod;

import java.util.Scanner;

public class isOdd {

    public static void main(String[] args) {
        int num;

        System.out.printf("Enter a number:\n");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        if (isOdd(num) == 1) {
            System.out.printf("The number is ODD\n");
        } else {
            System.out.printf("The number is EVEN\n");
        }
    }

    public static int isOdd(int num) {

        int result;

        if (num % 2 == 0) {
            result = 0;
        } else {
            result = 1;
        }

        return result;
    }
}
