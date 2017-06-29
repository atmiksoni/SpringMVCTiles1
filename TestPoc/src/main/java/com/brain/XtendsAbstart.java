package com.brain;

public class XtendsAbstart {

	public static void main(String[] args) {
		TestAbs test = new TestAbs("Atmik") {
			@Override
			public void display() {
				System.out.println("in xtedn ");
			}

		};
	}
}
