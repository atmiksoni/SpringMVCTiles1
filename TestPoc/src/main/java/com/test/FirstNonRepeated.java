package com.test;

import java.util.*;

/**
 * Created by soniiatm on 6/1/2017.
 */
public class FirstNonRepeated {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to find non repeated Chaacter::");
        String inputString  = scanner.nextLine();
        Map<Character,Integer> map = findNonRepeatedChar(inputString);
        Set<Map.Entry<Character ,Integer>> set = map.entrySet();

        char c = getFirstNonRepetedChar(inputString, map);
        System.out.println("Non Repeated first char::"+c);

    }

    private static char getFirstNonRepetedChar(String inputString, Map<Character, Integer> map) {
        for (int i =0 ; i < inputString.length() ; i++ )
        {
            char c= inputString.charAt(i);
            if( map.get(c)  == 1 )
                return c;
        }
        return 0;
    }

    private static Map<Character, Integer> findNonRepeatedChar(String inputString) {

        Map<Character ,Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i <inputString.length() ; i++) {

            if(map.containsKey(inputString.charAt(i))){
               int counter = map.get(inputString.charAt(i));
               counter ++;
               map.put(inputString.charAt(i),counter);
            }else{
                map.put(inputString.charAt(i),1);
            }

        }
        return  map;
    }



}
