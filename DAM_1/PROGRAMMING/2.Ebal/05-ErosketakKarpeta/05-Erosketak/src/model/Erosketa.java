package model;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author elorza.karmele
 */
public class Erosketa {

      protected String kodea;
      protected LocalDate data;
      protected Bezeroa bezeroa;
      protected ArrayList<Produktua> produktuak;
      protected ArrayList<Integer> unitateak;
      protected double guztira;

      public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
            this.kodea = kodea;
            this.bezeroa = bezeroa;
            this.guztira = guztira;
      }

      public Erosketa(String kodea, LocalDate data, Bezeroa bezeroa, ArrayList<Produktua> produktuak, ArrayList<Integer> unitateak, double guztira) {
            this.kodea = kodea;
            this.data = data;
            this.bezeroa = bezeroa;
            this.produktuak = produktuak;
            this.unitateak = unitateak;
            this.guztira = guztira;
      }

      public String toStringLuzea() {
            return "EROSKETA\n" + "\tKodea: " + kodea + "\tData: " + data + "\n\tBezeroa: " + bezeroa.getKodea() + "\n\tIzena: " + bezeroa.getIzena() + "\n\tHelbidea: " + bezeroa.getHelbidea() + "\n\tEmaila: " + bezeroa.getEmaila() + "\n\t" + "PRODUKTUAK:\n\t" + produktuak + ", " + unitateak + ", " + "\n\t\tGUZTIRA: " + guztira;
      }
     
      @Override
      public String toString() {
            return "Erosketa{" + "kodea=" + kodea + ", bezeroa=" + bezeroa + ", guztira=" + guztira + "}\n";
      }

      public boolean guztiraEgiaztatu() {
            boolean egiaztatua = false;
            double prezioOsoa = 0.0;

            for (int i = 0; i < produktuak.size(); i++) {
                  prezioOsoa = prezioOsoa + (unitateak.get(i) * produktuak.get(i).getPrezioa());
            }
            if (guztira == prezioOsoa) {
                  egiaztatua = true;
            }

            return egiaztatua;
      }

      public String getKodea() {
            return kodea;
      }

      public LocalDate getData() {
            return data;
      }

      public Bezeroa getBezeroa() {
            return bezeroa;
      }

      public ArrayList<Produktua> getProduktuak() {
            return produktuak;
      }

      public ArrayList<Integer> getUnitateak() {
            return unitateak;
      }

      public double getGuztira() {
            return guztira;
      }

      public void setKodea(String kodea) {
            this.kodea = kodea;
      }

      public void setData(LocalDate data) {
            this.data = data;
      }

      public void setBezeroa(Bezeroa bezeroa) {
            this.bezeroa = bezeroa;
      }

      public void setProduktuak(ArrayList<Produktua> produktuak) {
            this.produktuak = produktuak;
      }

      public void setUnitateak(ArrayList<Integer> unitateak) {
            this.unitateak = unitateak;
      }

      public void setGuztira(double guztira) {
            this.guztira = guztira;
      }
      
}
