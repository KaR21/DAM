
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
            int bolumena1,bolumena2, a1,a2, b1,b2;
            
            a1 = this.getKontrakoErpina().getY() - this.getErpinBat().getY();
            a2 = besteKutxaBat.getKontrakoErpina().getY() - besteKutxaBat.getErpinBat().getY();
            
            b1 = this.getKontrakoErpina().getX() - this.getErpinBat().getX();
            b2 = besteKutxaBat.getKontrakoErpina().getX() - besteKutxaBat.getErpinBat().getX();

            bolumena1 = a1 * b1* this.getAltuera();
            bolumena2 = a2 * b2* besteKutxaBat.getAltuera();
            
            if(bolumena1 > bolumena2){
                  return true;
            }
            else{
                  return false;
            }
      }

}
