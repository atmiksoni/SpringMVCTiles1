package com.techgig;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class TestMain {
	public static void main(String[] args) {
		Integer inums[] = { 4, 8, 0, 6, 1 };
		Stats<Integer> iob = new Stats<Integer>(inums);
		int i = iob.getmax();
		System.out.println("Maximum value in integer array : " + i);

		Double dnums[] = { 7.1, 3.2, 9.1, 9.4, 5.5 };
		Stats<Double> dob = new Stats<Double>(dnums);
		double d = dob.getmax();
		System.out.println("Maximum value in double array : " + d);

		Float fnums[] = { 8.1f, 5.9f, 9.7f, 7.4f, 9.9f };
		Stats<Float> fob = new Stats<Float>(fnums);
		float f = fob.getmax();
		System.out.println("Maximum value in float array : " + f);

		String res = String.format("|%1$s|%1$15s|%1$-15s|", "Uthcode");
		System.out.println(res);

	}

}

class Stats<T extends Comparable<T>> {
	T[] t;

	public Stats(T[] i) {
		this.t = i;
	}

	public T getmax() {
		List<T> list = Arrays.asList(this.t);
		return Collections.max(list);

	}

}
