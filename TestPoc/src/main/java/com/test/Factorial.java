package com.test;

import java.util.Collections;

/**
 * Created by soniiatm on 5/29/2017.
 */
public class Factorial {

    public static  long factorial(long n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial::"+factorial(0));
        System.out.println("Factorial::"+factorial(1));
        System.out.println("Factorial::"+factorial(2));
        System.out.println("Factorial::"+factorial(3));
        System.out.println("Factorial::"+factorial(4));

    }
}
