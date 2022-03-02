/**
 *
 * @author elorza.karmele
 */
public class PrintCheckerPattern {
    public static void main(String[] args) { 
        int i = 0, j = 0;
        
        System.out.println("* * * * * "); 
        System.out.println(" * * * * *");
        System.out.println("* * * * * "); 
        System.out.println(" * * * * *"); 
        System.out.println("* * * * * ");
        System.out.println(); 
        
        System.out.println("----------");
        System.out.println();
        
        for(i = 0; i < 5; i++)
        {
            for(j = 0; j < 10; j++){
                if((i % 2) == 0 && (j % 2)== 0){
                System.out.print("*"); 
                }
                else{
                    if((i % 2) != 0 && (j % 2)!= 0){
                        System.out.print("*"); 
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
