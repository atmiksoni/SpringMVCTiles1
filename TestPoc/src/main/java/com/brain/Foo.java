package com.brain;

public class Foo {

	
	 volatile Integer  x;
	public static  void update(Integer i){
		try{
		i=new Integer(20);
		}
		finally{
			i=new Integer(30);
		}
	}
	
	public static void main(String[] args) {
		 new Foo().x =new Integer(10);
		update(new Foo().x);
		System.out.println(new Foo().x);
	}
	
}
