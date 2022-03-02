
package _10_ExercisesonMethod;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {

        final int NUM_ITEMS1, NUM_ITEMS2;
        int array1[], array2[];
        boolean swap = false;

        System.out.printf("Enter the length:\n");
        Scanner in = new Scanner(System.in);
        NUM_ITEMS1 = in.nextInt();
        NUM_ITEMS2 = in.nextInt();

        array1 = new int[NUM_ITEMS1];
        array2 = new int[NUM_ITEMS2];

        if (array1.length > 0) {

            for (int i = 0; i < array1.length; ++i) {
                System.out.printf("Enter a number (%d. Array 1):\n", i + 1);
                array1[i] = in.nextInt();
            }
            for (int i = 0; i < array2.length; ++i) {
                System.out.printf("Enter a number (%d. Array 2):\n", i + 1);
                array2[i] = in.nextInt();
            }
        }
        in.close();
        
        System.out.printf("The original arrays are:\n");
        printArray(array1);
        printArray(array2);
        if(array1.length == array2.length)
        {
            swap = swap(array1, array2);
            if(swap == true)
            {
                System.out.printf("The arrays swaped correctly and they are:\n");
                printArray(array1);
                printArray(array2);
            }
            else
            {
                System.out.printf("The arrays not swaped correctly.\n");
            }
        }
        else
        {
            System.out.printf("The arrays not swaped correctly.\n");
        }
        
    }
    public static void printArray(int items[]) {
        System.out.printf("The array you have entered is: \n");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d ", items[i]);
        }
        System.out.println();
    }
    public static boolean swap(int[] array1, int[] array2)
    {
        boolean swap = false;
        int item1, item2, temp;
        int array1Copy[], array2Copy[];
        
        array1Copy = copyOf(array1);
        array2Copy = copyOf(array2);
        
        for(int i = 0; i < array1.length; i++){
            item1 = array1[i];
            item2 = array2[i];
            
            temp = item1;
            item1 = item2;
            item2 = temp;
            
            array1[i] = item1;
            array2[i] = item2;
        }
        
        if(Arrays.equals(array1Copy, array2) && Arrays.equals(array2Copy, array1))
        {
            swap = true;
        }
        
        return swap;
    }
    public static int[] copyOf(int[] array) {
        int arrayCopy[];
        Scanner in = new Scanner(System.in);

        arrayCopy = new int[array.length];
        for (int j = 0; j < array.length; j++) {
            arrayCopy[j] = array[j];
        }
        return arrayCopy;
    }
}
