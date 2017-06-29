package com.test;

/**
 * Created by soniiatm on 5/17/2017.
 */
public class TestReversString {

    public static String reverseString(String inputString){

        if(null != inputString & inputString.length() >1){
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = inputString.length()-1; i >=0; i--) {
                stringBuilder.append(inputString.charAt(i));
            }
            return  stringBuilder.toString();
        }
    return  inputString;
    }

    public static void main(String[] args) {
                System.out.println(reverseString("Atmik"));
    }
}
