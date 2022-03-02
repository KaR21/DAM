package model;

/**
 *
 * @author elorza.karmele
 */
/**
 *
 * MyCircle klasea zirkuluen kudeaketa burutuko duen klasea izango da.
 */
public class MyCircle {

    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {

    }

    /**
     *
     * @param x -ek zirkuluaren x posizio zentrala gordeko du.
     * @param y -ek zirkuluaren y posizio zentrala gordeko du.
     * @param radius -ek zirkuluaren erradioa gordeko du.
     */
    public MyCircle(int x, int y, int radius) {
        this.radius = radius;
        this.center.setXY(x, y);
    }

    /**
     *
     * @param center -ek zirkuluaren posizio zentrala gordeko du.
     * @param radius -ek zirkuluaren erradioa gordeko du.
     */
    public MyCircle(MyPoint center, int radius) {
        this.radius = radius;
        this.center = center;
    }

    /**
     *
     * @param another -ek beste zirkulu baten informazioa jasoko du.
     * @return -ek zirkulu baten eta beste zirkulu baten arteko distantzia
     * kalkulatu eta itzuli egingo du.
     */
    public double distance(MyCircle another) {
        double d;

        d = Math.sqrt((Math.pow(another.center.getX() - this.center.getX(), 2)) + (Math.pow(another.center.getY() - this.center.getY(), 2)));

        return d;
    }

    /**
     *
     * @param puntua -ek puntu baten informazioa jasokodu.
     * @return -ek puntua zirkuuaren barruandagoen edo ezitzuliko du boolean
     * aldagai baten bidez.
     */
    public boolean isInside(MyPoint puntua) {
        boolean barruan = false;
        if (puntua.distance() < radius) {
            barruan = true;
        }

        return barruan;
    }

    /**
     *
     * @return -ek zirkuluaren azalera kalkulatu eta itzultzen du.
     */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     *
     * @return -ek zirkuluaren zentrua itzultzen du.
     */
    public MyPoint getCenter() {
        return this.center;
    }

    /**
     *
     * @return -ek zirkuluaren zentruaren x posizioa itzultzen du.
     */
    public int getCenterX() {
        return this.center.getX();
    }

    /**
     *
     * @return -ek zirkuluaren zentruaren y posizioa itzultzen du.
     */
    public int getCenterY() {
        return this.center.getY();
    }

    /**
     *
     * @param x -ek zirkuluaren x posizio zentrala gordetzen du.
     * @param y -ek zirkuluaren y posizio zentrala gordetzen du. Lehendik zegoen
     * zentruaren x eta y koordenadak aldatzen ditu.
     */
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    /**
     *
     * @return -ek zirkuluaren zirkunferentzia kalkulatu eta itzultzen du.
     */
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    /**
     *
     * @return -ek zirkunferentziaren erradioa itzultzen du.
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param center -ek beste zirkuluaren zentroaren informazioa gordetzen du,
     * gure zirkuluaren zentrua aldatzeko.
     */
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    /**
     *
     * @param x -ek zirkuluaren zentruaren x posizioa aldatzen du.
     */
    public void setCenterX(int x) {
        this.center.setX(x);
    }

    /**
     *
     * @param y -ek zirkuluaren zentruaren x posizioa aldatzen du.
     */
    public void setCenterY(int y) {
        this.center.setY(y);
    }

    /**
     *
     * @param radius -ek zirkuluan lehendik zegoen erradioa aldatzen du.
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     *
     * @return -ek zirkuluaren zentruko koordenadak eta erradioa itzuliko ditu
     * String baten bidez.
     */
    @Override
    public String toString() {
        return "MyCircle{" + "center=" + center + ", radius=" + radius + '}';
    }

}
