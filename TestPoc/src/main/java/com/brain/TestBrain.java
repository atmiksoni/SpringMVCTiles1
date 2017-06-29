package com.brain;

public class TestBrain {

	
	public  static void main(String[] args) throws java.lang.Exception{
		/*double a=5.0;
		double b=4.99;
		System.out.println(a);
		System.out.println(Double.doubleToLongBits(b));
		System.out.println(a+b);*/
		
		int count=0; int i=0;
		do{
			count+=i;
			i++;
			if(i>5)break;
		}while (i<=4);
		System.out.println(count);
		System.out.println("ran");
		
		
	}
}
