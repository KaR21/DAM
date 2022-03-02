package model;

/**
 *
 * @author elorza.karmele
 */
/**
 *
 * MyPoint klasea puntuen kudeaketa burutuko duen klasea izango da.
 */
public class MyPoint {

    private int x;
    private int y;

    public MyPoint() {

    }

    /**
     *
     * @param x -ek puntuaren x posizioa gordeko du.
     * @param y -ek puntuaren y posizioa gordeko du.
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return -ek puntuaren distantzia kalkulatu eta itzuli egingo du.
     */
    public double distance() {
        double dx, dy, d;

        dx = Math.pow(this.x - 0, 2);
        dy = Math.pow(this.y - 0, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    /**
     *
     * @param another beste puntu bat izango da.
     * @return -ek puntuaren distantzia beste puntu batekiko kalkulatu eta
     * itzuli egingo du.
     */
    public double distance(MyPoint another) {
        double dx, dy, d;

        dx = Math.pow(another.x - this.x, 2);
        dy = Math.pow(another.y - this.y, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    /**
     *
     * @param x -ek puntu baten x posizioa jasoko du.
     * @param y -ek puntu baten y posizioa jasoko du.
     * @return -ek puntuaren distantzia jatorriko koordenadekiko distantzia
     * kalkulatu eta itzuli egingo du.
     */
    public double distance(int x, int y) {
        double dx, dy, d;

        dx = Math.pow(x - 0, 2);
        dy = Math.pow(y - 0, 2);

        d = Math.sqrt(dx + dy);

        return d;
    }

    /**
     *
     * @return -ek puntu baten x posizioa itzuliko du.
     */
    public int getX() {
        return x;
    }

    /**
     *
     * @return -ek puntu baten y posizioa itzuliko du.
     */
    public int getY() {
        return y;
    }

    /**
     *
     * @return -ek puntu baten x eta y posizioa itzuliko du array batean.
     */
    public int[] getXY() {
        int[] XY = {x, y};
        return XY;
    }

    /**
     *
     * @param x -ek puntu baten x posizioa aldatuko du.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     *
     * @param y -ek puntu baten y posizioa aldatuko du.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     *
     * @param x -ek puntu baten x posizioa aldatuko du.
     * @param y -ek puntu baten y posizioa aldatuko du.
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     *
     * @return -ek puntuaren koordenadak itzuliko ditu String baten bidez.
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }

}
