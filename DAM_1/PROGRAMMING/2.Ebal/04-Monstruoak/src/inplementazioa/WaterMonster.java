package inplementazioa;

public class WaterMonster implements Monstruosoa {

      String name;

      public WaterMonster(String name) {
            this.name = name;
      }

      /**
       * Subclass provides actual implementation for attack()
       */
      @Override
      public String attack() {
            return "Attack with water!";
      }
}
