
package exekutagarriak;
import model.Langilea;
public class NiLangile {
    public static void main(String[] args) {
        Langilea langile = new Langilea(1,"Karmele", "Elorza", 21000);
        Langilea[] langileGuztiak;
        double soldataBerria;
        
        System.out.println(langile);
        System.out.println("Langilearen urteko soldata hau da: " + langile.getUrtekoSoldata());
        soldataBerria = langile.soldataIgo(50);
        langile.setSoldata(soldataBerria);
        System.out.println(langile);
        langileGuztiak = Langilea.nireHamarLagunLangile();
        printStringArray(langileGuztiak);
        
        Langilea langileBat = Langilea.bilatu(langileGuztiak, "Karmele");
        System.out.println(langileBat);
        langileBat = Langilea.bilatu(langileGuztiak, "Alain");
        System.out.println(langileBat);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println("---------LANGILEAK-------");
        System.out.printf("ID\tIZENA\tABIZENA\t\t\tSOLDATA\n");
        System.out.printf("================================================================\n");
        for(int i = 0; i < langileGuztiak.length; i++)
        {
            System.out.printf("%d\t%s\t%s\t\t\t%f\n", langileGuztiak[i].getId(), langileGuztiak[i].getIzena(),langileGuztiak[i].getAbizena(), langileGuztiak[i].getSoldata());
        }
        
    }
    
    public static void printStringArray(Langilea items[]) 
    {
        System.out.printf("Langileen arraia hau da: \n");
        for(int i=0; i<items.length; i++)
        {
            System.out.println(items[i]);
        }
        System.out.println();
    }
}
