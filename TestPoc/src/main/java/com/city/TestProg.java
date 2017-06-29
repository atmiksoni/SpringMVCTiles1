package com.city;

public class TestProg {

	public static void main(String[] args) {
		BaseClass baseClass = new SuperClass();

	}
}

class BaseClass {

	private void display() {
		System.out.println("Base class");
	}

}

class SuperClass extends BaseClass {
	public void display() {
		System.out.println("super class");
	}
}