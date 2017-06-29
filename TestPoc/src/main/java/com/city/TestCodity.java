package com.city;

public class TestCodity {

	public static void main(String[] args) {
		int A[]={-1,3,-4,5,1,-6,2,1};
		System.out.println(equi(A,8));

	}

	public static int equi(int arr[], int n) {
		if (n == 0)
			return -1;
		long sum = 0;
		int i;
		for (i = 0; i < n; i++)
			sum += (long) arr[i];
		System.out.println("Sum::"+sum);
		long sum_left = 0;
		for (i = 0; i < n; i++) {
			long sum_right = sum - sum_left - (long) arr[i];
			if (sum_left == sum_right){
				System.out.println("I::"+i);
				return i;
			}
			
			sum_left += (long) arr[i];
		}
		return -1;
	}

}
