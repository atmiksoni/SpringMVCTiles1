package com.test;

import java.util.Scanner;

/**
 * Created by soniiatm on 5/16/2017.
 */
public class CheckEvenOrOdd {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Please enter number to check even or odd::: ");

        int n=in.nextInt();
        if(n%2==0){
            System.out.println(n+" is even number");
        } else{

            System.out.println(n+" is even number");
        }
    }

}
