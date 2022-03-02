package probak;

import model.Zatikia;

public class ZatikiaDenak {

    public static void main(String[] args) {
        Zatikia zatikiak[] = new Zatikia[5], zat1 = new Zatikia(), zat2 = new Zatikia(), biderketa;
        boolean baliokidea, handiago;

        System.out.println(zat1);
        System.out.println(zat2);

        System.out.printf("\n");
        biderketa = Zatikia.biderkatu(zat1, zat2);
        zat1.batu(zat2);
        System.out.printf("Biderketa: %s\n", biderketa);
        System.out.printf("Batuketa: %s\n", zat1);

        System.out.printf("\n");
        zat1.Zatikia("40/7");
        System.out.printf("String konstruktorea: %s\n", zat1);

        System.out.printf("\n");
        baliokidea = zat1.isBaliokidea(zat2);
        System.out.printf("Zatikiak baliokideak dira?: %s\n", baliokidea);

        System.out.printf("\n");
        handiago = zat1.isBiggerThan(zat2);
        System.out.printf("Zat1 zatikia zat2 zatikia baino handiagoa da?: %s\n", handiago);

        System.out.printf("\n");
        for (int i = 0; i < zatikiak.length; i++) {

            zatikiak[i] = new Zatikia((((int) (Math.random() * 9)) + 1), (((int) (Math.random() * 9)) + 1));
            System.out.printf("%d. Zatikia zatikia: %s\n", i, zatikiak[i]);
        }
        Zatikia.zatikiakOrdenatu(zatikiak);
        System.out.printf("\n");
        for (int i = 0; i < zatikiak.length; i++) {
            System.out.printf("%d. Zatikia zatikia: %s\n", i, zatikiak[i]);
        }
    }
}
