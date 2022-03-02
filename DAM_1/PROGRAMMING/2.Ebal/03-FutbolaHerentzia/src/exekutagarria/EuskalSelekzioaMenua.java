package exekutagarria;

/**
 *
 * @author elorza.karmele
 */
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import model.Demarkazioa;
import model.Masajista;

/**
 * Programa honetan Euskal Selekzioaren datuekin egingo dugu lan. Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 * Programa hau selekzioko partaideen datuak kargatzen hasiko da. Normalena da, datu hauek fitxategi edo datu-base batetik irakurtzea baina oraindik hori ez dakigunez egiten guk programan bertan,
 * metodo baten barruan idatziko ditugu.
 *
 * Gero, horrelako menu bat agertuko zaigu:
 *
 *  **********************************************************
 *  * EUSKAL SELEKZIOA * ---------------------------------- * 1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...) * 2. Partaideen datuak ikusi
 * taldekatuta * 3. Futbolariak alfabetikoki inprimatu * 4. Aldaketa ( Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz) * 5. Bilatu abizenetik (String-en
 * startsWith() metodoa erabiliz adibidez) * z. Irten
 *
 *  * Aukeratu zenbaki bat:
 *
 *  **************************************************************
 */
public class EuskalSelekzioaMenua {

      public static int azkenId = 0;
      public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();

      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int aukera = 0;
            boolean aukeraEgokia = false;
            selekzioOsoaSortu();
            
            do {
                  do {
                        System.out.println();
                        System.out.println("**********************************************************");
                        System.out.println("\tEUSKAL SELEKZIOA");
                        System.out.println("----------------------------------");
                        System.out.println("1. Partaideen datuak ikusi (Goiburuko egoki eta laburpen azken lerro batekin (Futbolistak: 23 Entren...) ");
                        System.out.println("2. Partaideen datuak ikusi taldekatuta ");
                        System.out.println("3. Partaideak alfabetikoki inprimatu");
                        System.out.println("4. Aldaketa (Sartu zaitez zu beste partaide baten ordez. Horretarako ArrayList-en set metodoa erabiliz) ");
                        System.out.println("5. Bilatu abizenetik (String-en startsWith() metodoa erabiliz adibidez) ");
                        System.out.println("6. Futbolariak alfabetikoki inprimatu");
                        System.out.println("0. Irten ");
                        System.out.println("");
                        System.out.println("Sartu erantzun zuzena: ");
                        aukera = in.nextInt();
                        if (aukera == 1 || aukera == 2 || aukera == 3 || aukera == 4 || aukera == 5 | aukera == 6 || aukera == 0) {
                              aukeraEgokia = true;
                        }
                  } while (!aukeraEgokia);
                  switch (aukera) {

                        case 1:
                              partaideakIkusi();
                              break;
                        case 2:
                              partaideakIkusiTaldekatuta();
                              break;
                        case 3:
                              partaideakAlfabetikokiIkusi();
                              break;
                        case 4:
                              aldaketa();
                              break;
                        case 5:
                              bilatu();
                              break;
                        case 6:
                              futbolariakAlfabetikokiIkusi();
                              break;

                  }
            } while (aukera != 0);
            System.out.println("Programa amaitzen...");
      }

      public static void selekzioOsoaSortu() {

            selekzioa.add(new Futbolista(1, Demarkazioa.POR, ++azkenId, "Aitor", 30, "Fernandez"));
            selekzioa.add(new Futbolista(2, Demarkazioa.DEF, ++azkenId, "Unai", 29, "Bustinza"));
            selekzioa.add(new Futbolista(3, Demarkazioa.DEF, ++azkenId, "Mikel", 33, "Balenziaga"));
            selekzioa.add(new Futbolista(4, Demarkazioa.MED, ++azkenId, "Asier", 31, "Illarramendi"));
            selekzioa.add(new Futbolista(5, Demarkazioa.DEF, ++azkenId, "Iñigo", 30, "Martinez"));
            selekzioa.add(new Futbolista(6, Demarkazioa.MED, ++azkenId, "Mikel", 32, "San Jose"));
            selekzioa.add(new Futbolista(7, Demarkazioa.DEF, ++azkenId, "Gaizka", 24, "Larrazabal"));
            selekzioa.add(new Futbolista(8, Demarkazioa.MED, ++azkenId, "Manu", 35, "Garcia"));
            selekzioa.add(new Futbolista(9, Demarkazioa.DEL, ++azkenId, "Aritz", 40, "Aduriz"));
            selekzioa.add(new Futbolista(10, Demarkazioa.MED, ++azkenId, "Javier", 31, "Eraso"));
            selekzioa.add(new Futbolista(11, Demarkazioa.DEL, ++azkenId, "Asier", 23, "Villalibre"));
            selekzioa.add(new Futbolista(12, Demarkazioa.DEF, ++azkenId, "Aihen", 24, "Muñoz"));
            selekzioa.add(new Futbolista(13, Demarkazioa.POR, ++azkenId, "Iago", 34, "Herrerín"));
            selekzioa.add(new Futbolista(14, Demarkazioa.DEF, ++azkenId, "Aritz", 27, "Elustondo"));
            selekzioa.add(new Futbolista(15, Demarkazioa.DEF, ++azkenId, "Jesús", 22, "Areso"));
            selekzioa.add(new Futbolista(16, Demarkazioa.DEL, ++azkenId, "Iñigo", 24, "Vicente"));
            selekzioa.add(new Futbolista(17, Demarkazioa.DEF, ++azkenId, "Daniel", 22, "Vivian"));
            selekzioa.add(new Entrenador("Euskal selekzioa", ++azkenId, "Francisco", 40, "Padalino"));
            selekzioa.add(new Entrenador("Euskal selekzioa", ++azkenId, "Joseba", 40, "Núñez"));
            selekzioa.add(new Entrenador("Euskal selekzioa", ++azkenId, "Markel", 40, "Lautadahandi"));
            selekzioa.add(new Masajista("Fisioterapeuta", 21, ++azkenId, "Iñaki", 41, "Sertxiberrieta"));
            selekzioa.add(new IntegranteSeleccion(++azkenId, "Ander", 21, "Etxeburu"));

      }

      public static void partaideakIkusi() {
            int f = 0, e = 0, m = 0, b = 0; //Object partaidea; partaidea = selekzioa.get(i); if(partaidea instanceof Futbolista) {f++;}
            for (int i = 0; i < selekzioa.size(); i++) {
                  System.out.println(selekzioa.get(i));
                  if(selekzioa.get(i).getClass() == Futbolista.class){ 
                        f++;
                  }
                  if(selekzioa.get(i).getClass() == Entrenador.class){
                        e++;
                  }
                  if(selekzioa.get(i).getClass() == Masajista.class){
                        m++;
                  }
                  if(selekzioa.get(i).getClass() == IntegranteSeleccion.class){
                        b++;
                  }
            }
            System.out.println("Futbolista kopurua: " + f + "   Entrenatzaile kopurua: " + e + "   Masajista kopurua: " + m + "   Besteak kopurua: " + b);
      }

      public static void partaideakIkusiTaldekatuta() {
            ArrayList<IntegranteSeleccion> futbolistak = new ArrayList<>();
            ArrayList<IntegranteSeleccion> entrenatzaileak = new ArrayList<>();
            ArrayList<IntegranteSeleccion> masajistak = new ArrayList<>();
            ArrayList<IntegranteSeleccion> besteak = new ArrayList<>();

            for (int i = 0; i < selekzioa.size(); i++) {
                  if (selekzioa.get(i).getClass() == Futbolista.class) {
                        futbolistak.add(selekzioa.get(i));
                  }
                  if (selekzioa.get(i).getClass() == Entrenador.class) {
                        entrenatzaileak.add(selekzioa.get(i));
                  }
                  if (selekzioa.get(i).getClass() == Masajista.class) {
                        masajistak.add(selekzioa.get(i));
                  }
                  if (selekzioa.get(i).getClass() == IntegranteSeleccion.class) {
                        besteak.add(selekzioa.get(i));
                  }

            }

            System.out.println("------------------------FUTBOLARIAK------------------------");
            for (int i = 0; i < futbolistak.size(); i++) {
                  System.out.println(futbolistak.get(i));
            }
            System.out.println("Futbolari kopurua: " + futbolistak.size());
            System.out.println();

            System.out.println("----------------------ENTRENATZAILEAK----------------------");
            for (int i = 0; i < entrenatzaileak.size(); i++) {
                  System.out.println(entrenatzaileak.get(i));
            }
            System.out.println("Entrenatzaile kopurua: " + entrenatzaileak.size());
            System.out.println();

            System.out.println("-------------------------MASAJISTAK------------------------");
            for (int i = 0; i < masajistak.size(); i++) {
                  System.out.println(masajistak.get(i));
            }
            System.out.println("Masajista kopurua: " + masajistak.size());
            System.out.println();

            System.out.println("--------------------------BESTEAK--------------------------");
            for (int i = 0; i < besteak.size(); i++) {
                  System.out.println(besteak.get(i));
            }
            System.out.println("Selekzioko integrante kopurua: " + besteak.size());
            System.out.println();

      }

      public static void futbolariakAlfabetikokiIkusi() {
            ArrayList<IntegranteSeleccion> futbolistak = new ArrayList<>();
            for (int i = 0; i < selekzioa.size(); i++) {
                  if (selekzioa.get(i).getClass() == Futbolista.class) {
                        futbolistak.add(selekzioa.get(i));
                  }
            }

            Collections.sort(futbolistak, new Comparator<IntegranteSeleccion>() {
                  @Override
                  public int compare(IntegranteSeleccion o1, IntegranteSeleccion o2) {
                        return o1.getApellidos().compareTo(o2.getApellidos());
                  }
            });
            
            for (int i = 0; i < futbolistak.size(); i++) {
                  System.out.println(futbolistak.get(i));
            }
      }
      
      public static void aldaketa() {
            Scanner in = new Scanner(System.in);
            System.out.println("Nor aldatu nahi duzu(Idatzi id-a): ");
            int id = in.nextInt();
            
            for(int i = 0; i < selekzioa.size(); i++){
                  if(selekzioa.get(i).getId() == id){
                        System.out.println("Aukeratutako id duena hau da: " + selekzioa.get(i));
                        System.out.println("Zein da bere izena? ");
                        selekzioa.get(i).setNombre(in.next());
                        System.out.println("Eta bere abizenak? ");
                        selekzioa.get(i).setApellidos(in.next());
                  }
            }    
      }
      
      public static void bilatu() {
            Scanner in = new Scanner(System.in);
            System.out.println("Zein abizen nahi duzu bilatzea? ");
            String abizena = in.next();
            
            for(int i = 0; i < selekzioa.size(); i++){
                  if(selekzioa.get(i).getApellidos().startsWith(abizena)){
                        System.out.println("Aurkitu da bilatu nahi zenuena! " + selekzioa.get(i));
                  }
            }    
      }
      
      public static void partaideakAlfabetikokiIkusi() {
            Collections.sort(selekzioa, new Comparator<IntegranteSeleccion>() {
                  @Override
                  public int compare(IntegranteSeleccion o1, IntegranteSeleccion o2) {
                        return o1.getApellidos().compareTo(o2.getApellidos());
                  }
            });
            
            for (int i = 0; i < selekzioa.size(); i++) {
                  System.out.println(selekzioa.get(i));
            }
      }
}