package com.test;

/**
 * Created by soniiatm on 6/1/2017.
 */
public class ExtractNumerfromString {

    public static String extractNoFromString(String inputString){
        char[] ch = inputString.toCharArray();
        StringBuffer sb = new StringBuffer();

        for(char c :ch){

            if(!((c >= 'a'  && c <= 'z') || (c >= 'A'  && c <= 'Z') ) ){
                sb.append(c);
            }
        }

       return  sb.toString();
    }


    public static void main(String[] args) {

       String str = extractNoFromString("ATMIk123DREE45asss678$$$$%%%");

        for (int i = 0; i < str.length(); i++) {

        }
    }
}
