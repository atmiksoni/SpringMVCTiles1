package com.test;

/**
 * Created by soniiatm on 5/16/2017.
 */
public class TestPrimeNo {

    public static void main(String[] args) {
        printPrimeNumber(10);
    }

    public static void printPrimeNumber(int maxLengh) {
        int count = 0;
        for (int i = 2; i <= maxLengh; i++) {

            count = 0;

            for (int j = 2; j <= i / 2; j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }

            }

            if (count == 0) {
                System.out.println("Prime No::" + i);
            }
        }

    }
}
