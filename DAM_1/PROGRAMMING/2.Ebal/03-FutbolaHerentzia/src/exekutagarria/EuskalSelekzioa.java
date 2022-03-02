package exekutagarria;

import java.util.ArrayList;
import java.util.Scanner;
import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;

/**
 *
 * @author elorza.karmele
 */
/**
 * Programa honetan Euskal Selekzioko datuekin egingo dugu lan. Iturria: https://es.wikipedia.org/wiki/Selecci%C3%B3n_de_f%C3%BAtbol_de_Euskadi#Plantilla
 *
 *
 *
 */
public class EuskalSelekzioa {

      public static int azkenId = 0;
      public static ArrayList<IntegranteSeleccion> selekzioa;

      /**
       * Programa honek metodo desberdinei deituko die banan banan. Beharbada ez diozu koherentzia handirik topatuko programa osoari. Ariketaren helburua da beste pakete bateko klase hierarkia
       * erabiltzen trebatzea.
       *
       */
      public static void main(String[] args) {

            futbolariBat();
            bestePartaideBatzukSortu();
            selekzioOsoaSortu();
            int ezabatzekoIda = 4;
            if (partaideaEzabatu(ezabatzekoIda)) {
                  System.out.println(ezabatzekoIda + " id-a duen partaidea ezabatu da.");
            }
      }

      /**
       * Metodo honek "Asier Villalibre"ri dagokion Futbolista objektua sortu eta formatu honetan inprimatzen du: "Futbolista{id=1, nombre=Asier, apellidos=Villalibre, edad=23, dorsal=11,
       * demarcacion=DEL}" Hori lortzeko Futbolista klasean toString() metodoa birdefinitu beharko duzu. Gainera, Web orrian id-rik ez dagoenez, automatikoki kalkulatzea erabaki dugu. Horretarako,
       * kontadore bat (Adibidez, azkenIda izeneko klase atributu bat) erabili dezakezu partaide bat sortzen den bakoitzean handituko dena. Amaitzeko, Villalibre entrenatzen hasiko da.
       */
      public static void futbolariBat() {
            Futbolista futbolaria = new Futbolista(11,Demarkazioa.DEL,++azkenId,"Asier", 23, "Villalibre");
            System.out.println(futbolaria);
      }

      /**
       * Metodo honek hiru objektu berri sortuko ditu. Pertsona hauei dagokienak: - Javier Clemente - Iñaki Sertxiberrieta - Ander Etxeburu Zein klaseko objektua izan behar du bakoitzak?
       *
       * Objektu bakoitza sortu ondoren, bere datuak inprimatu eta kontzentratu eta bidaiatuko dute
       */
      public static void bestePartaideBatzukSortu() {
            Masajista medikua = new Masajista("Medikua", 21, ++azkenId, "Ander", 31, "Etxeburu"); 
            Masajista fisioa = new Masajista("Fisioterapeuta", 11, ++azkenId, "Iñaki", 43, "Sertxiberrieta");
            Entrenador entrenatzailea= new Entrenador("Euskal Federazioa", ++azkenId, "Javier", 50, "Clemente");

      }

      /**
       * Selekzio osoaren datuak gorde "selekzioa" deitutako IntegranteSeleccion klaseko ArrayList estatiko baten.
       *
       */
      public static void selekzioOsoaSortu() {

            selekzioa.add(new Futbolista(1,Demarkazioa.POR,++azkenId,"Aitor", 30, "Fernandez"));
            selekzioa.add(new Futbolista(2,Demarkazioa.DEF,++azkenId,"Unai", 29, "Bustinza"));
            selekzioa.add(new Futbolista(3,Demarkazioa.DEF,azkenId,"Mikel", 33, "Balenziaga"));
            selekzioa.add(new Futbolista(4,Demarkazioa.MED,azkenId,"Asier", 31, "Illarramendi"));
            selekzioa.add(new Futbolista(5,Demarkazioa.DEF,azkenId,"Iñigo", 30, "Martinez"));
            selekzioa.add(new Futbolista(6,Demarkazioa.MED,azkenId,"Mikel", 32, "San Jose"));       
            selekzioa.add(new Futbolista(7,Demarkazioa.DEF,++azkenId,"Gaizka", 24, "Larrazabal"));         
            selekzioa.add(new Futbolista(8,Demarkazioa.MED,++azkenId,"Manu", 35, "Garcia"));  
            selekzioa.add(new Futbolista(9,Demarkazioa.DEL,azkenId,"Aritz", 40, "Aduriz")); 
            selekzioa.add(new Futbolista(10,Demarkazioa.MED,azkenId,"Javier", 31, "Eraso"));     
            selekzioa.add(new Futbolista(11,Demarkazioa.DEL,azkenId,"Asier", 23, "Villalibre"));
            selekzioa.add(new Futbolista(12,Demarkazioa.DEF,azkenId,"Aihen", 24, "Muñoz"));  
            selekzioa.add(new Futbolista(13,Demarkazioa.POR,++azkenId,"Iago", 34, "Herrerín"));       
            selekzioa.add(new Futbolista(14,Demarkazioa.DEF,++azkenId,"Aritz", 27, "Elustondo"));
            selekzioa.add(new Futbolista(15,Demarkazioa.DEF,azkenId,"Jesús", 22, "Areso"));     
            selekzioa.add(new Futbolista(16,Demarkazioa.DEL,azkenId,"Iñigo", 24, "Vicente"));
            selekzioa.add(new Futbolista(17,Demarkazioa.DEF,azkenId,"Daniel", 22, "Vivian"));
            selekzioa.add(new Entrenador("Euskal selekzioa", 1, "Francisco", 40, "Padalino"));  
            selekzioa.add(new Entrenador("Euskal selekzioa", 2, "Joseba", 40, "Núñez"));  
            selekzioa.add(new Entrenador("Euskal selekzioa", 3, "Markel", 40, "Lautadahandi")); 
            selekzioa.add(new Masajista("Fisioterapeuta", 21, 4, "Iñaki", 41, "Sertxiberrieta"));
            selekzioa.add(new IntegranteSeleccion(5,"Ander", 21, "Etxeburu")); 

        
      }

      /**
       * ArrayListetik objektu bat ezabatzen du. Aurkitzen ez badu false itzuliko du
       *
       * @param id Ezabatu nahi den partaidearen ida
       * @return
       */
      public static boolean partaideaEzabatu(int id) {
            System.out.println(selekzioa);
            
            for(int i = 0; i < selekzioa.size(); i++){
                  if(id == selekzioa.get(i).getId()){
                        selekzioa.remove(i);
                  }
            }
            
            System.out.println(selekzioa);
            return false;
      }
}
