package com.test;

/**
 * Created by soniiatm on 5/16/2017.
 */
public class TestRecursive {

    public static void recursive(int n,int maxLen){
        if(n<= maxLen) {
            System.out.println(n);
            recursive(n+1,maxLen);
        }
    }

    public static void main(String[] args) {
       recursive(1,10);
    }
}
