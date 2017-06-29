package com.test;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by soniiatm on 6/1/2017.
 */
public class AnagramExample {

    public static boolean isAnagram(String word , String anagram){
        char [] wordCh = word.toCharArray();
        char [] anaagragCh = anagram.toCharArray();
        Arrays.sort(wordCh);
        Arrays.sort(anaagragCh);
      return   Arrays.equals(wordCh,anaagragCh);
    }


    public static void main(String[] args) {

        System.out.println("Is string Anagram::"
                +isAnagram("atmik","kimta"));
    }
}
