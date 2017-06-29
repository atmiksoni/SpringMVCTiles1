package com.test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by soniiatm on 5/29/2017.
 */
public class GenericExample {

    public static void main(String[] args) {

        Integer a[] ={5,4,3,2,1};
        String str[] ={"c","b","a"};
        Integer b[] = printAndReturn(a);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }
        System.out.println();
        String rstr[] = printAndReturn(str);
        for (int i = 0; i < rstr.length; i++) {
            System.out.print(rstr[i]);
        }
    }

    private static <T> T[] printAndReturn(T[] array){

        for (T a :array){
            System.out.printf("%s P:-->",a);

        }
        System.out.println();
        Arrays.sort(array);
      return array;
    }

}
