
package model;
import java.time.LocalDate;
import java.util.ArrayList;
import model.Bezeroa;
/**
 *
 * @author elorza.karmele
 */
public class EpekakoErosketa extends Erosketa{
      private int epeak = 12;
      private boolean ordainketaBukatua = false;
      private double kuota;
      
      public EpekakoErosketa(String kodea, LocalDate data, Bezeroa eroslea, ArrayList <Produktua> produktuak,ArrayList <Integer> unitateak, double guztira, double kuota){
           super(kodea, data, eroslea, produktuak, unitateak, guztira);
           this.kuota = kuota; 
      }
      
      public double gainetikOrdainduBeharrekoa(){ 
            return kuota * epeak - guztira;
      }

      public void setEpeak(int epeak) {
            this.epeak = epeak;
      }

      public void setOrdainketaBukatua(boolean ordainketaBukatua) {
            this.ordainketaBukatua = ordainketaBukatua;
      }

      public void setKuota(double kuota) {
            this.kuota = kuota;
      }

      public int getEpeak() {
            return epeak;
      }

      public boolean isOrdainketaBukatua() {
            return ordainketaBukatua;
      }

      public double getKuota() {
            return kuota;
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
      
}
