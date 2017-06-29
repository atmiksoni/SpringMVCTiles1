package com.city;

public class TestOverLoding {

	public static void main(String[] args) {
		Animal a =new Horse();
		a.eat(a);
	}

}


class Animal{
	static void sleep(){
		System.out.println("eat method of Animal is called");
		
	}
	
	public void  eat(Animal a){
		System.out.println("eat method of Animal is called");
	}
}

class Horse extends Animal
{
	static void sleep(){
		System.out.println("eat method of Animal is called");
		
	}

	public void eat(Horse a) {
		System.out.println("eat method of horse is called");
	}
}