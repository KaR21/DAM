
public class HiruLaukiSortu {

    public static void main(String[] args) {   // Program entry point
        // Declare and Construct an instance of the Circle class called c1
        Laukia l1 = new Laukia(5, 1);  // Use 3rd constructor

        // Declare and Construct another instance of the Circle class called c2*/
        Laukia l2 = new Laukia(1, 2);  // Use 2nd constructor

        // Declare and Construct yet another instance of the Circle class called c3*/
        Laukia l3 = new Laukia(2, 2);  // Use 1st constructor

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        System.out.printf("l1 mota: %s\n", l1.getMota());
        System.out.printf("l2 mota: %s\n", l2.getMota());
        System.out.printf("l3 mota: %s\n", l3.getMota());
    }
}
