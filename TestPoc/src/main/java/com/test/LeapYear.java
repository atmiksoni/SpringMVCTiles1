package com.test;

/**
 * Created by soniiatm on 6/3/2017.
 */
public class LeapYear {


    public static boolean doesLeapYear(int year){
        return ((year % 400 == 0) || (year % 100 !=0 && year %4 == 0));
    }

    public static void main(String[] args) {

        System.out.println("Year"+2000 + " :: Leap  Year:"+doesLeapYear(2000));

        System.out.println("Year"+1900 + " :: Leap  Year:"+doesLeapYear(1900));

    }
}
