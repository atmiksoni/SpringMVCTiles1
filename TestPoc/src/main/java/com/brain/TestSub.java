package com.brain;

public class TestSub {
	public static void main(String[] args) {
		SuperClass superClass=new SubClass();
		superClass.printIt();
		superClass.printIt(false);

	}

}

class SuperClass {
	public void printIt() {
		System.out.println("SuperClass");
	}

	public void printIt(boolean print) {
		if (print) {
			System.out.println("Super-part 2");
		} else {
			printIt();
		}
	}
}

class SubClass extends SuperClass {
	public void printIt() {
		System.out.println("SubClass");
	}
}