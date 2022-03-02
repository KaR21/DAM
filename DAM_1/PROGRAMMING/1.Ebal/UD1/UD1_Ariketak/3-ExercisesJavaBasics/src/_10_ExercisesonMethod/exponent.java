package _10_ExercisesonMethod;

import java.util.Scanner;

public class exponent {

    public static void main(String[] args) {
        int exp, base;
        
        System.out.printf("Enter the number of the base:\n");
        Scanner in = new Scanner(System.in);
        base = in.nextInt();
        
        System.out.printf("Enter the number of the exp:\n");
        exp = in.nextInt();
        
        System.out.println(base + " raises to the power of " + exp + " is: " + exponent(base, exp));
    }

    public static int exponent(int base, int exp) {

        int result = 1;
        
        /*result = (int) Math.pow(base, exp);
        System.out.printf("%d\n", result);*/
        for(int i = 0; i< exp; i++)
        {
            result = result * base;
        }
        //System.out.printf("%d\n", result);
        return result;
    }
}
