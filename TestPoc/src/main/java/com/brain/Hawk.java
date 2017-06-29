package com.brain;

public class Hawk extends Raptor {

	public static void main(String[] args) {
		System.out.println("In Hawk");
		new Hawk();
	}

	static  {
		System.out.println("H2");
	}

}

class Bird{
	{System.out.println("B1");}
	public Bird() {
		System.out.println("B2");
	}
	static{
		System.out.println("B3");
	}
}

class Raptor extends Bird{
	
	static{
		System.out.println("R1");
	}
	
	public Raptor() {
		System.out.println("R2");
	}
	
	static{
		System.out.println("R3");
	}
}
