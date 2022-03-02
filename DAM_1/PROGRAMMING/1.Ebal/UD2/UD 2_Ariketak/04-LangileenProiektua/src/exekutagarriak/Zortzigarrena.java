
package exekutagarriak;
import model.Langilea;
import model.Zatikia;

public class Zortzigarrena {
    public static void main(String[] args) {
        Langilea[] langileGuztiak;
        double orduKop = 0.0;
        double lanaldia;
        
        langileGuztiak = Langilea.nireHamarLagunLangile();
        
        langileGuztiak[0].setLanaldia(new Zatikia("1/2"));
        langileGuztiak[9].setLanaldia(new Zatikia("1/2"));
        
        for(int i = 0; i < langileGuztiak.length; i++){
            lanaldia = 35 * langileGuztiak[i].getLanaldia().hamartarBaliokidea();
            orduKop = orduKop + lanaldia;
        }  
        
        System.out.println(orduKop);
    }
}
/*Suposatuz lanaldi osoko langile batek astero 35 ordu lan egiten dituela, inprimatu honelako mezua:
            "Enpresan guztira astero X orduko lana egiten da" ( emandako datuekin: 315 ordu)*/


//arrayetan borratzeko arraya[i] = null;
