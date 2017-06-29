package com.techgig;

/**
 * Created by soniiatm on 6/4/2017.
 */
public class LexicographicExample {

    static boolean sorted(String[] a) {
        for(int i = 1; i < a.length; i++)
            if (a[i-1].compareTo(a[i]) > 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        String[] s = {"atmik", "something", "verbose"};
        System.out.print(LexicographicExample.sorted(s));
    }

}
