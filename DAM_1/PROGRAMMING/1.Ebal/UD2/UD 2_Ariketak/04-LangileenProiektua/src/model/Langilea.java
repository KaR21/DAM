package model;

public class Langilea {
    private int id;
    private String izena;
    private String abizena;
    private double soldata;
    private Zatikia lanaldia = new Zatikia("1/1");

    public void setLanaldia(Zatikia lanaldia) {
        if(lanaldia.hamartarBaliokidea() >= 0 && lanaldia.hamartarBaliokidea() < 1){
            this.lanaldia = lanaldia;
        }
        else{
            System.out.println("Zure zatikia unitatea baino gehiago edo zatiki negatiboa denez, 1/1 hartuko da.");
        }
    }

    public Zatikia getLanaldia() {
        return lanaldia;
    }

    public Langilea(int id, String izena, String abizena, double soldata) {
        this.id = id;
        this.izena = izena;
        this.abizena = abizena;
        this.soldata = soldata;
    }

    public int getId() {
        return id;
    }

    public String getIzena() {
        return izena;
    }

    public String getAbizena() {
        return abizena;
    }
    
    public String getIzenOsoa() {
        return izena + abizena;
    }
    
    public double getSoldata() {
        return soldata;
    }
    
    public double getUrtekoSoldata() {
        return soldata*12;
    }
    
    public void setSoldata(double soldata) {
        this.soldata = soldata;
    }
    
    public double soldataIgo(int portzentaia){
        double soldataBerria;
        
        soldataBerria = this.getSoldata() + (this.getSoldata() * ((double)portzentaia/100));
       
        return soldataBerria;
    }

    @Override
    public String toString() {
        return "Langilea[" + "id=" + id + ", izena=" + (izena + " " + abizena) + ", soldata=" + soldata + ']';
    }
    
    public static Langilea[] nireHamarLagunLangile(){
        Langilea[] langile = new Langilea[10];
        
        langile[0] = new Langilea(2, "Jon", "Alberdi", 10);
        langile[1] = new Langilea(3, "Hodei", "Olivas", 20);
        langile[2] = new Langilea(4, "Markel", "Solaguren", 30);
        langile[3] = new Langilea(5, "Erlantz", "Garate", 40);
        langile[4] = new Langilea(6, "Telmo", "Roldan", 50);
        langile[5] = new Langilea(7, "Markel", "Lomana", 60);
        langile[6] = new Langilea(8, "Joseba", "Arginzoniz", 70);
        langile[7] = new Langilea(9, "Leire", "Renedo", 80);
        langile[8] = new Langilea(10, "Alain", "Basterra", 90);
        langile[9] = new Langilea(11, "Peru", "Aguirre", 100);
        
        return langile;
    }
    
    public static Langilea bilatu(Langilea[] langile, String izena){
        int i = 0, aurkitua = 0;
        while(i < langile.length && aurkitua == 0){
            if(langile[i].getIzena().equals(izena)){
                aurkitua = 1;
            }
            i++;
        }
        if(aurkitua == 1){
            return langile[i-1];
        }
        else{
            return null;
        }
    }
    
    
    
}
