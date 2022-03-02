
package testak;

import model.Hitza;

public class TestHitza {
      public static void main(String[] args) {
            Hitza hitz1 = new Hitza();
            hitz1.hitzBatAukeratu();
            System.out.println(hitz1.getHitza());
            if(hitz1.egiaztatu('a')){
                  System.out.println("OK");
            }
      }
}
