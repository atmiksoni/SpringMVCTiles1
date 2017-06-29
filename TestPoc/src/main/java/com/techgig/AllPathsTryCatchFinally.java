package com.techgig;

import java.util.Scanner;

/**
 * Created by soniiatm on 6/4/2017.
 */
public class AllPathsTryCatchFinally {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter input::");
       String testing=  m(scanner.nextInt());
    }

    static String m(int a) throws Exception {
        try {
            System.out.println("try ...");
            if (a/100 == 2) return "returned from try";
            if (a/100 == 3) throw new Exception("thrown by try");
            if (a/100 == 4) throw new RuntimeException("thrown by a try");
        } catch (RuntimeException x) {
            System.out.println("catch ...");
            if (a/10%10 == 2) return "returned from catch";
            if (a/10%10 == 3) throw new Exception("thrown by catch");
        } finally {
            System.out.println("finally");
            if (a%10 == 2) return "returned from finally";
            if (a%10 == 3) throw new Exception("thrown by finally");
        }
        return "terminated normally with " + a;
    }
}
