package model;

/**
 *
 * @author elorza.karmele
 */
public class Enpresa implements Bezeroa {

      private int kodea;
      private String izenJuridikoa;
      private String izenKomertziala;
      private String helbidea;
      private String[] kontaktoenEmailak;

      public Enpresa(int kodea, String izenJuridikoa, String izenKomertziala, String helbidea, String[] emaila) {
            this.kodea = kodea;
            this.izenJuridikoa = izenJuridikoa;
            this.izenKomertziala = izenKomertziala;
            this.helbidea = helbidea;
            this.kontaktoenEmailak = emaila;
      }

      @Override
      public int getKodea() {
            return kodea;
      }

      @Override
      public String getIzena() {
            return izenKomertziala;
      }

      @Override
      public String getHelbidea() {
            return helbidea;
      }

      @Override
      public String getEmaila() {
            return kontaktoenEmailak[0];
      }

      public void setKodea(int kodea) {
            this.kodea = kodea;
      }

      public void setIzenJuridikoa(String izenJuridikoa) {
            this.izenJuridikoa = izenJuridikoa;
      }

      public void setIzenKomertziala(String izenKomertziala) {
            this.izenKomertziala = izenKomertziala;
      }

      public void setHelbidea(String helbidea) {
            this.helbidea = helbidea;
      }

      public void setKontaktoenEmailak(String[] kontaktoenEmailak) {
            this.kontaktoenEmailak = kontaktoenEmailak;
      }

      @Override
      public String toString() {
            return "Enpresa{" + "kodea=" + kodea + ", izenJuridikoa=" + izenJuridikoa + ", izenKomertziala=" + izenKomertziala + ", helbidea=" + helbidea + ", kontaktoenEmailak=" + kontaktoenEmailak + '}';
      }

     

}
