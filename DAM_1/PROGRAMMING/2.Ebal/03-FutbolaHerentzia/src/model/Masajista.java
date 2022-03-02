package model;

/**
 *
 * @author elorza.karmele
 */
public class Masajista extends IntegranteSeleccion {

      private String titulacion;
      private int aniosExperiencia;

      public Masajista() {

      }

      public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, int edad, String apellidos) {
            super(id, nombre, edad, apellidos);
            this.titulacion = titulacion;
            this.aniosExperiencia = aniosExperiencia;
      }

      public String getTitulacion() {
            return titulacion;
      }

      public int getAniosExperiencia() {
            return aniosExperiencia;
      }

      public void setTitulacion(String titulacion) {
            this.titulacion = titulacion;
      }

      public void setAniosExperiencia(int aniosExperiencia) {
            this.aniosExperiencia = aniosExperiencia;
      }

      public void darMasaje() {
            System.out.println("Dar masaje.");
      }

}
