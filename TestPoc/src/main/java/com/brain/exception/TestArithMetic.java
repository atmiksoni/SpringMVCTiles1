package com.brain.exception;

public class TestArithMetic {
	
	
	public static void main(String[] args) {
		int i = 5;
		  if(i++ == 5|| false) {
		    System.out.println(i);
		    i+=i;
		    System.out.println(i);
		  }
		  System.out.println(i);

		
		
		
		double d;
		  try {
		    d = 0/0.0;
		  }catch(ArithmeticException ae) {
		    d = -2;
		  }
		  System.out.println(d);
	}
	

}
