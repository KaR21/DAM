
import java.util.ArrayList;



public class ArrayListak { //ArrayList VS Array
    public static void main(String[] args) {
        System.out.println("=================== ARRAYAK ===================");
        //Arraya sortu
        String[] ikasleenArraya = new String[3];
        //Arraya bete
        ikasleenArraya[0]= "Jaimito";
        ikasleenArraya[1]= "Jorgito";
        ikasleenArraya[2]= "Juanito"; 
        System.out.println();
        //Arraya nabigatu for-ekin
        for(int i = 0; i < ikasleenArraya.length; i++){
            System.out.println(ikasleenArraya[i]);
        }
        System.out.println();
        //Arraya nabigatu for-each-ekin
        for (String izena : ikasleenArraya) {
            System.out.println("Mr" + izena);
        }
        System.out.println();
        //Arrayko lehen elementua hustu
        ikasleenArraya[0]= null;
        //Datu primitiboak gordetzeko
        int zenbakienArraya[] = {1,2,3,4};
        //edo
        int zenbakienArraya2[] = new int[4];
        zenbakienArraya2[0] = 1;
        zenbakienArraya2[1] = 2;
        zenbakienArraya2[2] = 3;
        zenbakienArraya2[3] = 4;
        
        System.out.println();
        System.out.println("================= ARRAYLISTAK =================");
        System.out.println();
        //ArrayLista sortu
        ArrayList <String> ikasleenArrayLista = new ArrayList <> ();
        //ArrayLista bete
        ikasleenArrayLista.add("Jon");
        ikasleenArrayLista.add("Hodei");
        ikasleenArrayLista.add("Karmele");
        ikasleenArrayLista.add("Markel_S");
        ikasleenArrayLista.add("Erlantz");
        //Joseba elementua Jon eta Hodeiren tartean joateko
        ikasleenArrayLista.add(1, "Joseba");
        //Alain 21.posizioan txertatzeko//ERROREA EMANGO DU
        //ikasleenArrayLista.add(21, "Alain");
        //ArrayLista nabigatu for-ekin
        for(int i = 0; i < ikasleenArrayLista.size(); i++){
            System.out.println(ikasleenArrayLista.get(i));
        }
        System.out.println();
        //ArrayLista nabigatu for-each-ekin
        for (String ikaslea : ikasleenArrayLista) {
            System.out.println(ikaslea + " estimatua");
        }
        //ArrayListeko lehen elementua hustu
        ikasleenArrayLista.remove(1);
        //Posizoak
        int pos = ikasleenArrayLista.indexOf("Karmele"); //Parametro bezala objektu bat eskatzen du. Equals metodoarekin konparatuko ditu parametro hori eta arrayListeko objektua. 
        //Datu primitiboak gordetzeko ("wrappera" erabili beharko genuke)
        ArrayList <Integer> zenbakienArrayList = new ArrayList ();
        zenbakienArrayList.add(1);
        zenbakienArrayList.add(2);
        zenbakienArrayList.add(3);
        zenbakienArrayList.add(4);
    }
}
