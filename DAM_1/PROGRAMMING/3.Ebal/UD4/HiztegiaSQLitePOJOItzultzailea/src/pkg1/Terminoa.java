
package pkg1;

/**
 *
 * @author elorza.karmele
 */
public class Terminoa {
      private int id;
      private String euskaraz;
      private String gazteleraz;

      public Terminoa(int id, String euskaraz, String gazteleraz) {
            this.id = id;
            this.euskaraz = euskaraz;
            this.gazteleraz = gazteleraz;
      }

      public int getId() {
            return id;
      }

      public String getEuskaraz() {
            return euskaraz;
      }

      public String getGazteleraz() {
            return gazteleraz;
      }
      
      public void setId(int id) {
            this.id = id;
      }
      
      public void setEuskaraz(String euskaraz) {
            this.euskaraz = euskaraz;
      }

      public void setGazteleraz(String gazteleraz) {
            this.gazteleraz = gazteleraz;
      }

      @Override
      public String toString() {
            return "Terminoa{" + "id=" + id + ", euskaraz=" + euskaraz + ", gazteleraz=" + gazteleraz + '}';
      }
}
