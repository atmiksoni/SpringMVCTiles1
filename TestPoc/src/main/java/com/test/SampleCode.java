package com.test;

/**
 * Created by soniiatm on 5/30/2017.
 */
public class SampleCode {

    public static void main(String[] args) {
        String[] obj = new String[]{"a","b","c"};

        for(Object str: obj){
            System.out.println(str);
        }

        String fileContent ="";
        if(fileContent.contains("ABC")){
            System.out.println("Found String");
        }
    }
}
