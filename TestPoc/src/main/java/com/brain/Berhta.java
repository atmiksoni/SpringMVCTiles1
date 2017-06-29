package com.brain;

public class Berhta {

	public static void main(String[] args) {
		int a=1;boolean b=true; int arr[]={1,2,3};
		doStuff(arr);
	}

	static void doStuff(Object o) {
		System.out.println("-1-");
	}

	static void doStuff(String o) {
		System.out.println("-S1-");
	}
	static void doStuff(Object... o) {
		System.out.println("-2-");
	}

	static void doStuff(Integer o) {
		System.out.println("-3-");
	}

	static void doStuff(Integer... o) {
		System.out.println("-4-");
	}

}
