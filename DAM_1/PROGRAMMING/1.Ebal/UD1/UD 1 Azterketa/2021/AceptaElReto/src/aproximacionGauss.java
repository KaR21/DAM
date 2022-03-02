
import java.util.Scanner;

public class aproximacionGauss {

    public static void main(String[] args) {
        int number, maxError;
        
        Scanner in = new Scanner(System.in);
        do
        {
            number = in.nextInt();
            maxError = in.nextInt();
            printResult(maxError);
        }while(number != 0 && maxError != 0);
        in.close();
        
        
        
    }
    public static void printResult(int maxError)
    {
        int error;
        error = (int)(1/ Math.pow(10, maxError));
        if(error > maxError)
        {
            System.out.printf("Mayor");
        }
        else {
            if(error == maxError)
            {
                System.out.printf("Igual");
            }
            else
            {
                System.out.printf("Menor");
            }
        }
    }
}
