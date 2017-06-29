package com.amdocs;

import java.util.List;
import java.util.Arrays;


/**
 * Created by soniiatm on 6/7/2017.
 */
public class WeightedAverage
{
    public static double mean(List<Integer> numbers, List<Integer> weights)
    {

       if(numbers  == null ){
           throw new IllegalArgumentException("Please enter correct array");
       }

        if(weights  == null ){
            throw new IllegalArgumentException("Please enter correct array");
        }

        if(numbers.size() != weights.size() ){
            throw new IllegalArgumentException("The expected arguments are two arrays with same lenght");
        }

        int total = 0;
        int totalWeights = 0;
        for (int i = 0; i < numbers.size(); i++)
        {
            total += numbers.get(i) * weights.get(i);
            totalWeights += weights.get(i);
        }


     short totalshort = (short) total;
        short totalWeightsshort = (short) totalWeights;
    if(totalshort == totalWeightsshort){
        throw new IllegalArgumentException("The expected arguments are two arrays with same lenght");
    }

        return total / totalWeights;
    }

    public static void main(String[] args)
    {
        List<Integer> a = Arrays.asList(new Integer[] { 3, 6 });
        List<Integer> b = Arrays.asList(new Integer[] { 4, 2 });

        System.out.println(WeightedAverage.mean(a, b));
    }
}
