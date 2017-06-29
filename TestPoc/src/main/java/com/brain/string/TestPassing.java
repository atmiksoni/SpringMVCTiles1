package com.brain.string;

public class TestPassing {

	private int value;

	public static void add(int a, int b) {
		a = a + b;
	}

	public void subtract (TestPassing tp, int b) {
		tp.value = tp.value - b;
		System.out.println("subtract::"+value);
	}

	public void setup(int value) {
		this.value = 5;
		System.out.println("SetUp::"+this.value);
	}

	public void run() {
		value = 2;
		setup(value);
		add(value, 5);
		subtract(this, 1);
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		new TestPassing().run();
		
		int a=5,b=7;
		  int c= a+=2*3+b--;
		  System.out.println("Value of C:::"+c);
	}
}
