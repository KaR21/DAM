package _10_ExercisesonMethod;

import java.util.Scanner;

public class copyOf {

    public static void main(String[] args) {

        final int NUM_ITEMS1;
        int array1[], arrayCopy[];

        System.out.printf("Enter the length:\n");
        Scanner in = new Scanner(System.in);
        NUM_ITEMS1 = in.nextInt();

        array1 = new int[NUM_ITEMS1];

        if (array1.length > 0) {

            for (int i = 0; i < array1.length; ++i) {
                System.out.printf("Enter a number (%d):\n", i + 1);
                array1[i] = in.nextInt();
            }
        }
        in.close();
        arrayCopy = copyOf(array1);
        printArray(arrayCopy);
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

    public static void printArray(int items[]) {
        System.out.printf("The array you have entered is: \n");
        for (int i = 0; i < items.length; i++) {
            System.out.printf("%d ", items[i]);
        }
        System.out.println();
    }
}
