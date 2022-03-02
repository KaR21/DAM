/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console.opp.Kopia;

/**
 * The Board class models the game-board.
 */
import java.util.Scanner;

public class Board {  // save as Board.java
      // Named-constants for the dimensions

      public static Scanner in = new Scanner(System.in); // the input Scanner
      public static final int ROWS = in.nextInt();
      public static final int COLS = in.nextInt();

      // package access
      Cell[][] cells;  // a board composes of ROWS-by-COLS Cell instances
      int currentRow, currentCol;  // the current seed's row and column

      /**
       * Constructor to initialize the game board
       */
      public Board() {
            cells = new Cell[ROWS][COLS];  // allocate the array
            for (int row = 0; row < ROWS; ++row) {
                  for (int col = 0; col < COLS; ++col) {
                        cells[row][col] = new Cell(row, col); // allocate element of the array
                  }
            }
      }

      /**
       * Initialize (or re-initialize) the contents of the game board
       */
      public void init() {
            for (int row = 0; row < ROWS; ++row) {
                  for (int col = 0; col < COLS; ++col) {
                        cells[row][col].clear();  // clear the cell content
                  }
            }
      }

      /**
       * Return true if it is a draw (i.e., no more EMPTY cell)
       */
      public boolean isDraw() {
            for (int row = 0; row < ROWS; ++row) {
                  for (int col = 0; col < COLS; ++col) {
                        if (cells[row][col].content == Seed.EMPTY) {
                              return false; // an empty seed found, not a draw, exit
                        }
                  }
            }
            return true; // no empty cell, it's a draw
      }

      /**
       * Return true if the player with "theSeed" has won after placing at (currentRow, currentCol)
       */
      public boolean hasWon(Seed theSeed) { 
            if (egiaztatuDiagonalaEzk(theSeed) || egiaztatuDiagonalaEsk(theSeed) || egiaztatuZuzenaGB(theSeed) || egiaztatuZuzenaEE(theSeed)) {
                  return true;
            }
            return false;
      }

      /**
       * Paint itself
       */
      public void paint() {
            for (int row = 0; row < ROWS; ++row) {
                  for (int col = 0; col < COLS; ++col) {
                        cells[row][col].paint();   // each cell paints itself
                        if (col < COLS - 1) {
                              System.out.print("|");
                        }
                  }
                  System.out.println();
                  if (row < ROWS - 1) {
                        System.out.println("---------------------");
                  }
            }
      }

      public boolean egiaztatuDiagonalaEzk(Seed theSeed) {
            int diagonala = 0;
            for (int i = 0; i < COLS; i++) {
                  if (cells[i][i].content == theSeed) {
                        diagonala++;
                  }
                  if (diagonala == COLS) {
                        return true;
                  }
            }
            return false;

      }

      public boolean egiaztatuDiagonalaEsk(Seed theSeed) {
            int diagonala = 0, j = ROWS - 1;
            for (int i = 0; i < COLS; i++) {
                  if (cells[i][j].content == theSeed) {
                        diagonala++;
                  }
                  j--;
                  if (diagonala == COLS) {
                        return true;
                  }
            }
            return false;

      }

      public boolean egiaztatuZuzenaGB(Seed theSeed) {
            int wonornot = 0;
            for (int i = 0; i < ROWS; i++) {
                  for (int j = 0; j < ROWS; j++) {
                        if (cells[j][i].content == theSeed) {
                              wonornot++;
                        }
                        if(wonornot == ROWS){
                            return true;
                        }
                  }

            }
            return false;

      }

      public boolean egiaztatuZuzenaEE(Seed theSeed) {
            int wonornot = 0;
            for (int i = 0; i < ROWS; i++) {
                  for (int j = 0; j < ROWS; j++) {
                        if (cells[i][j].content == theSeed) {
                              wonornot++;
                        }
                        if(wonornot == ROWS){
                            return true;
                        }
                  }

            }
            return false;

      }
}


