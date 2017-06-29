package com.test;

/**
 * Created by soniiatm on 5/26/2017.
 */
public class TestBoolean {

    boolean testFlag ;
    String str;

    public   void display(){
        if(testFlag=true){
            System.out.println("Test Flag is True");
        }

        System.out.println("Test Flag Value::"+testFlag);
        if(testFlag){
            System.out.println("Flag is Become true");
        }

    }

    public static void main(String[] args) {
        new TestBoolean().display();
    }
}
