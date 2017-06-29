package com.test;

/**
 * Created by soniiatm on 5/23/2017.
 */
public class PlindromeTest {

    public static String reverseString(String inputString){
        String revereString ="";
        if(null != inputString && inputString.length() >1 ){
            for (int i = inputString.length()-1; i >=0; i--) {
                revereString = revereString + inputString.charAt(i)  ;
            }
            return  revereString;
        }
        return inputString;
    }

    public static boolean isPalindrome(String inputString){
         if(null != inputString){
             String reversString = reverseString(inputString);
             return inputString.equalsIgnoreCase(reversString);
         }
            return true;
    }

    public static void main(String[] args) {
        String inputString ="ATMIK";
        System.out.println("Input String::"+inputString);
        boolean palindrome  = isPalindrome(inputString);
        System.out.println("Revers String::"+palindrome);
    }
}
