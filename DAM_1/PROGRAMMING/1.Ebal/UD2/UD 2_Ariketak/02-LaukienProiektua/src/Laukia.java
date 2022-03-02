
public class Laukia {

    private int zabalera;
    private int altuera;

    // Constructors (overloaded)
    /**
     * Laukia eraikitzen du zabalera eta altuera batez
     */
    public Laukia() {                   // 1st Constructor (default constructor)
        zabalera = 5;
        altuera = 5;
    }

    /**
     * Laukia eraikitzen du zabalera eta altuera batez
     *
     * @param zab Laukiaren zabalera
     * @param alt Laukiaren altuera
     */
    public Laukia(int zab, int alt) {           // 2nd Constructor
        zabalera = zab;
        altuera = alt;
    }

    //BI ERATARA ONDO
    /*public Laukia(int zabalera, int altuera) {           // 2nd Constructor
        this.zabalera = zabalera;
        this.altuera = altuera;
    }*/
    /**
     *
     * @return zabalera
     */
    public int getZabalera() {
        return zabalera;
    }

    /**
     *
     * @return altuera
     */
    public int getAltuera() {
        return altuera;
    }

    /**
     *
     * @return azalera
     */
    public int getAzalera() {
        return zabalera * altuera;
    }

    /**
     *
     * @return perimetroa
     */
    public int getPerimetroa() {
        return (2 * altuera) + (2 * zabalera);
    }

    public String getMota() {
        if (zabalera > altuera) {
            return "horizontala";
        } else {
            if (zabalera < altuera) {
                return "bertikala";
            } else {
                return "karratua";
            }
        }
    }

    @Override
    public String toString() {
        return "Laukia[" + zabalera + "x" + altuera + "]";
        //BERDINAK
        //return this.getClass().getName() + "[" + zabalera + "x" + altuera + "]";
    }

    /**
     *
     * @param zabaleraBerria ezarri
     */
    public void setZabalera(int zabaleraBerria) {
        this.zabalera = zabaleraBerria;
    }

    /**
     *
     * @param altueraBerria ezarri
     */
    public void setAltuera(int altueraBerria) {
        this.altuera = altueraBerria;
    }

    public void marraztuBeteta() {
        int row, col;

        for (row = 0; row < getAltuera(); row++) {
            for (col = 0; col < getZabalera(); col++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        System.out.printf("\n\n");
    }

    public void marraztuHutsik() {
        int row, col;

        for (row = 0; row < getAltuera(); row++) {
            for (col = 0; col < getZabalera(); col++) {
                if (row == 0 || row == getAltuera() - 1 || col == 0 || col == getZabalera() - 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.printf("\n");
        }
    }

    public boolean isBiggerThan(Laukia l) {
        boolean handiago = false;

        if (this.getAzalera() > l.getAzalera()) {
            handiago = true;
        }

        return handiago;
    }

    public static Laukia getTheBiggest(Laukia[] lk) {
        Laukia max = lk[0];

        for (int i = 1; i < lk.length && lk[i] != null; i++) {
            if (lk[i].isBiggerThan(max)) {
                max = lk[i];
            }
        }

        return max;
    }
}
