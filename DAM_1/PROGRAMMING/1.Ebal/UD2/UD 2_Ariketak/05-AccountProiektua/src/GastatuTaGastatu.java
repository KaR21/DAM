
public class GastatuTaGastatu {
    public static void main(String[] args) {
        
        Account newA = new Account("01-21", "Karmele", 1000);
        int zenbat = 150;
        int zenbatetan = 0;
        
        while(newA.getBalance() > zenbat){
            newA.debit(zenbat);
            zenbatetan++;
        }
        
        System.out.println("Triste nago; " + zenbat + " euro atera ditut " + zenbatetan + " aldiz eta orain " + newA.getBalance() + " euro besterik ez zait geratzen kontuan.:-("); 
    }
}
