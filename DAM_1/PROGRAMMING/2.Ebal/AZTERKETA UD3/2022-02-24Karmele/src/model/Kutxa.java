package model;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author elorza.karmele
 */
public class Kutxa extends Laukizuzena {

      private int altuera;

      public Kutxa(Puntua erpinBat, Puntua kontrakoErpina, int altuera) {
            super(erpinBat, kontrakoErpina);
            this.altuera = altuera;
      }

      public int getAltuera() {
            return altuera;
      }


      @Override
      public void marraztu(Graphics g) {
            g.setColor(Color.blue);
            g.fill3DRect(this.getLauErpinenArrayLista().get(0).getX(), this.getLauErpinenArrayLista().get(0).getY(), this.getLauErpinenArrayLista().get(1).getX(), this.getLauErpinenArrayLista().get(1).getY(), true);
            System.out.println("Oinarria: " + Arrays.toString(this.getLauErpinenArraya()) + " eta " + this.toString());
            System.out.println("Kutxa GUI batean marraztua izan da.");
      }

      public boolean isHandiagoa(Kutxa besteKutxaBat) {
            double bolumena1, bolumena2;

            bolumena1 = this.getBolumena();
            bolumena2 = besteKutxaBat.getBolumena();

            if (bolumena1 > bolumena2) {
                  return true;
            } else {
                  return false;
            }
      }

      public double getBolumena() {
            double bolumena, a, b;
            a = Math.abs(this.getKontrakoErpina().getY() - this.getErpinBat().getY());
            b = Math.abs(this.getKontrakoErpina().getX() - this.getErpinBat().getX());
            bolumena = a * b * this.getAltuera();
            return bolumena;
      }

      public double[] getErtzenLuzera() {
            double[] ertzak = new double[2]; 
            ertzak[0] = Math.abs(this.getErpinBat().getY() - this.getKontrakoErpina().getY());
            ertzak[1] = Math.abs(this.getErpinBat().getX() - this.getKontrakoErpina().getX());
            return ertzak;
      }

      public static Kutxa handiena(ArrayList<Kutxa> kutxak) {
            Kutxa kutxaHandiena = kutxak.get(0);
            for (int i = 0; i < kutxak.size(); i++) {
                  if (kutxak.get(i).getBolumena() > kutxaHandiena.getBolumena()) {
                        kutxaHandiena = kutxak.get(i);
                  }
            }

            return kutxaHandiena;
      } 
}
