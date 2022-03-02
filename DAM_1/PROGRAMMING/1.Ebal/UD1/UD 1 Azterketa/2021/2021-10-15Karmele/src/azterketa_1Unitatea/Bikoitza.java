package azterketa_1Unitatea;

import java.util.Scanner;
import java.util.Arrays;

public class Bikoitza {

    public static void main(String[] args) {

        final int TAMAINA = 5;
        int[] array;

        Scanner in = new Scanner(System.in);
        System.out.printf("Sartu itzazu %d zenbaki espazioz bananduta:\n", TAMAINA);
        array = new int[TAMAINA];

        if (array.length > 0) { //Arrayko elementu kopurua 0 baino handiagoa bada, sartu elementua ezarritako kopurua bete arte.

            for (int i = 0; i < array.length; ++i) {
                array[i] = in.nextInt();
            }
        }
        in.close(); //Scannerra itxi.

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; ++i) { //Array-a zeharkatzeko.
            array[i] = array[i] * 2; //Arrayko elementuak bikoiztu.
        }
        System.out.println(Arrays.toString(array));
    }
    /*  IDOIAN ERANTZUNA
    public static void main(String[] args) {

        final int TAMAINA = 5;
        int[] array;
        int[] arrayBikoitza;

        Scanner in = new Scanner(System.in);
        System.out.printf("Sartu itzazu %d zenbaki espazioz bananduta:\n", TAMAINA);
        array = new int[TAMAINA];
        arrayBikoitza = new int[TAMAINA];

        if (array.length > 0) { //Arrayko elementu kopurua 0 baino handiagoa bada, sartu elementua ezarritako kopurua bete arte.

            for (int i = 0; i < array.length; ++i) {
                array[i] = in.nextInt();
                arrayBikoitza[i] = array[i];
            }
        }
        in.close(); //Scannerra itxi.

        for (int i = 0; i < array.length; ++i) { //Array-a zeharkatzeko.
            arrayBikoitza[i] = arrayBikoitza[i] * 2; //Arrayko elementuak bikoiztu.
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayBikoitza));
    }*/
}
