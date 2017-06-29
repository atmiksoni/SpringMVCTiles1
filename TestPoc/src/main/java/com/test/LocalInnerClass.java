package com.test;

/**
 * Created by soniiatm on 5/18/2017.
 */
public class LocalInnerClass {

    public void display(){

        class Local{
            public void msg(){
                System.out.println("Inside Local class");
            }
        }
        Local local = new Local();
        local.msg();
    }

}
