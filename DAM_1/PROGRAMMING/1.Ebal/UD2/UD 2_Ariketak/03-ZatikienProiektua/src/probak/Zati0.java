package probak;

public class Zati0 {
    public static void main(String[] args) {
        System.out.println("16 / 8 = " + 16/8);
        try{
            System.out.println("16 / 0 = " + 16/0);
        }catch(ArithmeticException ex){
            System.out.println("Ez dakit 0 gatik zatitzen.");
        }
        
        //int / int = int beraz, bietako bat double bihurtu beharko genuke.
        System.out.println("7 / 8 = " + (double)7/8);
    }
}
