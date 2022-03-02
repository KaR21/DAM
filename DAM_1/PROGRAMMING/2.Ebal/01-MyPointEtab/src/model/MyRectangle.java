package model;

/**
 *
 * @author elorza.karmele
 */
/**
 *
 * MyRectangle klasea laukizuzenen kudeaketa burutuko duen klasea izango da.
 */
public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint bottonRightt;

    /**
     *
     * @param topLeft -ek laukizuzenaren goi-ezkerreko puntua gordeko du.
     * @param bottomRight -ek laukizuzenaren behe-eskuineko puntua gordeko du.
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.setTopLeft(topLeft);
        this.setBottonRightt(bottomRight);
    }

    /**
     *
     * @param topLeft -ek laukizuzenaren goi-ezkerreko puntua aldatuko du.
     */
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    /**
     *
     * @param bottonRightt -ek laukizuzenaren behe-eskuineko puntua aldatuko du.
     */
    public void setBottonRightt(MyPoint bottonRightt) {
        this.bottonRightt = bottonRightt;
    }

    /**
     *
     * @return -ek laukizuzenaren goi-ezkerreko puntua itzuliko du.
     */
    public MyPoint getTopLeft() {
        return topLeft;
    }

    /**
     *
     * @return -ek laukizuzenaren behe-eskuineko puntua itzuliko du.
     */
    public MyPoint getBottonRightt() {
        return bottonRightt;
    }

    /**
     *
     * @return -ek laukizuzenaren koordenadak((x1,y1) eta (x2,y2)) itzuliko ditu
     * String baten bidez.
     */
    @Override
    public String toString() {
        return "MyRectangle{" + "topLeft=" + topLeft + ", bottonRightt=" + bottonRightt + '}';
    }

    /**
     *
     * @return -ek laukizuzenaren perimetroa kalkulatu eta itzuli egingo du.
     */
    public double getPerimetroa() {
        double perimetroa, length, width;

        length = Math.abs(topLeft.getY() - bottonRightt.getY());
        width = Math.abs(topLeft.getX() - bottonRightt.getX());
        perimetroa = 2 * (width + length);

        return perimetroa;
    }

    /**
     *
     * @return -ek laukizuzenaren azalera kalkulatu eta itzuli egingo du.
     */
    public double getAzalera() {
        double azalera, length, width;

        length = Math.abs(topLeft.getY() - bottonRightt.getY());
        width = Math.abs(topLeft.getX() - bottonRightt.getX());
        azalera = width * length;

        return azalera;

    }
}
