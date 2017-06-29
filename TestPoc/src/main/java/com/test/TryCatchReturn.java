package com.test;

import java.io.IOException;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class TryCatchReturn {

    int calc(){
        int i=5;
        try{
            System.out.println("in try block");
            throw  new IOException("Atmik");
        }
        catch (IOException e){
            System.out.println("In Catch Block IOExcpetion");
        }
         catch (Exception e) {
            System.out.println("In Catch Block Excpetion");
        }
        finally {
             i=6;
        }
             i =7;
        return  i;
    }

    public static void main(String[] args) {
       System.out.println(new TryCatchReturn().calc());
    }
}
