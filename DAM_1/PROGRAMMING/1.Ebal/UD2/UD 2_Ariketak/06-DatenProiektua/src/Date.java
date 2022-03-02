
public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void setDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%4d/%02d/%02d", year, month, day);
    }
    
    public String getHilabeteaLetretan( ){
        String hilabetea[] = {"Urtarrila","Otsaila","Martxoa","Apirila","Maiatza","Ekaina","Uztaila","Abuztua","Iraila","Urria","Azaroa","Abendua"};
        return hilabetea[this.month - 1];
    }
    
    public String getHilabeteaLetretan(String hizkuntza){
        int hizk = 0, hila = this.month - 1;
        String[][] hilabeteak ={{"Urtarrila","Otsaila","Martxoa","Apirila","Maiatza","Ekaina","Uztaila","Abuztua","Iraila","Urria","Azaroa","Abendua"},{"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"},{"January","February","March","April","May","June","July","August","September","October","November","December"}};
        
        switch(hizkuntza){
            case "EU":
                hizk = 0;
                break;
            case "ES":
                hizk = 1;
                break;
            case "EN":
                hizk = 2;
                break;
            
        }
        return hilabeteak[hizk][hila];
    }
}
