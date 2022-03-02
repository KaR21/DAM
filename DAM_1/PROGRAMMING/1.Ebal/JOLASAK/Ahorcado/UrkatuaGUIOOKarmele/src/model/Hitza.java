package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;

public class Hitza {

      private char[] asmatutakoa;
      private String hitza;
      private String pista;
      private int puntuazioa;

      public Hitza() {
            int pos;
            pos = hitzBatAukeratu();
            asmatutakoa = new char[hitza.length()];
            for (int i = 0; i < asmatutakoa.length; i++) {
                  asmatutakoa[i] = '-';
            }

            pista = pistaEzarri(pos);
            puntuazioa = 10;

            //puntuazioa = //gorde lortutako puntuazioa fitxategiak formatuarekin (1.partida = 10 puntu)(2.partida = 8 puntu)...
            //Hortako  hasi 10 punturekin
            //errore bakoitzeko -1 egin eta puntuazioa = 1 denean galtzen da. puntuazioa = 0 bada, ez duela asmatu izango da.
      }

      public String getStrAsmatutakoa() {
            return new String(asmatutakoa);
      }

      public int getPuntuazioa() {
            return puntuazioa;
      }

      public char[] getAsmatutakoa() {
            return asmatutakoa;
      }

      public String getHitza() {
            return hitza;
      }

      public String getPista() {
            return pista;
      }

      public void setAsmatutakoa(char[] asmatutakoa) {
            this.asmatutakoa = asmatutakoa;
      }

      public void setHitza(String hitza) {
            this.hitza = hitza;
      }

      public void setHitza(int puntuazioa) {
            this.puntuazioa = puntuazioa;
      }

      public void setPista(String pista) {
            this.pista = pista;
      }

      public int hitzBatAukeratu() {
            //FITXATEGI GABE IRAKURTZEKO:
            /*String[] hitzak = {"TURROIA", "OILASKOA", "BONBOIAK", "LINTERNA", "OLATUA", "HONDARTZA", "PROGRAMAZIOA", "HIZKUNTZA", "JAVA", "ORDENAGAILUA", "IGERILEKUA", "OPORRAK", "HITZA", "ESALDIA", "TELEFONOA", "TXORIZOA", "GAZTA", "SUDADERA", "URDINA", "URTARRILA"};
            int pos = (int)((Math.random()* hitzak.length)- 1);
            this.setHitza(hitzak[pos]);*/
            ArrayList<String> hitzak = new ArrayList<>();

            String name;

            try {
                  FileReader ireki = new FileReader("/txtak/hitzak.txt");
                  BufferedReader info = new BufferedReader(ireki);
                  while ((name = info.readLine()) != null) {
                        hitzak.add(name);
                  }
                  ireki.close();
            } catch (Exception e) {
                  System.out.println("Fitxategitik errorea.");
            }

            int pos = (int) (Math.random() * (hitzak.size() - 1));
            String[] stringArray = hitzak.toArray(new String[hitzak.size()]);
            hitza = stringArray[pos];
            return pos;
      }

      public String pistaEzarri(int pos) {
            ArrayList<String> pistak = new ArrayList<>();
            char pista[];
            String hitzOsoa;
            int i = 0;
            try {
                  /*FileReader ireki = new FileReader("/txtak/pistak.txt");
                  BufferedReader info = new BufferedReader(ireki);*/
                  InputStream ireki = Hitza.class.getClassLoader().getResourceAsStream("/txtak/pistak.txt");
                  while ((ireki.read()) != -1) {
                        pista = new (ireki.read());
                        while(pista[i] != '\n'){
                              
                        }
                        pistak.add(hitzOsoa);
                        //pistak.add(pista);
                  }
                  /*while ((pista = info.readLine()) != null) {
                        pistak.add(pista);
                  }*/
                  ireki.close();
            } catch (Exception e) {
                  System.out.println("Fitxategitik errorea.");
            }
            
            String[] stringArrayPista = pistak.toArray(new String[pistak.size()]);
            return stringArrayPista[pos];
      }

      public void gordePuntuazioa() {
            String saludo="Hola mundo";
            try {
                  //Crear un objeto File se encarga de crear o abrir acceso a un artxiboa que se especifica en su constructor
                  File artxiboa = new File("puntuak.txt");

                  //Crear objeto FileWriter que sera el que nos ayude a idatzi sobre artxiboa
                  FileWriter idatzi = new FileWriter(artxiboa, true);

                  //Escribimos en el artxiboa con el metodo write
                  idatzi.write("Partida berria: " + saludo + "\n");

                  //Cerramos la conexion
                  idatzi.close();
            } //Si existe un problema al idatzi cae aqui
            catch (Exception e) {
                  System.out.println("Fitxategia idazteean errorea.");
            }
      }

      public boolean egiaztatu(char hizkia) {
            boolean aurkituta = false;
            hizkia = Character.toUpperCase(hizkia);
            for (int i = 0; i < hitza.length(); i++) {
                  if (hitza.charAt(i) == hizkia) {
                        aurkituta = true;
                        asmatutakoa[i] = hizkia;
                  }
            }
            return aurkituta;
      }

      public boolean asmatua() {
            boolean asmatua = false;
            String asmatutakoStr = String.valueOf(asmatutakoa);
            if (hitza.equals(asmatutakoStr)) {
                  asmatua = true;
            }

            return asmatua;
      }
}
