package _10_ExercisesonMethod;

import java.util.Scanner;

public class contains {

    public static void main(String[] args) {
        int[] zen;
        int zenbakia, NUM_ITEMS, i = 0;
        boolean aurkituta;
        
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the length of the list:\n");
        NUM_ITEMS = in.nextInt();

        zen = new int[NUM_ITEMS];
        
        if (zen.length > 0) {
      
            for (i = 0; i < zen.length; ++i) 
            { 
                System.out.printf("Enter a number (%d):\n", i+1);
                zen[i] = in.nextInt();
            }
        }
        
        System.out.printf("Enter a number to search it on the list:\n");
        zenbakia = in.nextInt();
        in.close();
        
        aurkituta = contains(zen, zenbakia);
        if(aurkituta == false)
        {
            System.out.printf("The number %d is not on the list.\n", zenbakia);
        }
        else
        {
            System.out.printf("The number %d is on the list.\n", zenbakia);
        }
    }
    
    public static boolean contains(int[] array, int key)
    {
        int i = 0;
        boolean aurkituta = false;
        
        while(i < array.length && aurkituta == false)
        {
            if(array[i] == key)
            {
                aurkituta = true;
            }
            i++;
        }
           
        return aurkituta;
    }
}
