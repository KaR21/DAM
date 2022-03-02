/**
 *
 * @author elorza.karmele
 */
public class PrintCheckerSquare {
    public static void main(String[] args) { 
        int i = 0, j = 0;
        
        System.out.println("* * * * *"); 
        System.out.println("*       *");
        System.out.println("*       *"); 
        System.out.println("*       *"); 
        System.out.println("* * * * *");
        System.out.println(); 
        
        System.out.println("----------");
        System.out.println();
        
        for(i = 0; i < 5; i++){
            if(i == 0 || i == 4){
                for(j = 0; j < 10; j++){
                    if((j % 2)== 0){
                        System.out.print("*"); 
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            else{
                for(j = 0; j < 10; j++){
                    if(j == 0 || j == 8){
                        System.out.print("*"); 
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
