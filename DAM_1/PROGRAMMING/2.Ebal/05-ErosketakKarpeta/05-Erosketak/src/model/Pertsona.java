
package model;

/**
 *
 * @author elorza.karmele
 */
public class Pertsona implements Bezeroa {
      private int kodea;
      private String izena;
      private String abizena;
      private String helbidea;
      private String emaila;
      
      @Override
      public int getKodea() {
            return kodea;
      }
      
      @Override
      public String getIzena() {
            return izena;
      }
      
      @Override
      public String getHelbidea() {
            return helbidea;
      }
      
      @Override
      public String getEmaila() {
            return emaila;
      }
      public Pertsona() {
      }
      
      public Pertsona(int kodea, String izena, String abizena, String helbidea, String emaila) {
            this.kodea = kodea;
            this.izena = izena;
            this.abizena = abizena;
            this.helbidea = helbidea;
            this.emaila = emaila;
      }

      public void setKodea(int kodea) {
            this.kodea = kodea;
      }

      public void setIzena(String izena) {
            this.izena = izena;
      }

      public void setAbizena(String abizena) {
            this.abizena = abizena;
      }

      public void setHelbidea(String helbidea) {
            this.helbidea = helbidea;
      }

      public void setEmaila(String emaila) {
            this.emaila = emaila;
      }

      public String getAbizena() {
            return abizena;
      }

      /*@Override
      public String toString() {
            return kodea + "\n\tIzena: " + izena + " " + abizena + "\n\tHelbidea: " + helbidea + "\n\tEmaila: " + emaila;
      }*/

      @Override
      public String toString() {
            return "Pertsona{" + "kodea=" + kodea + ", izena=" + izena + ", abizena=" + abizena + ", helbidea=" + helbidea + ", emaila=" + emaila + '}';
      }
      
      
      
}
