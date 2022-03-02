/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;
import model.Partida;

/**
 *
 * @author elorza.karmele
 */
public class PartidaKudeatu {

    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<>();
    public static int azkenId = 0;
    public static int idPartida = 0;
    private static Partida[] partidak = new Partida[20];

    public static void main(String[] args) {

        selekzioOsoaSortu();
        partidakAsmatu();
        //partidaBatenDatuakEskatu();
        System.out.println("----------PARTIDA GUZTIAK:----------");
        partidakIkusi();
        estatistikakKalkulatu();
    }

    public static void partidaBatenDatuakEskatu() {
        Partida partidaBat;
        int urtea, hila, eguna, txartelKop;
        String aurkaria;
        ArrayList<Futbolista> txartelak = new ArrayList();
        Scanner in = new Scanner(System.in);

        System.out.println("Partida berri bat sortu.");
        System.out.println("Zein urtetan jokatu da?: ");
        urtea = in.nextInt();
        System.out.println("Zein hilabetean jokatu da?: ");
        hila = in.nextInt();
        System.out.println("Zein egunean jokatu da?: ");
        eguna = in.nextInt();
        System.out.println("Zeinen aurka jokatu du?: ");
        aurkaria = in.next();
        System.out.println("Zenbat txartel atera dira?: ");
        txartelKop = in.nextInt();
        for (int i = 0; i < txartelKop; i++) {
            System.out.printf("%d. txartela: Zein zenbaki zuen dortsalean jokalariak?: \n", i + 1);
            txartelak.add((Futbolista) selekzioa.get((in.nextInt()) - 1));
        }

        partidaBat = new Partida(LocalDate.of(urtea, hila, eguna), aurkaria, txartelak);
        partidak[idPartida++] = partidaBat;
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

    public static void partidakAsmatu() {
        ArrayList<Futbolista> txartelak;

        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 10, 30), "Albania", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 10, 31), "Brasil", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 11, 1), "Costa Rica", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 11, 2), "Suecia", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 11, 3), "Rusia", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 11, 4), "Serbia", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 12, 5), "Rumania", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2018, 12, 21), "Bolivia", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 1, 25), "Estonia", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 2, 21), "Nigeria", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 3, 8), "Marruecos", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 3, 20), "Rusia", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 3, 25), "Francia", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 3, 30), "Cataluña", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 4, 2), "Gales", txartelak);
        txartelak = txartelakJarri();
        partidak[idPartida++] = new Partida(LocalDate.of(2019, 4, 10), "Islandia", txartelak);

    }

    public static ArrayList<Futbolista> txartelakJarri() {

        ArrayList<Futbolista> txartelak = new ArrayList<>();
        ArrayList<Futbolista> futbolistak = new ArrayList<>();

        for (int i = 0; i < selekzioa.size(); i++) {
            if (selekzioa.get(i).getClass() == Futbolista.class) {
                futbolistak.add((Futbolista) selekzioa.get(i));
            }
        }

        int rand2 = (int) (Math.random() * futbolistak.size());
        for (int j = 0; j < rand2; j++) {
            int rand = (int) (Math.random() * futbolistak.size());
            txartelak.add(futbolistak.get(rand));
        }

        return txartelak;
    }

    public static void partidakIkusi() {

        for (int i = 0; i < idPartida; i++) {
            System.out.println(partidak[i]);
        }
    }

    public static void estatistikakKalkulatu() {
        int zenbatAldiz = 0, errepikatua;
        int[] txartelMax = new int[2];
        LocalDate dataH;
        LocalDate dataB;
        ArrayList<Integer> idGuztiak = new ArrayList<>();

        for (int i = 0; i < idPartida; i++) {
            for (int j = 0; j < partidak[i].getTxartelak().size(); j++) {
                idGuztiak.add(partidak[i].getTxartelak().get(j).getId());
            }
        }
        //System.out.println(idGuztiak);
        System.out.println("");
        Collections.sort(idGuztiak);
        //System.out.println(idGuztiak);
        for (int k = 0; k < idGuztiak.size(); k++) {

            zenbatAldiz = Collections.frequency(idGuztiak, (idGuztiak.get(k)));
            if (k > 0) {
                errepikatua = idGuztiak.get(k);
                if (errepikatua != idGuztiak.get(k - 1)) {
                    System.out.println((idGuztiak.get(k)) + " ida duen jokalariaren txartel kopurua: " + zenbatAldiz);
                }
            } else {
                System.out.println((idGuztiak.get(k)) + " ida duen jokalariaren txartel kopurua: " + zenbatAldiz);
                txartelMax[0] = zenbatAldiz;
                txartelMax[1] = idGuztiak.get(k);
            }
            if (zenbatAldiz > txartelMax[0]) {
                txartelMax[0] = zenbatAldiz;
                txartelMax[1] = idGuztiak.get(k);
            }
        }
        System.out.println("");
        System.out.println("Txartel gehiena lortu duen jokalaria " + selekzioa.get(txartelMax[1] - 1).getNombre() + " " + selekzioa.get(txartelMax[1] - 1).getApellidos() + " izan da eta" + " jokatutako partidetan " + txartelMax[0] + " txartel jaso ditu.");
        System.out.println("");

        ArrayList<LocalDate> partidaEgunak = new ArrayList<LocalDate>();

        for (int k = 0; k < partidak.length; k++) {
            if (partidak[k] != null) {
                partidaEgunak.add(partidak[k].getData());
            }
        }
        Collections.sort(partidaEgunak);
        System.out.println("Hauek dira partiden datak: " + partidaEgunak);
            /*Batez beste zenbat egunero jolastu den partida bat */
    }


}
