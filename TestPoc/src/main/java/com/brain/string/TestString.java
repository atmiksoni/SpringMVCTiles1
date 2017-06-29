package com.brain.string;

public class TestString {

	public static void main(String[] args) {
		String s="atmik";
		String b=s;
		s=b.toUpperCase();
		System.out.println(b);
		
		String s1= "Hello,World";
		  s1.replace('o','U');
		  s1.toUpperCase();
		  System.out.println(s1.substring(7));
		  
		  System.out.format("%10.3f%n", Math.PI);
	}
}
