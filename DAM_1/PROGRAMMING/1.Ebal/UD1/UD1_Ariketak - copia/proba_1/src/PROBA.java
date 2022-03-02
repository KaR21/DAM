/**
 *
 * @author KARMELE
 */

import java.util.Scanner;

public class PROBA {
    public static void main(String[] args) {
      int i = 0, j = 0, n = 0;
			Scanner teklatua = new Scanner(System.in);
			 
			for(i = 0; i<4; i++)
			{
				System.out.println("Hello!--"+ i); // Print text message and start on the next line
			}
			
			System.out.print("Sar ezazu triangeluaren fila kopurua:"); 
			
			n = teklatua.nextInt(); //To enter something by keyboard
			
			for(i = 0; i<= n; i++)
			{
				for(j = 0; j< i; j++)
				{
					System.out.print("*"); //Print text message
				} 
				System.out.println(); //start on the next line
			}
   }
}
