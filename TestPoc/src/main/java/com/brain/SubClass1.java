package com.brain;

public class SubClass1 extends Superclass1 {
	public void method1() {
		super.method1(); // Invoke first superclass code
							// then do the subclass specific code
		System.out.println("Subclass Version");
	}
	
	public static void main(String[] args) {
		new SubClass1().method1();
	}
}