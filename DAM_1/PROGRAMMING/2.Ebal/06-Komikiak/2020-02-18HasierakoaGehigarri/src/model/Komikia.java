/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author elorza.karmele
 */
public class Komikia extends Book{

      private boolean kolorea;

      public Komikia(boolean kolorea, String name, Author author, double price, int pages) {
            super(name, author, price, pages);
            this.kolorea = kolorea;
      }

      public Komikia(boolean kolorea, String name, Author author, double price, int pages, Hizkuntza hizkuntza) {
            super(name, author, price, pages, hizkuntza);
            this.kolorea = kolorea;
      }

      public boolean isKolorea() {
            return kolorea;
      }

      
      public void setKolorea(boolean kolorea) {
            this.kolorea = kolorea;
      }

      @Override
      public String getNolakoa() {
            if (kolorea == false) {
                  return "Txuri-beltza";
            } else {
                  return "Koloretakoa";
            }
      }

      @Override
      public String toString() {
            return "[Komikia] " + super.toString(); 
      }

      @Override
      public void argitaratu() {
            System.out.printf("[Komikia] ");
            super.argitaratu(); 
      }

}
