package com.test;

/**
 * Created by soniiatm on 6/2/2017.
 */
public class BasicMatrix {

   public static void main(String args[]) {
       // initializing two dimensional array as literal
       String[][] names =
               {{"John", "Smith"},
                       {"Javin", "Paul"}, {"James", "Gosling"},};
       // how to initialize two dimensional array in Java
       // using for loop
       int[][] board = new int[3][3];
       for (int i = 0; i < board.length; i++) {
           for (int j = 0; j < board[i].length; j++) {
               board[i][j] = i + j;
           }
       } // now let's print a two dimensional array in Java
       for (int[] a : board) {
           for (int i : a) {
               System.out.print(i + "\t");
           }
           System.out.println("\n");
       }

   // printing 2D array using
      // Arrays.deepToString()
       System.out.println("another way to print 2D arrays");
     //  System.out.println(Arrays.deepToString(board));

   }

}
