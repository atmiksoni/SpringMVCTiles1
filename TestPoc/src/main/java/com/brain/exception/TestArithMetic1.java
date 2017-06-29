package com.brain.exception;

public class TestArithMetic1 {
	
	public double squareRoot(double value) throws ArithmeticException {
	    if (value >=0) return Math.sqrt(value);
	    else throw new ArithmeticException();
	  }

	  public double func(int x) {
	    double y = (double) x;
	   y *= -9.0;
	    try {
	   y = squareRoot( y );
	    } catch(ArithmeticException e) {
	   y /= 3;
	    } finally { y += 10;
	    	//--y;
	    }
	   return y;
	  }
	  
	  public static void main(String[] args) {
		double d=new TestArithMetic1().func(9);
		System.out.println(d);
	}
	  
	  
	  public final synchronized void foo(){
		  
	  }

}
