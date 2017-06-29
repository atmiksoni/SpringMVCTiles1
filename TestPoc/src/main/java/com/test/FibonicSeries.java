package com.test;

/**
 * Created by soniiatm on 6/1/2017.
 */
public class FibonicSeries {



    public static  int fibnonic(int n){
        if (n == 1) {
            return 1;
        }
        else if(n==2){
            return 2;
        }
        else{
            return (fibnonic(n-1)+ fibnonic(n-2));
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++){
          System.out.println(fibnonic(i));
        }
    }
}
