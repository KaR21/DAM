
package herentzia.abstraktoak;



/**
 *
 * @author elorza.karmele
 */
public class AirWaterMonster extends WaterMonster {
      public AirWaterMonster(String name) {
            super(name);
   }
   /** Subclass provides actual implementation for attack() */
      @Override
   public String attack() {
      return "Attack with air and water!";
   }
}
