package com.city;

public class TestOverriding extends Parent {
	public static void display() {
		System.out.println("in child class");
	}
	
	public void  Test(){
		System.out.println("in child class");
	}
	public static void main(String[] args) {
		Parent pare=new TestOverriding();
		pare.display();
		pare.Test();
	}

}

class Parent {

	public static void display() {
		System.out.println("in Parent class");
	}

	
	public void  Test(){
		System.out.println("in Parent class");
	}
}
