package _10_ExercisesonMethod;

import java.util.Scanner;
import java.util.Arrays;

public class equals {

    public static void main(String[] args) {

        final int NUM_ITEMS1, NUM_ITEMS2;
        int array1[], array2[];
        boolean equal = false;

        System.out.printf("Enter the length:\n");
        Scanner in = new Scanner(System.in);
        NUM_ITEMS1 = in.nextInt();
        NUM_ITEMS2 = in.nextInt();

        array1 = new int[NUM_ITEMS1];
        array2 = new int[NUM_ITEMS2];

        if (array1.length > 0 && array2.length > 0 && array1.length == array2.length) {

            for (int i = 0; i < array1.length; ++i) {  // Read all items
                System.out.printf("Enter a character (Array1) (%d):\n", i + 1);
                array1[i] = in.nextInt();
            }
            for (int j = 0; j < array2.length; ++j) {  // Read all items
                System.out.printf("Enter a character (Array2) (%d):\n", j + 1);
                array2[j] = in.nextInt();
            }
            equal = equals(array1, array2);
        }

        in.close();
     
        if(equal == true){
            System.out.printf("The arrays you enter are equals.\n");
        }
        else{
            System.out.printf("The arrays you enter are not equals.\n");
        }
    }
    public static boolean equals(int[] array1, int[] array2){
        boolean equal = false;
        
        if(Arrays.equals(array1, array2))
        {
            equal = true;
        }
        
        return equal;
    }
}
