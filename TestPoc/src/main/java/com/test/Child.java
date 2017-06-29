package com.test;

public class Child extends Parent {

	@Override
	public void method2() {
		System.out.println("In chile class Method 2");

	}

	
	public static void main(String[] args) {
		Parent parent =new Child();
		parent.method1();
		Parent parent1 =new Child2();
		parent1.method1();
		Integer  amount = Integer.valueOf(null);
		System.out.println("Atmik");
	}
}
