package com.test;

import java.util.Arrays;

/**
 * Created by soniiatm on 6/2/2017.
 */
public class InsertionSort {

    public static int [] getRandomArray(int n){
        int a[] = new int[n];
        for (int i = 0; i < n ; i++) {
            a[i] =(int) (Math.random()*100);
        }
        return  a;
    }

    public  static int[] insertionSort(int [] inputArray){
        int numberToInsert =0;
        for (int i = 1; i < inputArray.length ; i++) {
            numberToInsert = inputArray[i];
            int compareIndex = i;
            while(compareIndex >0 && inputArray[compareIndex-1] >numberToInsert )  {
                inputArray[compareIndex] = inputArray[compareIndex -1];
                compareIndex --;
            }
                inputArray[compareIndex] = numberToInsert;
        }

        return  inputArray;
    }

    public static void main(String[] args) {
        int [] inputArray =  getRandomArray(10);
        System.out.println("Input to Array::"+ Arrays.toString(inputArray));
        int [] sortedArray = insertionSort(inputArray);
        System.out.println("Sorted Array::"+ Arrays.toString(sortedArray));


    }

}
