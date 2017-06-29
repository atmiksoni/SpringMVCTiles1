package com.test;

/**
 * Created by soniiatm on 6/1/2017.
 */
public class TestStringBuffer {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = sb1;
        sb1.append("d");
        System.out.println("sb1:"+sb1+":sb2:"+sb2+"::"+(sb1==sb2));
    }
}
