package com.techgig;

/**
 * Implement function countNumbers that accepts a sorted array of integers and counts the number of array elements that are less than the parameter lessThan.

 For example, SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4) should return 2 because there are two array elements less than 4.
 */
public class SortedSearch {

    public static int countNumbers(int[] sortedArray, int lessThan) {
        int count = 0;
        if(sortedArray == null || sortedArray.length == 0){
            return 0;
        }
        for (int i = 0; i < sortedArray.length; i++) {
            if(sortedArray[i] < lessThan){
                count = count +1;
            }else{
                break;
            }

        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3, 5, 7 }, 4));
    }


}
