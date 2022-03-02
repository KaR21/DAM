package _10_ExercisesonMethod;

import java.util.Scanner;

public class arrayToString {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items; 
        StringBuffer Array;
 
        System.out.printf("Enter the length:\n");
        Scanner in = new Scanner(System.in);
        NUM_ITEMS = in.nextInt();

        items = new int[NUM_ITEMS];
        
        if (items.length > 0) {
      
            for (int i = 0; i < items.length; ++i) 
            {  // Read all items
                System.out.printf("Enter a int number (%s):\n", i+1);
                items[i] = in.nextInt();
            }
        }
        in.close();
        Array = ArrayToString(items);
        System.out.printf("%s:\n", Array);
        //System.out.println(Arrays.toString(items));      
    }
    public static StringBuffer ArrayToString(int items[])
    {
        StringBuffer str = new StringBuffer();
        str.append('[');
        for(int i=0; i<items.length; i++)
        { 
            str.append(items[i]);
            if(i < items.length - 1)
            {
                str.append(", ");
            }
        }
        str.append(']');
        return str;
    }
}
