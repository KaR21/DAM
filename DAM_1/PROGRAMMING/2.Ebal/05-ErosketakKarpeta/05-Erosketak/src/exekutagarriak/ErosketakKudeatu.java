package exekutagarriak;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Bezeroa;
import model.Enpresa;
import model.Erosketa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author elorza.karmele
 */
public class ErosketakKudeatu {

      static Scanner in = new Scanner(System.in);
      private static ArrayList<Bezeroa> kontaktuak = new ArrayList();
      private static ArrayList<Produktua> produktuKatalogoa = new ArrayList();
      private static ArrayList<Erosketa> erosketenZerrenda = new ArrayList();

      public static void main(String[] args) {
            int aukera, opzioaRead;

            initialize();
            do {
                  aukera = menuNagusiaErakutsi();
                  switch (aukera) {
                        case 1:
                              createDatuakGehitu();
                              break;
                        case 2:
                              do {
                                    opzioaRead = readNagusiaErakutsi();
                                    switch (opzioaRead) {
                                          case 1:
                                                System.out.println("Honako hau da erosketen zerrenda:");
                                                System.out.println(erosketenZerrenda);
                                                break;
                                          case 2:
                                                double fakturazioOsoa = 0;
                                                for (int i = 0; i < erosketenZerrenda.size(); i++) {
                                                      fakturazioOsoa = fakturazioOsoa + erosketenZerrenda.get(i).getGuztira();
                                                }
                                                System.out.println("Honako diru kopurua lortu da (FAKURAZIO OSOA):" + fakturazioOsoa);
                                                break;
                                          case 3:
                                                Bezeroa onena;
                                                onena = bezerorikOnena();
                                                System.out.println("Bezerorik onena hau da:" + onena);
                                                break;
                                          case 4:
                                                System.out.println("4");
                                                break;
                                          case 5:
                                                System.out.println("5");
                                                break;
                                    }
                              } while (opzioaRead != 0);

                        case 3:
                              System.out.println("3");
                              break;
                        case 4:
                              System.out.println("4");
                              break;

                  }
            } while (aukera != 0);

      }

      public static void initialize() {
            String[] emailak = new String[2];

            emailak[0] = "idazkaria@uni.eus";
            emailak[1] = "zuzendaria@uni.eus";
            Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g DONOSTIA", "mbera@donostia.eus");
            Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza pasealekua z/g ZARAUTZ", "kargi@zarautz.eus");
            Bezeroa UniEibarErmua = new Enpresa(3, "Uni Eibar-Ermua", "Uni", "Otaola Etorbidea 29 EIBAR", emailak);
            kontaktuak.add(martin);
            kontaktuak.add(karlos);
            kontaktuak.add(UniEibarErmua);
            Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
            Produktua pavilion = new Produktua("C02", "HP Pavilion", 600);
            Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
            Produktua iPhoneXX = new Produktua("T02", "iPhone XX", 1300);

            produktuKatalogoa.add(toshiba);
            produktuKatalogoa.add(pavilion);
            produktuKatalogoa.add(samsung);
            produktuKatalogoa.add(iPhoneXX);

            ArrayList<Produktua> produktuak = new ArrayList();
            produktuak.add(toshiba);
            produktuak.add(pavilion);
            produktuak.add(samsung);
            ArrayList<Integer> unitateak = new ArrayList();
            unitateak.add(4);
            unitateak.add(2);
            unitateak.add(3);

            erosketenZerrenda.add(new Erosketa("1.Erosketa", LocalDate.of(2022, 02, 15), martin, produktuak, unitateak, 3630));

            ArrayList<Produktua> produktuak2 = new ArrayList();
            produktuak2.add(toshiba);
            ArrayList<Integer> unitateak2 = new ArrayList();
            unitateak2.add(15);

            erosketenZerrenda.add(new Erosketa("2.Erosketa", LocalDate.of(2022, 02, 16), karlos, produktuak2, unitateak2, 6750));

            ArrayList<Produktua> produktuak3 = new ArrayList();
            produktuak3.add(toshiba);
            produktuak3.add(samsung);
            ArrayList<Integer> unitateak3 = new ArrayList();
            unitateak3.add(1);
            unitateak3.add(1);

            erosketenZerrenda.add(new Erosketa("3.Erosketa", LocalDate.of(2022, 02, 17), karlos, produktuak3, unitateak3, 660));

      }

      public static int menuNagusiaErakutsi() {
            int aukera = 0;
            Scanner in = new Scanner(System.in);

            do {
                  System.out.println("---------------MENU NAGUSIA---------------");
                  System.out.println("1) CREATE (Datuak gehitu)");
                  System.out.println("2) READ (Datuak irakurri)");
                  System.out.println("3) UPDATE (Datuak aldatu)");
                  System.out.println("4) DELETE (Datuak ezabatu)");
                  System.out.println("0) IRTEN");

                  System.out.println("Sartu aukera: ");
                  aukera = in.nextInt();
            } while (aukera != 1 && aukera != 2 && aukera != 3 && aukera != 4 && aukera != 0);

            return aukera;
      }

      public static int readNagusiaErakutsi() {
            int aukera = 0;

            do {
                  System.out.println("---------------READ MENU---------------");
                  System.out.println("1) Erosketen zerrenda");
                  System.out.println("2) Fakturazio osoa"); //esan guztira denen artean zenbat diru lortu duen gure enpresak 
                  System.out.println("3) Bezerorik onena"); //Uni Eibar
                  System.out.println("4) Helbidea bilatu");
                  System.out.println("5) Epekako erosketen txostena");
                  System.out.println("0) Menu nagusira itzuli");

                  System.out.println("Sartu aukera: ");
                  aukera = in.nextInt();
            } while (aukera != 1 && aukera != 2 && aukera != 3 && aukera != 4 && aukera != 5 && aukera != 0);

            return aukera;
      }

      public static void createDatuakGehitu() {
            int erosketaKop;
            Erosketa erosketa;

            System.out.println("Zenbat erosketa nahi dituzu gehitu?:");
            erosketaKop = in.nextInt();

            for (int i = 0; i < erosketaKop; i++) {
                  erosketa = createDatuBatGehitu(i);
                  erosketenZerrenda.add(erosketa);
            }
      }

      public static Erosketa createDatuBatGehitu(int i) {
            int urtea, hilabetea, eguna, enpresaEDOpertsona, kopurua;
            boolean jarraitu = true;
            double prezioa, prezioTotala;
            String izena, abizena, helbidea, korreoa, kodea, produktuIzena, korreoak[] = new String[10];
            Erosketa erosketaBat;
            ArrayList<Produktua> produktuak = new ArrayList();
            ArrayList<Integer> unitateak = new ArrayList();

            System.out.println("---------EROSKETA BERRIAREN DATUAK GEHITZEN---------");
            System.out.println("Zein urtetan egin da erosketa?:");
            urtea = in.nextInt();
            System.out.println("Zein hilabetean egin da erosketa?:");
            hilabetea = in.nextInt();
            System.out.println("Zein egunean egin da erosketa?:");
            eguna = in.nextInt();
            System.out.println("Erosketa egin zuena enpresa bat edo pertsona bat izan da? (Sartu 1 pertsona izan bada eta beste edozer zenbaki enpresa izan bada):");
            enpresaEDOpertsona = in.nextInt();
            if (enpresaEDOpertsona == 1) { //PERTSONA
                  System.out.println("---------PERTSONAREN DATUAK GEHITZEN---------");
                  System.out.println("Nork egin du erosketa?(IZENA):");
                  izena = in.next();
                  System.out.println("Nork egin du erosketa?(ABIZENA):");
                  abizena = in.next();
                  System.out.println(izena + " " + abizena + "ren helbidea zein da?:");
                  helbidea = in.next();
                  System.out.println(izena + " " + abizena + "ren korreoa zein da?:");
                  korreoa = in.next();
                  Bezeroa bezeroa = new Pertsona(i, izena, abizena, helbidea, korreoa);

                  while (jarraitu) {//produktuak sartu nahi diren heinean
                        System.out.println("---------PRODUKTUAREN DATUAK GEHITZEN---------");
                        System.out.println("Zein da produktuaren kodea?:");
                        kodea = in.next();
                        System.out.println("Zein da produktuaren izena?:");
                        produktuIzena = in.next();
                        System.out.println("Zenbat balio du produktuak?:");
                        prezioa = in.nextDouble();
                        System.out.println("Zenbat kopuru hartu dira?:");
                        kopurua = in.nextInt();
                        produktuak.add(new Produktua(kodea, produktuIzena, prezioa));
                        unitateak.add(kopurua);
                        System.out.println("Produktu gehiago nahi dira sartu?: 1 bai, besteak ez");
                        if (in.nextInt() != 1) {
                              jarraitu = false;
                        }
                  }
                  prezioTotala = prezioaKalkulatu(unitateak, produktuak);
                  erosketaBat = new Erosketa(i + ".Erosketa", LocalDate.of(urtea, hilabetea, eguna), bezeroa, produktuak, unitateak, prezioTotala);
            } else { //ENPRESA
                  int korreoKop;
                  System.out.println("---------ENPRESAREN DATUAK GEHITZEN---------");
                  System.out.println("Nork egin du erosketa?(IZEN KOMERTZIALA):");
                  izena = in.next();
                  System.out.println("Nork egin du erosketa?(IZEN JURIDIKOA):");
                  abizena = in.next();
                  System.out.println("Enpresaren helbidea zein da?:");
                  helbidea = in.next();
                  System.out.println("Zenbat korreo sartu nahi dira? (GEHIENEZ 10):");
                  korreoKop = in.nextInt();
                  for (int j = 0; j < korreoKop; j++) {
                        System.out.println(izena + " " + abizena + "ren korreoa zein da/dira?:");
                        korreoak[j] = in.next();
                  }

                  Bezeroa enpresa = new Enpresa(i, abizena, izena, helbidea, korreoak);

                  while (jarraitu) {
                        System.out.println("---------PRODUKTUAREN DATUAK GEHITZEN---------");
                        System.out.println("Zein da produktuaren kodea?:");
                        kodea = in.next();
                        System.out.println("Zein da produktuaren izena?:");
                        produktuIzena = in.next();
                        System.out.println("Zenbat balio du produktuak?:");
                        prezioa = in.nextFloat();
                        System.out.println("Zenbat kopuru hartu dira?:");
                        kopurua = in.nextInt();
                        produktuak.add(new Produktua(kodea, produktuIzena, prezioa));
                        unitateak.add(kopurua);
                        System.out.println("Produktu gehiago nahi dira sartu?: 1 bai, besteak ez");
                        if (in.nextInt() != 1) {
                              jarraitu = false;
                        }
                  }
                  prezioTotala = prezioaKalkulatu(unitateak, produktuak);
                  erosketaBat = new Erosketa(i + ".Erosketa", LocalDate.of(urtea, hilabetea, eguna), enpresa, produktuak, unitateak, prezioTotala);
            }

            return erosketaBat;
      }

      public static double prezioaKalkulatu(ArrayList<Integer> unitateak, ArrayList<Produktua> produktuak) {
            double prezioTotala = 0;

            for (int i = 0; i < produktuak.size(); i++) {
                  prezioTotala = prezioTotala + (unitateak.get(i) * produktuak.get(i).getPrezioa());
            }

            return prezioTotala;
      }

      public static Bezeroa bezerorikOnena() { //Funciona MAL
            Bezeroa onena = new Pertsona();
            int j = 0;
            for (int i = 0; i < erosketenZerrenda.size(); i++) {
                  while (erosketenZerrenda.get(i).getGuztira() > erosketenZerrenda.get(j).getGuztira()) {
                        j++;
                        onena = erosketenZerrenda.get(i).getBezeroa();
                  }
            }

            return onena;
      }
}
