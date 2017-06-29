package com.test;

/**
 * Created by soniiatm on 6/5/2017.
 */
public class TwoSum {


    public static int[] findTwoSum(int[] list, int sum) {
            int[] temp = new int[2];
            for (int i = 0; i < list.length-1; i++) {

                for (int j = 1; j < list.length-2 ; j++) {
                    if ((list[i] + list[j]) == sum) {
                        temp[0] = i;
                        temp[1] = j;
                    }
                }


            }
            if(temp[1] == 0){
                return null;
            }
            return temp;
        }




    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}