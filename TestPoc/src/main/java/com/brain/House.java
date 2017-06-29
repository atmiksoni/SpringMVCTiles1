package com.brain;

public class House extends Building {

	public static void main(String[] args) throws Exception {
		Building b = new House();
	//	((House) b).overloaded();
		b.area();
		area();

	}

	public static void area(){
		s+="::House";
		System.out.println("House static method"+s);
	}
	
	@Override
	public void room() {
		System.out.println("In house");
		throw new RuntimeException("run tim ");
	}

	public void overloaded() {
		System.out.println("overloaded method");
	}

}

class Building {
	public static String s="";
	
	public static void area(){
		s+="Building";
		System.out.println("building static method");
	}

	public void room() throws Exception {
		System.out.println("in Building metod");
	}
}
