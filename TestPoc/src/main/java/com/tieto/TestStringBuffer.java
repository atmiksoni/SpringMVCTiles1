package com.tieto;

public class TestStringBuffer {

	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		n_squares(1000);
		System.out.println(System.currentTimeMillis()-startTime);

	}
	
	public static String n_squares(int n) {
	    StringBuffer s = new StringBuffer("0");
	    int n_squared = n*n;
	    for (int i=0; i<n_squared; i++) {
	        s.append (", " + i);
	    }
	    return s.toString();
	}

}
