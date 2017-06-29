package com.infosys.staircase;

import java.util.Scanner;

public class StrangeSolution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long size=in.nextInt();
		for (int i = 0; i < size; i++) {
			long d= in.nextLong();
			
			long n = in.nextLong();
			System.out.println(getStrangeMileStone(d,n));
			
		}
		

	}

	public static long getStrangeMileStone(long d, long n) {
		long count=0;
		for (long i = d+1; i < Long.MAX_VALUE; i++) {
			
			if(checkPalindrome(i))
			{
				count++;
			}
			if(count==n)
			{
				return i;
			}
		}
		

		return n;
	}

	public static boolean checkPalindrome(long n) {
		String str ="";


		long r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10; // getting remainder
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum){
			//System.out.println("palindrome number ");
			return true;
		}
		else{
			//System.out.println("not palindrome");
			return false;
		}
	}

}
