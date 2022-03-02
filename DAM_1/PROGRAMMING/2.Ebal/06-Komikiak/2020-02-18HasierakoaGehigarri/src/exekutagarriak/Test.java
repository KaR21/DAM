/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import model.Author;
import model.Book;
import model.Hizkuntza;
import model.Komikia;

/**
 *
 * @author elorza.karmele
 */
public class Test {

      public static void main(String[] args) {
            Author autore1 = new Author("Agatha Christie", 'f');

            Book liburu1 = new Book("Harry Potter", autore1, 99.99, 2850, Hizkuntza.EUS);
            Book liburu2 = new Komikia(true, "Mortadelo y filemon", autore1, 99.99, 2850, Hizkuntza.ES);
            System.out.println(autore1);
            System.out.println(liburu1);
            System.out.println(liburu2);
            liburu1.argitaratu();
            liburu2.argitaratu();
            System.out.println("Orain arteko liburuak: " + Book.getArgitaratutakoLiburuak());
      }
}
