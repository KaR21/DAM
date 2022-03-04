package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author elorza.karmele
 */
public class Laukizuzena extends Puntua implements Marrazgarria {

      private Puntua erpinBat;
      private Puntua kontrakoErpina;

      public Laukizuzena(Puntua erpinBat, Puntua kontrakoErpina) {
            this.erpinBat = erpinBat;
            this.kontrakoErpina = kontrakoErpina;
      }

      public Laukizuzena(int x1, int y1, int x2, int y2) {
            this.erpinBat = new Puntua(x1, y1);
            this.kontrakoErpina = new Puntua(x2, y2);
      }

      public Puntua getErpinBat() {
            return erpinBat;
      }

      public Puntua getKontrakoErpina() {
            return kontrakoErpina;
      }

      public Puntua[] getLauErpinenArraya() {
            Puntua[] arraya = new Puntua[4];

            arraya[0] = this.getErpinBat();
            arraya[1] = new Puntua(this.getKontrakoErpina().getX(), this.getErpinBat().getY());
            arraya[2] = this.getKontrakoErpina();
            arraya[3] = new Puntua(this.getErpinBat().getX(), this.getKontrakoErpina().getY());

            return arraya;
      }

      public ArrayList<Puntua> getLauErpinenArrayLista() {
            ArrayList arraya = new ArrayList<Puntua>();

            arraya.add(this.getErpinBat());
            arraya.add(new Puntua(this.getKontrakoErpina().getX(), this.getErpinBat().getY()));
            arraya.add(this.getKontrakoErpina());
            arraya.add(new Puntua(this.getErpinBat().getX(), this.getKontrakoErpina().getY()));

            return arraya;
      }

      @Override
      public String toString() {
            return " " + Arrays.toString(this.getLauErpinenArraya());
      }

      @Override
      public void marraztu(Graphics g) {
            g.setColor(Color.green);
            g.fillRect(this.erpinBat.getX(), this.erpinBat.getY(), this.kontrakoErpina.getX(), this.kontrakoErpina.getY());
            System.out.println(this.toString() + " laukizuzena GUI batean marraztua izan da.");
      }

      public boolean isInside(Puntua puntuBat) {
            boolean barruan = false;
            if ((puntuBat.getX() >= this.getErpinBat().getX() && puntuBat.getX() <= this.getKontrakoErpina().getX()) && (puntuBat.getY() >= this.getErpinBat().getY() && puntuBat.getY() <= this.getKontrakoErpina().getY())) {
                  barruan = true;
            }

            return barruan;
      }

      public void jiratu(Graphics g) {
            System.out.println("Norantz jiratu nahi duzu?");
            Scanner in = new Scanner(System.in);
            String jiratu = in.next();
            
            if (jiratu == "ezkerrera") {
                  this.setX(this.getX() - 90);
            } else if (jiratu == "eskuinera") {
                  this.setX(this.getX() + 90);
            } else if (jiratu == "behera") {
                  this.setY(this.getY() - 90);
            } else if (jiratu == "gora") {
                  this.setY(this.getY() + 90);
            }
      }
}