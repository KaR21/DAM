
package model;

/**
 *
 * @author elorza.karmele
 */
public class IntegranteSeleccion {
      protected int id;
      protected String nombre;
      private int edad;
      private String apellidos;
      
      
      public IntegranteSeleccion() {

      }
      
      public IntegranteSeleccion(int id, String nombre, int edad, String apellidos) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            this.apellidos = apellidos;
      }

      public int getId() {
            return id;
      }

      public String getNombre() {
            return nombre;
      }

      public int getEdad() {
            return edad;
      }

      public String getApellidos() {
            return apellidos;
      }

      public void setId(int id) {
            this.id = id;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public void setEdad(int edad) {
            this.edad = edad;
      }

      public void setApellidos(String apellidos) {
            this.apellidos = apellidos;
      }

      @Override
      public String toString() {
            return "IntegranteSeleccion{" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", apellidos=" + apellidos + '}';
      }
      
      public void concentrarse(){
            System.out.println("Concentrarse.");
      }
      
      public void viajar(){
            System.out.println("Viajar.");
      }    
}
