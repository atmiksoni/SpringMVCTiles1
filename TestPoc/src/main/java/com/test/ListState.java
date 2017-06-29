package com.test;

/**
 * Created by soniiatm on 5/30/2017.
 */
public class ListState {

     enum State{MADRAS, GUJARAT,BANGLORE};



    public  static void testInt(Integer a){
        System.out.println("Integer Object");
    }

    public  static void testInt(int a){
        System.out.println("primitive int");
    }

    public  static void testInt(String a){
        System.out.println("String Object");
    }

    public void display() {
        ListState.State state = ListState.State.MADRAS;
    }

    public static void main(String[] args) {
        Short a =5;
        Integer b =3;
        String c =null;
        testInt(Integer.valueOf(a));
        testInt(b.intValue());
        testInt(c);
    }
}
