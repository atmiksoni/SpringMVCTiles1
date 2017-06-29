package com.techgig;

public class FindPeak {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 9, 4, 7 };
		System.out.println(getPeakNo(arr, 7));
	}

	public static int getPeakNo(int arr[], int size) {
		int peakElment = Integer.MAX_VALUE;
		if (size > 2) {
			for (int i = 1; i < size - 2; i++) {
				if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]
						&& arr[i] < peakElment) {
					peakElment = arr[i];
				}
			}

		} else if (peakElment == Integer.MAX_VALUE) {
			peakElment = -1;
		} else {
			peakElment = -1;
		}

		return peakElment;

	}

}
