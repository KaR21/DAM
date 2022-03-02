package _9_ExercisesonArray;


import java.util.Scanner;



public class printArrayInStars {
    public static void main(String[] args) {

        final int NUM_ITEMS;
        int[] items; 
        
        System.out.printf("Enter the length:\n");
        Scanner in = new Scanner(System.in);
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];
        
        if (items.length > 0) {
      
            for (int i = 0; i < items.length; ++i) 
            {  // Read all items
                System.out.printf("Enter a number (%d):\n", i+1);
                items[i] = in.nextInt();
            }
        }
        in.close();
        System.out.println();
        System.out.printf("The array you have entered is: \n");
        for(int i=0; i<items.length; i++)
        {
            System.out.printf("%d: ", i);
            for(int j=0; j<items[i]; j++)
            {
                System.out.printf("* ");
            }
            System.out.printf("(%d)", items[i]);
            System.out.println();
        }
        System.out.println();
    }
}
