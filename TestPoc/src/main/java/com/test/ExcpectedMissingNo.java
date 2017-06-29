package com.test;

/**
 * Created by soniiatm on 6/1/2017.
 */
public class ExcpectedMissingNo {

    public static int getMissingNo(int [] inputArray,  int totalCount){
        int expectedSum = (totalCount * (totalCount +1))/2;
        int temp =0;
        for(int a : inputArray){
            temp = temp +a;
        }

        return expectedSum -temp ;
    }

    public static void main(String[] args) {
        int [] inputArray = {1,2,4,3,6,7,8,9,10};
        System.out.println(getMissingNo(inputArray,10));

    }
}
