
package model;

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
      public String toString() {
            return "altuera: " + altuera;
      }

      @Override
      public void marraztu() {
            System.out.println("Oinarria: " + Arrays.toString(this.getLauErpinenArraya()) + " eta " + this.toString());
            System.out.println("Kutxa GUI batean marraztua izan da.");
      }

      public boolean isHandiagoa(Kutxa besteKutxaBat) {
            double bolumena1,bolumena2; 
            
            bolumena1 = this.getBolumena();
            bolumena2 = besteKutxaBat.getBolumena();
            
            if(bolumena1 > bolumena2){
                  return true;
            }
            else{
                  return false;
            }
      }
      
      public double getBolumena() {
            double bolumena, a, b;
            a = this.getKontrakoErpina().getY() - this.getErpinBat().getY();
            b = this.getKontrakoErpina().getX() - this.getErpinBat().getX();
            bolumena = a * b* this.getAltuera();
            return bolumena;
      }
      public double getErtzenLuzera(){ /////___________________________________________________________?????
            return this.getY();
      }

}
