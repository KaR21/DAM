
package _10_ExercisesonMethod;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items; 
        double[] itemsDouble;
        System.out.printf("Enter the length:\n");
        Scanner in = new Scanner(System.in);
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];
        itemsDouble = new double[NUM_ITEMS];
        
        if (items.length > 0) {
      
            for (int i = 0; i < items.length; ++i) 
            {  // Read all items
                System.out.printf("Enter a int number (%d):\n", i+1);
                items[i] = in.nextInt();
                System.out.printf("Enter a double number (%d):\n", i+1);
                itemsDouble[i] = in.nextDouble();
            }
        }
        in.close();
        print(items);
        print(itemsDouble);
    }
    
    public static void print(int items[])
    {
        System.out.printf("The array you have entered is: \n");
        System.out.printf("[");
        for(int i=0; i<items.length; i++)
        { 
            if(i == (items.length - 1))
            {
                System.out.printf(" %d ", items[i]);
            }
            else
            {
                System.out.printf(" %d,", items[i]);
            }
        }
        System.out.println("]");
    }

    public static void print(double items[])
    {
        System.out.printf("The array you have entered is: \n");
        System.out.printf("[");
        for(int i=0; i<items.length; i++)
        { 
            if(i == (items.length - 1))
            {
                System.out.printf(" %f ", items[i]);
            }
            else
            {
                System.out.printf(" %f,", items[i]);
            }
        }
        System.out.println("]");
    }
}
