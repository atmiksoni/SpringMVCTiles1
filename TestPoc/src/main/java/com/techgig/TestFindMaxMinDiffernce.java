package com.techgig;

import java.util.Arrays;

public class TestFindMaxMinDiffernce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={10,2,44,15,39,20};
		System.out.println(new TestFindMaxMinDiffernce().solution(a));

	}
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
		// sorting array
		   Arrays.sort(A);
		   return A[A.length-1]-A[0];
	    }

}
