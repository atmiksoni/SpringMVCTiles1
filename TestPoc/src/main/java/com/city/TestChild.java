package com.city;

public class TestChild extends TestParent {

	public static void main(String[] args) {
		TestChild test=new TestChild();
		TestParent testParent=new TestParent();
	}

	public TestChild() {
		System.out.println("in test child const");
	}

	static {
		System.out.println("in test child static block");
	}
}

class TestParent {
	public TestParent() {
		System.out.println("in test parent const");
	}

	static {
		System.out.println("in test parent static block");
	}
}