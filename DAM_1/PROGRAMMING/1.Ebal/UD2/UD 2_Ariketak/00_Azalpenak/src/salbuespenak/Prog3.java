
package salbuespenak;

import java.util.Scanner;

public class Prog3 {

    public static void main(String[] args) {
        int[] zenbakiak = {1, 15, 2};
        Scanner sc = new Scanner(System.in);
        int zenbatgarren;
        try {
            System.out.print("Zenbatgarren zenbakia ikusi nahi duzu? ");
            zenbatgarren = sc.nextInt();
            System.out.println(zenbakiak[zenbatgarren]);
        } catch (Exception ex) {
            System.out.println("Ez duzu balio egokia sartu.");
        }
    }
}