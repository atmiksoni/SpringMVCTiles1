package com.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by soniiatm on 5/19/2017.
 */
public class PatternMatcher {


    public static void main(String[] args) {
      boolean isPatterMatched = PatternMatcher("abc","atmikabcsoniabc");
      System.out.println("IsPatternMatched::"+isPatterMatched);

    }

    private static boolean PatternMatcher(String patternToBeMatch, String inputString) {
        Pattern pattern =  Pattern.compile(patternToBeMatch);
        Matcher matcher = pattern.matcher(inputString);
        return matcher.matches();
    }

}
