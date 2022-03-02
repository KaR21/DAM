package model;

/**
 *
 * @author elorza.karmele
 */
/**
 *
 * MyTriangle klasea triangeluen kudeaketa burutuko duen klasea izango da.
 */
public class MyTriangle {

    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    /**
     *
     * MyTriangle klasea triangeluen kudeaketa burutuko duen klasea izango da.
     * @param x1 aldagaiak triangeluaren lehenengo puntuaren x posizioa izango du bertan.
     * @param y1 aldagaiak triangeluaren lehenengo puntuaren y posizioa izango du bertan.
     * @param x2 aldagaiak triangeluaren bigarrengo puntuaren x posizioa izango du bertan.
     * @param y2 aldagaiak triangeluaren bigarrengo puntuaren y posizioa izango du bertan.
     * @param x3 aldagaiak triangeluaren hirugarrengo puntuaren x posizioa izango du bertan.
     * @param y3 aldagaiak triangeluaren hirugarrengo puntuaren y posizioa izango du bertan.
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }
    
    /**
     * 
     * @param v1 triangeluaren lehenengo puntua izango da.
     * @param v2 triangeluaren bigarrengo puntua izango da.
     * @param v3 triangeluaren hirugarrengo puntua izango da.
     */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     * 
     * @return -ek triangeluaren perimetroa kalkulatuta bidaliko du.
     */
    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    /**
     * 
     * @return -ek triangelu tipoa bidaliko du String batean. Tipoa aldekidea, isoszelea edo eskalenoa izango da.
     */
    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v1.distance(v3);
        double d3 = v2.distance(v3);

        if (d1 == d2 && d2 == d3) {
            return "Aldekidea";
        } else if (d1 == d2 || d1 == d3 || d2 == d3) {
            return "Isoszelea";
        }
        return "Eskalenoa";
    }

    /**
     * 
     * @return triangeluaren puntuak String batean itzuliko ditu.
     */
    @Override
    public String toString() {
        return "Triangle{" + "v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + '}';
    }

    /**
     * 
     * @return -ek triangeluaren lehen puntua itzuliko du.
     */
    public MyPoint getV1() {
        return v1;
    }

    /**
     * 
     * @return -ek triangeluaren bigarren puntua itzuliko du.
     */
    public MyPoint getV2() {
        return v2;
    }

    /**
     * 
     * @return -ek triangeluaren hirugarren puntua itzuliko du.
     */
    public MyPoint getV3() {
        return v3;
    }

    /**
     * 
     * @param v1 -ek triangeluaren lehen puntua aldatuko du.
     */
    public void setV1(MyPoint v1) {
        this.v1 = v1;
    }

    /**
     * 
     * @param v2 -ek triangeluaren bigarren puntua aldatuko du.
     */
    public void setV2(MyPoint v2) {
        this.v2 = v2;
    }

    /**
     * 
     * @param v3 -ek triangeluaren hirugarren puntua aldatuko du.
     */
    public void setV3(MyPoint v3) {
        this.v3 = v3;
    }
}
