package com.city;

public class Test {

    public static void main(String[] args) {
        boolean a = false;

        int as = new Integer(18);
        if (a = true) {
            System.out.println("a");
        } else {
            System.out.println("b");
        }


        String str1 = "Atmik";
        String str2 = new String("Atmik");
        String str3 = str2.intern();
        System.out.println("str 3:::" + str3.equals(str2));
    }


}
