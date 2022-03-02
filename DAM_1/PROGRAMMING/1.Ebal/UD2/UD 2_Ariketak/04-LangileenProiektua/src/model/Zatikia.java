package model;

public class Zatikia {

    private int zenb; //goikoa
    private int izend; //behekoa

    public Zatikia() {           // 1st Constructor
        zenb = ((int) (Math.random() * 9)) + 1;
        izend = ((int) (Math.random() * 9)) + 1;
    }

    public Zatikia(int zenbakitzailea, int izendatzailea) {           // 2nd Constructor
        zenb = zenbakitzailea;
        izend = izendatzailea;
    }
    
    public Zatikia(String zatIdatzia) {
        // "40/7" erakoa izango da stringa
        int barraLen = zatIdatzia.indexOf("/");
        int strLen = zatIdatzia.length();

        String strGoikoa = zatIdatzia.substring(0, barraLen);
        String strBehekoa = zatIdatzia.substring(barraLen + 1, strLen);

        int zenbakitzailea = Integer.parseInt(strGoikoa);
        //int zenbakitzailea = Integer.valueOf(strGoikoa);//they are the same
        int izendatzailea = Integer.parseInt(strBehekoa);

        //INTEGER ==> STRING
        //strGoikoa = "" + intGoikoa;
        //edo
        //Integer.toString(strGoikoa);
        this.izend = izendatzailea;
        this.zenb = zenbakitzailea;
    }

    public int getZenbakitzailea() {
        return zenb;
    }

    public int getIzendatzailea() {
        return izend;
    }

    @Override
    public String toString() {
        return "Zatikia[" + zenb + "/" + izend + "]";
    }

    public void setZenbakitzailea(int zenba) {
        this.zenb = zenba;
    }

    public void setIzendatzailea(int izenda) {
        this.izend = izenda;
    }

    public static Zatikia biderkatu(Zatikia zat1, Zatikia zat2) {

        Zatikia biderketa = new Zatikia();

        biderketa.zenb = zat1.zenb * zat2.zenb;
        biderketa.izend = zat1.izend * zat2.izend;

        return biderketa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.zenb;
        hash = 53 * hash + this.izend;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Zatikia other = (Zatikia) obj;
        if (this.zenb != other.zenb) {
            return false;
        }
        if (this.izend != other.izend) {
            return false;
        }
        return true;
    }

    public static Zatikia batu(Zatikia zat1, Zatikia zat2) {
        Zatikia batura = new Zatikia();
        int batu1, batu2;

        batura.izend = zat1.getIzendatzailea() * zat2.getIzendatzailea();
        batu1 = (int) (batura.getIzendatzailea() / zat1.getIzendatzailea()) * zat1.getZenbakitzailea();
        batu2 = (int) (batura.getIzendatzailea() / zat2.getIzendatzailea()) * zat2.getZenbakitzailea();
        batura.zenb = batu1 + batu2;
        batura.sinplifikatu();

        return batura;
    }

    public void batu(Zatikia besteZatBat) {
        Zatikia erantzuna;

        erantzuna = Zatikia.batu(this, besteZatBat);

        this.setIzendatzailea(erantzuna.getIzendatzailea());
        this.setZenbakitzailea(erantzuna.getZenbakitzailea());

        this.sinplifikatu();
    }

    public int mkt() {
        int u = Math.abs(zenb); //valor absoluto del numerador
        int v = Math.abs(izend); //valor absoluto del denominador
        if (v == 0) {
            return u;
        }
        int r;
        while (v != 0) {
            r = u % v;
            u = v;
            v = r;
        }
        return u;
    }

    public void sinplifikatu() {
        int n = mkt(); //se calcula el mcd de la fracción
        zenb = zenb / n;
        izend = izend / n;
    }

    /*public void sinplifikatu() {
        if (getIzendatzailea() > getZenbakitzailea()) {
            for (int i = getIzendatzailea(); i > 0; i--) {
                if (getIzendatzailea() % i == 0 && getZenbakitzailea() % i == 0) {
                    setIzendatzailea(getIzendatzailea() / i);
                    setZenbakitzailea(getZenbakitzailea() / i);
                }
            }
        } else {
            for (int i = getZenbakitzailea(); i > 0; i--) {
                if (getIzendatzailea() % i == 0 && getZenbakitzailea() % i == 0) {
                    setIzendatzailea(getIzendatzailea() / i);
                    setZenbakitzailea(getZenbakitzailea() / i);
                }
            }
        }
    }*/
    public double hamartarBaliokidea() {
        return (double) this.zenb / this.izend;
    }

    public boolean isBaliokidea(Zatikia besteZatikiBat) {
        boolean emaitza = false;

        if (this.hamartarBaliokidea() == besteZatikiBat.hamartarBaliokidea()) {
            emaitza = true;
        }

        return emaitza;
    }

    public boolean isBiggerThan(Zatikia besteZatikiBat) {
        boolean handiago = false;

        if ((this.zenb / this.izend) >= (besteZatikiBat.zenb / besteZatikiBat.izend)) {
            handiago = true;
        }

        return handiago;
    }

    public static void zatikiakOrdenatu(Zatikia[] zatikiak) { //VA MAL, NO FURULA
        Zatikia tmp = new Zatikia();

        for (int i = 0; i < zatikiak.length - 1; i++) {
            zatikiak[i].sinplifikatu();
            for (int j = i + 1; j < zatikiak.length; j++) {

                zatikiak[j].sinplifikatu();
                if (zatikiak[i].isBiggerThan(zatikiak[j])) {
                    tmp.setZenbakitzailea(zatikiak[i].getZenbakitzailea());
                    tmp.setIzendatzailea(zatikiak[i].getIzendatzailea());

                    zatikiak[i].setZenbakitzailea(zatikiak[j].getZenbakitzailea());
                    zatikiak[i].setIzendatzailea(zatikiak[j].getIzendatzailea());

                    zatikiak[j].setZenbakitzailea(tmp.getZenbakitzailea());
                    zatikiak[j].setIzendatzailea(tmp.getIzendatzailea());
                }
            }
        }
    }
}
