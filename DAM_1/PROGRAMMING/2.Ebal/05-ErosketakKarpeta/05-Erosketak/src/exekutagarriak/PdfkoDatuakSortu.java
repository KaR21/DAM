/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Bezeroa;
import model.Enpresa;
import model.Pertsona;
import model.Produktua;

/**
 *
 * @author elorza.karmele
 */
public class PdfkoDatuakSortu {
      public static void main(String[] args){
            String[] emailak = new String[2];
            
            emailak[0] = "idazkaria@uni.eus";
            emailak[1] = "zuzendaria@uni.eus";
            Bezeroa martin = new Pertsona(2, "Martin", "Berasategi", "Mirakontxa z/g DONOSTIA", "mbera@donostia.eus");
            Bezeroa karlos = new Pertsona(1, "Karlos", "Argiñano", "Hondartza pasealekua z/g ZARAUTZ", "kargi@zarautz.eus");
            Bezeroa UniEibarErmua = new Enpresa(3, "Uni Eibar-Ermua", "Uni", "Otaola Etorbidea 29 EIBAR", emailak);
            
            Produktua toshiba = new Produktua("C01", "Toshiba Satellite Pro", 450);
            Produktua pavilion = new Produktua("C02", "HP Pavilion", 600);
            Produktua samsung = new Produktua("T01", "Samsung Galaxy", 210);
            Produktua iPhoneXX = new Produktua("T02", "iPhone XX", 1300);  
      }
            
}
