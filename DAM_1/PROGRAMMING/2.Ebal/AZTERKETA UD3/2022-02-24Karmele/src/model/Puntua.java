
package model;

/**
 *
 * @author elorza.karmele
 */
public class Puntua implements Marrazgarria {

      private int x;
      private int y;
      private static int sortutakoPuntuak;

      public Puntua(int x, int y) {
            this.x = x;
            this.y = y;
            sortutakoPuntuak++;
      }

      public Puntua() {
            sortutakoPuntuak++;
      }

      public int getX() {
            return x;
      }

      public int getY() {
            return y;
      }

      public static int getSortutakoPuntuak() {
            return sortutakoPuntuak;
      }

      public void setX(int x) {
            this.x = x;
      }

      public void setY(int y) {
            this.y = y;
      }

      public boolean isEzkerragoThan(Puntua bestePuntuBat) {
            if (x > bestePuntuBat.getX()) {
                  return false;
            } else {
                  return true;
            }
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
            final Puntua other = (Puntua) obj;
            if (this.x != other.x) {
                  return false;
            }
            if (this.y != other.y) {
                  return false;
            }
            return true;
      }

      @Override
      public String toString() {
            return "(" + x + ", " + y + ")";
      }

      @Override
      public void marraztu() {
            System.out.println(this.toString() + " puntua GUI batean marraztua izan da.");
      }

}
