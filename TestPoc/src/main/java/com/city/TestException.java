package com.city;

public class TestException {

	public static void main(String[] args) {
		
		try{
			int a=args.length;
			int b=10/a;
			
			System.out.println(a);
			try{
			String c=args[1];
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.err.println("Array Bound");
			}
			
		}
		
		catch(ArithmeticException e){
			System.err.println("arith metic execptio");
		}
		
		
		
		
	}

}
