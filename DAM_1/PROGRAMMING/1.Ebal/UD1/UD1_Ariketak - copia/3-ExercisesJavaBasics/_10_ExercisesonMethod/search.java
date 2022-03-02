package _10_ExercisesonMethod;

import java.util.Scanner;

public class search {

    public static void main(String[] args) {
        int[] zen;
        int zenbakia, NUM_ITEMS, i = 0, answer;

        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the length of the list:\n");
        NUM_ITEMS = in.nextInt();

        zen = new int[NUM_ITEMS];

        if (zen.length > 0) {

            for (i = 0; i < zen.length; ++i) {
                System.out.printf("Enter a number (%d):\n", i + 1);
                zen[i] = in.nextInt();
            }
        }

        System.out.printf("Enter a number to search it on the list:\n");
        zenbakia = in.nextInt();
        in.close();

        answer = search(zen, zenbakia);
        System.out.printf("The answer is: %d.\n", answer);
    }

    public static boolean contains(int[] array, int key) {
        int i = 0;
        boolean aurkituta = false;

        while (i < array.length && aurkituta == false) {
            if (array[i] == key) {
                aurkituta = true;
            }
            i++;
        }
        return aurkituta;
    }

    public static int search(int[] array, int key) {
        if (contains(array, key)) {
            return array[0];
        } else {
            return -1;
        }
    }
}
