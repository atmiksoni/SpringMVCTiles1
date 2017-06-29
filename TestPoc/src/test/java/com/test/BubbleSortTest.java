package com.test;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by soniiatm on 5/19/2017.
 */
public class BubbleSortTest {

    @Test
    public void testBubbleSort(){
         int [] inputArray ={10,9,8,4,6,0,-5};
         BubbleSort bubbleSort = new BubbleSort();
         bubbleSort.bubbleSort(inputArray);
        // bubbleSort.printSortedArray(inputArray);
    }

}