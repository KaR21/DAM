
public class Konbertsioak {
    public static void main(String[] args) {
        
        //String => int
        int aldagai0 = Integer.valueOf("0");
        int aldagai1 = Integer.parseInt("1");
        

        //int => String
        String aldagai2 = String.valueOf(2);
        String aldagai3 = "" + 3;
        String aldagai4 = String.format("%d", 4);
        String aldagai5 = Integer.toString(5);
        
        //double => String        
        String aldagai6 = String.valueOf(6.6666666);
        String aldagai7 = String.format("%10.2f", 7.77777777);
        
        //String => double
        double aldagai8 = Double.parseDouble("8");
        
        //char[] => String
        char[] charArray = new char[8];
        String Str = new String(charArray);
        System.out.println(Str);
    }
}   

