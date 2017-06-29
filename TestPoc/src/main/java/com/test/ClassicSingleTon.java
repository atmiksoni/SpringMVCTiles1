package com.test;

/**
 * Created by soniiatm on 5/23/2017.
 */
public class ClassicSingleTon {

    private static ClassicSingleTon classicSingleTon =null;

    private String name;

   private ClassicSingleTon(){
        //Exists only to defeat instantiation
    }

    public static ClassicSingleTon getInstance(){
       if(null == classicSingleTon){
           classicSingleTon = new ClassicSingleTon();
       }
       return  classicSingleTon;
    }

    public static void main(String[] args) {
        ClassicSingleTon classicSingleTon =  ClassicSingleTon.getInstance();
        classicSingleTon.name = "Atmik";

        ClassicSingleTon classicSingleTon1 =  ClassicSingleTon.getInstance();
        classicSingleTon1.name = "Soni";
        System.out.println("Name Before::"+classicSingleTon1.name);
        System.out.println("Name Before::"+classicSingleTon.name);

    }


}


