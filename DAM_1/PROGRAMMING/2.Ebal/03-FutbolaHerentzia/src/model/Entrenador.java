
package model;

/**
 *
 * @author elorza.karmele
 */
public class Entrenador extends IntegranteSeleccion {
      private String idFederacion;
      
      
      public Entrenador() {

      }

      public Entrenador(String idFederacion, int id, String nombre, int edad, String apellidos) {
            super(id, nombre, edad, apellidos);
            this.idFederacion = idFederacion;
      }

      public String getIdFederacion() {
            return idFederacion;
      }

      public void setIdFederacion(String idFederacion) {
            this.idFederacion = idFederacion;
      }
      
      public void dirigirEntrenamiento(){
            System.out.println("Dirigir entrenamiento.");
      }
      
      public void dirigirPartido(){
            System.out.println("Dirigir partido.");
      }
          
}
