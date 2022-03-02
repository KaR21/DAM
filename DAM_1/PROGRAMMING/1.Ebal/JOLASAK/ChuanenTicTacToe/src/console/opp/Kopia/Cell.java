/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.opp.Kopia;

/**
 * The Cell class models each individual cell of the game board.
 */
public class Cell {  // save as Cell.java
      // package access

      Seed content; // content of this cell of type Seed.
      // take a value of Seed.EMPTY, Seed.CROSS, or Seed.NOUGHT
      int row, col; // row and column of this cell, not used in this program

      /**
       * Constructor to initialize this cell
       */
      public Cell(int row, int col) {
            this.row = row;
            this.col = col;
            clear();  // clear content
      }

      /**
       * Clear the cell content to EMPTY
       */
      public void clear() {
            content = Seed.EMPTY;
      }

      /**
       * Paint itself
       */
      public void paint() {
            char o = '\u2B55', x = '\u274C';
            switch (content) {
                  case CROSS:
                        System.out.print(" " + x + " ");
                        break;
                  case NOUGHT:
                        System.out.print(" " + o + " ");
                        break;
                  case EMPTY:
                        System.out.print("   ");
                        break;
            }
      }
}
