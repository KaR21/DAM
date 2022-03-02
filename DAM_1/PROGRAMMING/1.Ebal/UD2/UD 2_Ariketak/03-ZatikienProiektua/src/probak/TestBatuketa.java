
package probak;

import model.Zatikia;

public class TestBatuketa {
    public static void main(String[] args) {
        Zatikia zat1 = new Zatikia();
        Zatikia zat2 = new Zatikia();
        
        System.out.println(zat1);
        System.out.println(zat2);
        
        zat1.batu(zat2);
        
        System.out.println(zat1);
    }
}
