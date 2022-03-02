
package exekutagarriak;

import java.util.Scanner;
import model.Langilea;
import model.Zatikia;

public class Lanaldia {
    public static void main(String[] args) {
        Langilea langile = new Langilea(1,"Karmele", "Elorza", 21000);
        int zenbakitzailea, izendatzailea;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Sartu zenbakitzailea");
        zenbakitzailea = in.nextInt();
        System.out.println("Sartu izendatzailea");
        izendatzailea = in.nextInt();
        langile.setLanaldia(new Zatikia(zenbakitzailea, izendatzailea)); 
        
        System.out.println(langile.getLanaldia());
    }
}
