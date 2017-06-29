package com.techgig;

/**
 * Created by soniiatm on 6/3/2017.
 */
public class FloydsTriangle {


    public static void printFloydsTriange(int n){
        int num =0;
        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print(num+"");
                num ++;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        printFloydsTriange(3);
    }
}
