package com.tieto;

public class TestReference {
	int i = 0;

	public static void main(String[] args) {
		TestReference testReference=new TestReference();
		testReference.i = 10;
		new Utility().expec(testReference);
		System.out.println("value of i::"+testReference.i);

	}

	public void display() {
		
	}

}

class Utility {

	public void expec(TestReference t) {

		t.i = t.i + 10;
	}

}
