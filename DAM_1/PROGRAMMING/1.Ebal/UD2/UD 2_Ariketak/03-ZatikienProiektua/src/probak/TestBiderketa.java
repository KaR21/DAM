
package probak;

import model.Zatikia;

public class TestBiderketa {
    public static void main(String[] args) {
        Zatikia zat1 = new Zatikia();
        Zatikia zat2 = new Zatikia();
        Zatikia erantzuna;
        
        System.out.println(zat1);
        System.out.println(zat2);
        
        erantzuna = Zatikia.biderkatu(zat1, zat2);
        
        System.out.println(erantzuna);
    }
}
