
import java.util.Scanner;

public class laFiestaAburrida {

    //public static Scanner in;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int casos;
        casos = s.nextInt();
        String nombre;

        for (int i = 1; i <= casos; i++) {
            s.next();
            nombre = s.next();
            System.out.println("Hola, " + nombre + ".");
        }
        s.close();
    }
    /*public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        int numCasos;
        String nombre[];

        numCasos = in.nextInt();
        nombre = new String[numCasos];

        for (int i = 0; i < numCasos; i++) {
            nombre[i] = in.next();
            System.out.printf("Soy %s\n", nombre[i]);
        }
        for (int i = 0; i < numCasos; i++) {
            System.out.printf("Hola, %s\n", nombre[i]);
        }

    }*/
}
