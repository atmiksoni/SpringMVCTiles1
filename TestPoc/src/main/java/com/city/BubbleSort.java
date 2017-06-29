package com.city;

public class BubbleSort {

	public static int[] getSortedSet(int input[], boolean asc) {
		for (int i = 1; i < input.length; i++) {
			int noOfexchaneg=0;
			for (int j = 0; j < input.length - i; j++) {
			
				if (input[j] >= input[j + 1]) {
					swapData(input, j);
					noOfexchaneg++;
				}

			}

		}
		return input;
	}

	private static void swapData(int[] input, int j) {
		int tmp = input[j];
		input[j] = input[j+1];
		input[j+1]=tmp;
	}

	public static void main(String[] args) {
		int input[] = { 13, 3, 12, 5, 32, 4 };
		int output[] = getSortedSet(input, false);

		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}
