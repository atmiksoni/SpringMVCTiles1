package com.test;

/**
 * Created by soniiatm on 6/2/2017.
 */
public class PaddingExample {

    public static void main(String[] args) {

        System.out.println(paddedString(9));

    }


    public static String paddedString(int n){
        return String.format("%04d",n);
    }
}
