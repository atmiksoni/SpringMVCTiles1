package com.test;

/**
 * Created by soniiatm on 5/19/2017.
 */
public class BubbleSort {

    public int[] bubbleSort(int[] inputArray){
        if(inputArray != null && inputArray.length >1 ) {
            int maxLengh = inputArray.length;
            for (int i = 0; i <maxLengh; i++) {
                for (int j = 1; j < (maxLengh - i); j++) {
                    CheckAndSwapNumber(inputArray, j);
                }
            }

            printSortedArray(inputArray);
        }
        return inputArray;
    }

    private void CheckAndSwapNumber(int[] inputArray, int j) {
        if (inputArray[j-1] > inputArray[j]) {
            swapNumberInArray(j-1, j, inputArray);
        }
    }

    public void swapNumberInArray(int left , int right , int [] array){
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }

    public void printSortedArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array:["+i+"]"+"::"+array[i]);
        }
    }



}
