package com.brain;

public class TestOverLoad {
	
	public static void print(float a, double b) {
		System.out.println("1");
	}

	public static void print(double a, double b) {
		System.out.println("2");
	}

	public static void print(float a, int b) {
		System.out.println("3");
	}

	public static void print(float a, Double b) {
		System.out.println("4");
	}

	public static void print(double a, int b) {
		System.out.println("5");
	}

	public static void main(String args[]) {
		TestOverLoad.print(new Integer(2), 3);
	}
	
	public static void print(int a, int b) {
		System.out.println("6");
	}
	
	public static void print(Integer a, int b) {
		System.out.println("7");
	}
}
