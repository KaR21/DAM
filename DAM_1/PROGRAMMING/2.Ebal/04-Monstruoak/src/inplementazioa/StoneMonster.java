package inplementazioa;

public class StoneMonster implements Monstruosoa {

      String name;

      public StoneMonster(String name) {
            this.name = name;
      }

      /**
       * Subclass provides actual implementation for attack()
       */

      @Override
      public String attack() {
            return "Attack with stones!";
      }
}
