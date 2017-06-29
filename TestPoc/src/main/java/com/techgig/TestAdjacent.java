package com.techgig;

import java.util.Arrays;

public class TestAdjacent {

	public static void main(String[] args) {
		int a[] = {0,3,3,7,5,3,11,1};
		System.out.println("value of a:" + solution(a));
	}

	public static int solution(int[] A) {
		// write your code in Java SE 8
		int MAX_VALUE = Integer.MAX_VALUE;
		int MIN_VALUE = 0;
		Arrays.sort(A);
		int tempMaxDiff = 0;
		for (int i = A.length - 1; i > 0; i--) {

			int temp = (A[i] - A[i - 1]);
			if (temp > tempMaxDiff)
				tempMaxDiff = temp;

		}
		if (tempMaxDiff > MAX_VALUE) {
			return -1;
		} else if (tempMaxDiff < MIN_VALUE) {
			return -2;
		} else {
			return tempMaxDiff;
		}

	}

	public int findMaxDifference(int left, int right) {
		return left - right;

	}
}
