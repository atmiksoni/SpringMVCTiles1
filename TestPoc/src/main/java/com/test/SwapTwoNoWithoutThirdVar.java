package com.test;

/**
 * Created by soniiatm on 5/26/2017.
 */
public class SwapTwoNoWithoutThirdVar {

    public static void main(String[] args) {
        int a =10;
        int b =20;
        a = a +b;   //30
        b =a-b;     //20
        a=a-b;      //10

    System.out.println("A::"+a+":::B::"+b);
    }
}
