package model;

/**
 *
 * @author elorza.karmele
 */
public class Futbolista extends IntegranteSeleccion {

      private int dorsal;
      private Demarkazioa Demarcacion;

      
      public Futbolista() {
            
      }

      public Futbolista(int dorsal, Demarkazioa Demarcacion, int id, String nombre, int edad, String apellidos) {
            super(id, nombre, edad, apellidos);
            this.dorsal = dorsal;
            this.Demarcacion = Demarcacion;
      }

      public int getDorsal() {
            return dorsal;
      }

      public Demarkazioa getDemarcacion() {
            return Demarcacion;
      }

      public void setDorsal(int dorsal) {
            this.dorsal = dorsal;
      }

      public void setDemarcacion(Demarkazioa Demarcacion) {
            this.Demarcacion = Demarcacion;
      }
      
      public void entrenar(){
            System.out.println("Entrenar.");
      }
      
      public void jugarPartido(){
            System.out.println("Jugar partido.");
      }    
      
      @Override
      public String toString() {
            return "Futbolista{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + this.getApellidos() + ", edad=" + this.getEdad() + ", dorsal=" + dorsal + ", Demarcacion=" + Demarcacion + '}';
      }
         
}
