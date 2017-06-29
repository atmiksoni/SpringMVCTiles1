package com.test;

/**
 * Created by soniiatm on 5/18/2017.
 */
public class TeamMemberOuter1 {
    private int data =20;

    public class InnerClass1{
        public void msg(){
            System.out.println("Inside inner class1::"+data);
        }

    }
}
