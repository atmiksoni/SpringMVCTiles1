package com.test;

/**
 * Created by soniiatm on 5/18/2017.
 */
public class StaticInnerClasss {

    private static  int data =20;

    static class  InnerClass1{
        void msg(){
            System.out.println("in static inner class :: data is "+data);
        }

    }

}
