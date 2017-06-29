package com.brain;

public abstract class TestAbs {

	private String name;

	public TestAbs(String name) {
	
		this.name = name;
		System.out.println("name:: "+name);
	}
	public TestAbs() {
		System.out.println("in abstartct mehod");
	}
	

	public abstract void display();
	
	

	public void view() {
		System.out.println("Atmik");
	}

}
