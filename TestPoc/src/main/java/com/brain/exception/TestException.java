package com.brain.exception;



public class TestException {
	synchronized void move() throws Exception, java.io.IOException {
	   // Additional code here
	  }
	
	public static void main(String[] args) {
		Float f=new Float(3.1);
		int i=1;
		long l=2;
		System.out.println("sd"+f+i+l);
		
		
		try {
			new TestException().move();
		} catch (  Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
