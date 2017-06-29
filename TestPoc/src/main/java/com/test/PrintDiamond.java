package com.test;

/**
 * Created by soniiatm on 6/3/2017.
 */
public class PrintDiamond {


    public static void printDiamondPattern(int n){

        for (int i = 1; i < n ; i+=2) {

            for (int j = 0; j < (n-1 -i)/2 ; j++) {
                System.out.print(" ");
            }

            for(int j =0; j<i; j++){
                System.out.print("*");
            }
         System.out.println();
        }

        for (int i = n-3; i > 0 ; i-=2) {

            for (int j = 0; j < (n-1-i)/2 ; j++) {
                System.out.print(" ");
            }

            for(int j =0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printDiamondPattern(8);
    }
}
